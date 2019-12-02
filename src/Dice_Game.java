import java.util.Scanner;

public class Dice_Game {
/*
linje 1 er gunnars to terninger. sample 1 har gunner to terninger med sider mellem 1 og 4 på begge terninger.
sample 3 har han en med sider mellem 2 og 5 og en med sider mellem 2 og 7. (altså 2,3,4,5 og 2,3,4,5,6,7 er mulige udfald.)
man skal output hvem der har størst chance for at slå højeste sum med to terninger.
input
sample 1
1 4 1 4
1 6 1 6
=emma
sample 2
1 8 1 8
1 10 2 5
=Tie
sample 3
2 5 2 7
1 5 2 5
=Gunnar
     */


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] gunnarStr = scanner.nextLine().split(" ");
        String[] emmaStr = scanner.nextLine().split(" ");
        double gunnarChance1;
        double gunnarChance2;
        double gunnarAvg;
        double emmaChance1;
        double emmaChance2;
        double emmaAvg;

        // beregner gunnar
        double tempSum = 0;
        double tempFacCount =  (Double.parseDouble(gunnarStr[1])- Double.parseDouble(gunnarStr[0])) + 1;

        for(int i = 0; i < tempFacCount; i++){
            tempSum += (Double.parseDouble(gunnarStr[0]) + i);
        }
        gunnarChance1 = tempSum / (tempFacCount);
        tempSum = 0;
        tempFacCount = (Double.parseDouble(gunnarStr[3])- Double.parseDouble(gunnarStr[2])) + 1;
        for(int i = 0; i < tempFacCount; i++){
            tempSum += (Double.parseDouble(gunnarStr[2]) + i);
        }
        gunnarChance2 = tempSum / (tempFacCount);
        gunnarAvg = (gunnarChance1 + gunnarChance2) / 2;

        //beregner emma
        tempSum = 0;
        tempFacCount =  (Double.parseDouble(emmaStr[1])- Double.parseDouble(emmaStr[0])) + 1;

        for(int i = 0; i < tempFacCount; i++){
            tempSum += (Double.parseDouble(emmaStr[0]) + i);
        }
        emmaChance1 = tempSum / (tempFacCount);
        tempSum = 0;
        tempFacCount = (Double.parseDouble(emmaStr[3])- Double.parseDouble(emmaStr[2])) + 1;
        for(int i = 0; i < tempFacCount; i++){
            tempSum += (Double.parseDouble(emmaStr[2]) + i);
        }
        emmaChance2 = tempSum / (tempFacCount);
        emmaAvg = (emmaChance1 + emmaChance2) / 2;

        //definerer output
        if(emmaAvg > gunnarAvg){
            System.out.println("Emma");
        }
        else if(gunnarAvg > emmaAvg){
            System.out.println("Gunnar");
        }
        else {
            System.out.println("Tie");
        }


    }
}

