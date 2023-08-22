package array4;

import java.util.Arrays;

public class ArrayCompare {
    /*
	 *  [문제] array 배열 안의 값들중에서 b배열의 값이 있으면
		     b와 array의 각각 겹치는값을  0으로 변경

		 [예]
		 	array[] = {0,0,30,40};
			   b[] = {0,3,0,50};

	 */
    public static void main(String[] args) {
        int array[] = {10,20,30,40};
        int b[] = {10,3,20,50};

        int cnt = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(array[i] == 0 || b[j] == 0){
                    continue;
                }
                if(array[i] == b[j]){
                    array[i] = 0;
                    b[j] = 0;
                    break;
                }
                cnt++;
            }
        }
        System.out.println(cnt);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(b));

    }

}
