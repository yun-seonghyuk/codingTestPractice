package array2;

import java.util.Arrays;
import java.util.Random;

public class Array2Basic {

    /*
     * [문제]
     *    [4의 배수만 저장]
     * - 	[조건1] arr 배열에서 4의 배수만 골라 temp 배열에 저장
     * - 단! temp 의 길이를 4의 배수의 개수 만큼만 설정한다.
     * - 예) 4의배수 개수는 3개이므로 temp = new int[3];
     */

    public static void main(String[] args) {

        int[] arr = {44, 11, 29, 24, 76};
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 4 == 0){
                count++;
            }
        }

        int[] temp = new int[count];
        int idx = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 4 == 0){
                temp[idx++] = arr[i];
            }

        }
        System.out.println(Arrays.toString(temp));

        /*
		[셔플]
		 1) 인덱스 2개를 랜덤(0~5)으로 저장하고 각 인덱스의 값을 교환한다.
		 2) 위 1번을 10 번 반복하며 과정  출력
		예) 1 , 2 ==> {10,30,20,40,50,60};  // 20 과 30이 교환된다.
		예) 4 , 1 ==> {10,50,20,40,30,60};  // 50 과 30이 교환된다.
		예) 3 , 3 ==> {10,50,20,40,30,60}; // 같을땐 아무일도안생긴다.
		...
	*/

        Random ran = new Random();
//        int arr2[] = {10,20,30,40,50,60};
//        int index1 = 0;
//        int index2 = 0;
//
//        for(int i = 0; i < 10; i++){
//            index1 = ran.nextInt(6);
//            index2 = ran.nextInt(6);
//
//            int tmp = arr2[index1];
//            arr2[index1] = arr2[index2];
//            arr2[index2] = tmp;
//            System.out.println(Arrays.toString(arr2));
//
//        }


        boolean[] check = new boolean[5];
        int[] arr1 = new int[5];
        int i = 0;

        while(true){
            int r = ran.nextInt(5);
            if(i == arr1.length){
                break;
            }
            if(check[r] == false){
                check[r] = true;
                arr1[i] = r;
                i++;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
