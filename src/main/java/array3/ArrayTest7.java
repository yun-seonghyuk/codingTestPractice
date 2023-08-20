package array3;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest7 {
    /*
     * [max게임]
     *
     * 1. 가장 큰 값을 찾아 입력한다.
     * 2. 정답이면 해당 값을 0으로 변경한다.
     * 3. arr배열의 모든 값이 0으로 변경되면 프로그램은 종료된다.
     * 예)
     * 11, 87, 42, 100, 24
     * 입력 : 100
     *
     * 11, 87, 42, 0, 24
     * 입력 : 87
     *
     * 11, 0, 42, 0, 24
     * 입력 : 24 ==> 최대값이 아니므로 아무일안생김
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {11, 87, 42, 100, 24};
        int gameCnt = 0;
        System.out.println("[maxGame]");
        while (true) {
            System.out.println("가장 큰값을 입력해주세요.");
            System.out.println(Arrays.toString(arr));

            if(gameCnt == arr.length){
                System.out.println("게임 종료.");
                break;
            }
            int num = scan.nextInt();
            int max = 0;
            int maxIdx = -1;
            for(int i = 0 ; i < arr.length; i++){
                if(max < arr[i]){
                    max = arr[i];
                    maxIdx = i;
                }
            }
            if(max == num){
                System.out.println("정답 입니다.");
                arr[maxIdx] = 0;
                gameCnt++;
            } else {
                System.out.println("틀렸습니다.");
            }
        }

    }
}
