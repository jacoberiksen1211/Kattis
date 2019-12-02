import java.util.Scanner;

public class Above_Average {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int c = Integer.parseInt(scanner.nextLine());

        for(int i = 0;i < c; i++){//kigger hver case igennem
            String[] inputLine = scanner.nextLine().split(" ");
            int sum = 0;
            double average;
            double numberAbove=0;
            for (int j = 1; j < inputLine.length; j++) {
                sum += Integer.parseInt(inputLine[j]);
            }
            average = (double) sum/Integer.parseInt(inputLine[0]);
            for (int j = 1; j < inputLine.length; j++) {
                if(Integer.parseInt(inputLine[j])>average) {
                    numberAbove++;
                }
            }
            double percentAbove = (numberAbove / Integer.parseInt(inputLine[0])) *100;
            String format = String.format("%.3f",percentAbove);
            System.out.println(format+"%");
        }
    }

}
