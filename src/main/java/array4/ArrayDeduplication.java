package array4;

import java.util.Arrays;

public class ArrayDeduplication {
    /*
	 *  [문제] arr1 배열 안의 값들중에서 b배열의 값이 있으면
		      b와 arr1의 각각 겹치는값을  0으로 변경
		[조건] 겹치는 값이 여러개 있으면 전부 0으로 변경
		 예) arr1[] = {0,0,30,40,0};
		 예) b[] = {0,3,0,0,0,50};

	 */
    public static void main(String[] args) {
        int arr1[] = {10,20,30,40,20};
        int b[] = {10,3,20,10,20,50};
        int[] temp = b.clone();

        for(int i = 0; i < arr1.length; i++){
            int bNum = arr1[i];
            int arr1Num = temp[i];
            for(int j = 0; j < arr1.length; j++){
                if(bNum == b[j]){
                    b[j] = 0;
                }
                if(arr1Num == arr1[j]){
                    arr1[j] = 0;
                }
            }
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(b));


    }
}
