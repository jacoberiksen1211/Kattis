import java.util.Scanner;

public class Game2048 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input;
        int[][] board = new int[4][4];
       // while(true) {
            //init board
            for (int i = 0; i < 4; i++) {
                input = scanner.nextLine().split(" ");
                for (int j = 0; j < 4; j++) {
                    board[i][j] = Integer.parseInt(input[j]);
                }
            }

            int way = scanner.nextInt();
            scanner.nextLine();
            int indexCheck;

            switch (way) {
                case 0: //left
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 3; j++) {
                            indexCheck = j + 1;
                            while ((board[i][indexCheck] == 0) && (indexCheck < 3)) {
                                indexCheck++;
                            }

                            if (board[i][j] == 0) {
                                board[i][j] = board[i][indexCheck];
                                board[i][indexCheck] = 0;
                                if ((board[i][j] != 0) && (j < 3)) {
                                    j--;
                                }

                            } else if (board[i][indexCheck] == board[i][j]) {
                                board[i][j] = board[i][j] * 2;
                                board[i][indexCheck] = 0;
                            }
                        }
                    }
                    break;
                case 1: //up
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 3; j++) {
                            indexCheck = j + 1;
                            while ((board[indexCheck][i] == 0) && (indexCheck < 3)) {
                                indexCheck++;
                            }

                            if (board[j][i] == 0) {
                                board[j][i] = board[indexCheck][i];
                                board[indexCheck][i] = 0;
                                if ((board[j][i] != 0) && (j < 3)) {
                                    j--;
                                }

                            } else if (board[indexCheck][i] == board[j][i]) {
                                board[j][i] = board[j][i] * 2;
                                board[indexCheck][i] = 0;
                            }
                        }
                    }
                    break;
                case 2: //right
                    for (int i = 0; i < 4; i++) {
                        for (int j = 3; j > 0; j--) {
                            indexCheck = j - 1;
                            while ((board[i][indexCheck] == 0) && (indexCheck > 0)) {
                                indexCheck--;
                            }
                            if (board[i][j] == 0) {
                                board[i][j] = board[i][indexCheck];
                                board[i][indexCheck] = 0;
                                if ((board[i][j] != 0) && (j > 0)) {
                                    j++;
                                }

                            } else if (board[i][indexCheck] == board[i][j]) {
                                board[i][j] = board[i][j] * 2;
                                board[i][indexCheck] = 0;
                            }
                        }
                    }
                    break;
                case 3: //down
                    for (int i = 0; i < 4; i++) {
                        for (int j = 3; j > 0; j--) {
                            indexCheck = j - 1;
                            while ((board[indexCheck][i] == 0) && (indexCheck > 0)) {
                                indexCheck--;
                            }

                            if (board[j][i] == 0) {
                                board[j][i] = board[indexCheck][i];
                                board[indexCheck][i] = 0;
                                if ((board[j][i] != 0) && (j > 0)) {
                                    j++;
                                }

                            } else if (board[indexCheck][i] == board[j][i]) {
                                board[j][i] = board[j][i] * 2;
                                board[indexCheck][i] = 0;
                            }
                        }
                    }
                    break;
            }
            //print board
            String out = "";
            for (int[] x : board) {
                for (int y :
                        x) {
                    out += y + " ";
                }
                out += "\n";
            }
            System.out.println(out);
        //}
    }
}
