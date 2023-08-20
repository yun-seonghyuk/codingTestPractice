package array2;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest4 {
    /*
	 *  [배열홀짝게임]
		 [1] arr 배열에 1~100사이의 랜덤값을 6개 저장한다.

		 [2] arr = {7,45,3,6,78,1}

		 [3] 배열의 값을  차례대로  출력한다. 그리고 선택보기를 출력한다.

		   [예] 첫번째 :   7  (1)홀 , (2)짝
		   [예] 두번째 :  45  (1)홀 , (2)짝

		 [4] 제시된문제가 홀수면 1  , 짝수면 2 를 선택한다.

		 [5] 6번 반복하고 정답갯수 출력한다.
	 */

    public static void main(String[] args) {
        int arr[] = new int[6];
        Random ran = new Random();
        Scanner scan = new Scanner(System.in);

        String[] number = {"첫번째","두번째","세번째","네번째","다섯번째","여섯번째"};
        int winCnt = 0;
        for(int i = 0; i < arr.length; i++){
            int r = ran.nextInt(100)+1;
            arr[i] = r;
            System.out.println("[예] "+(i+1)+"번째 : "+String.format("%3d",arr[i]) +"  (1)홀, (2)짝");
            int num = scan.nextInt();
            if(arr[i] % 2 == 0 && num == 2){
                winCnt++;
            } else if(arr[i] % 2 == 1 & num == 1){
                winCnt++;
            } else {
                System.out.println("틀렸습니다.");
            }
        }
        System.out.println("정답갯수 : "+winCnt);

    }
}
