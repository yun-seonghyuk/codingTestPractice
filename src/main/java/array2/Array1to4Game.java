package array2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array1to4Game {
    /*
     * [문제]
     *
     * [1to4 게임]
     *
     * [1] arr 배열에 1~4 사이의 숫자를 중복없이 저장한다.
     * [2] 사용자는 가장작은수1부터 순서대로 해당 방번호(인덱스)을 입력한다.
     * [3] 정답을 맞추면 해당 값은 9로 변경되어 모든 값이 9가 되면 게임은 종료된다.
     *
     * [예]
     *
     * 시작 : { 4 2 3 1 }
     *
     * 인덱스 입력 : 3  ==> { 4 2 3 9 } ==> 1은 가장작은수이므로 9로 변경한다.
     *
     * 인덱스 입력 : 0 ==>  { 4 2 3 9 }  ==> 4는 가장작은수가아니므로 변화가없다.
     *
     *
     */
    public static void main(String[] args) {
        int[] arr = new int[4];
        boolean[] check = new boolean[4];
        Random ran = new Random();
        Scanner scan = new Scanner(System.in);
        int idx = 0;
        while(true){
            int r = ran.nextInt(4)+1;
            if(idx == arr.length){
                break;
            }
            if(check[r-1] == false){
                check[r-1] = true;
                arr[idx] = r;
                idx++;
            }
        }
        System.out.println("MaxGame");
        int gameCnt = 0;

        while(true){
            System.out.println(Arrays.toString(arr));
            if(gameCnt == arr.length){
                System.out.println("게임 종료");
                break;
            }

            System.out.println("제일 작은 인덱스 입력 : ");

            int myIdx = scan.nextInt();
            if(myIdx < 0 || myIdx > arr.length){
                System.out.println("인덱스 범위를 벗어났습니다.");
            }

            int min = Integer.MAX_VALUE;
            int minIdx = -1;
            for(int i = 0; i < arr.length; i++){
                if(min > arr[i] ){
                    min = arr[i];
                    minIdx = i;
                    System.out.println(minIdx);
                }
            }
            if(minIdx == myIdx){
                arr[minIdx] = 9;
                gameCnt++;
            }else{
                System.out.println("틀렸습니다.");
            }
        }
    }
}
