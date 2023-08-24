package array4;

import java.util.Arrays;
import java.util.Scanner;

public class Array4TicTacToe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] tic = new int[9];

        ticTacToePrint(tic);

        int gameCnt = 0;
        while (true) {

            System.out.println("p1 입력 : ");
            int p1 = scan.nextInt();
            if(tic[p1] == 0){
                tic[p1] = 1;
                gameCnt++;
            } else if(tic[p1] != 0){
                System.out.println("이미 있는 자리입니다.");
                ticTacToePrint(tic);
                continue;
            }

            System.out.println(gameCnt);
            boolean p1Flag = ticTacToe(tic, 3, 1);

            ticTacToePrint(tic);

            if (p1Flag) {
                System.out.println("p1승리");
                break;
            }

            if (gameCnt == tic.length) {
                System.out.println("무승부");
                break;
            }

            System.out.println("p2 입력 : ");
            int p2 = scan.nextInt();

            if(tic[p2] == 0 ){
                tic[p2] = 2;
                gameCnt++;
            } else {
                System.out.println("이미 있는 자리입니다.");
                ticTacToePrint(tic);
                continue;
            }

            boolean p2Flag = ticTacToe(tic, 6, 2);

            ticTacToePrint(tic);

            if (p2Flag) {
                System.out.println("p2승리");
                break;
            }

            if (gameCnt == tic.length) {
                System.out.println("무승부");
                break;
            }

        }

    }

    private static boolean ticTacToe(int[] tic, int num, int player) {
        int with = 0;
        int height = 0;
        int[] withResult = new int[3];
        int[] heightResult = new int[3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(player == tic[with]){
                    withResult[i] += tic[with++];
                } else {
                    with++;
                }
                if(player == tic[height]){
                    heightResult[j] += tic[height++];
                } else {
                    height++;
                }
            }
        }

        boolean flag = false;

        if(tic[0] == player && tic[4] == player && tic[8] == player){
            flag = true;
        }
        if(tic[2] == player && tic[4] == player && tic[6] == player){
            flag = true;
        }

        for (int i = 0; i < 3; i++) {
            if (withResult[i] == num || heightResult[i] == num) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    private static void ticTacToePrint(int[] tic) {
        for (int i = 0; i < tic.length; i++) {
            System.out.print(tic[i] + " ");
            if (i % 3 == 2) {
                System.out.println();
            }
        }
    }

}
