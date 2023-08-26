package array5;

import java.util.Arrays;

public class Array5Test8 {
    /*
		array 과 result 을 비교해서 겹치는 값이 있으면 두배열 의 값들을 전부 0으로 변경
		조건) 겹치는 값이 여러개면 전부 0 으로 변경

		 array[][] = {
				{0 ,0 , 4},
				{0 ,0 , 0},
				{0 ,8 , 9},
		 };

		 result[] = {0, 0, 0, 0, 7};
	*/
    public static void main(String[] args) {
        int array[][] = {
                {1 ,3 , 4},
                {5 ,6 , 3},
                {6 ,8 , 9},
        };

        int result[] = {1, 5, 6, 3, 7};

        for(int i = 0; i < result.length; i++){
            int cnt = 0;
            for(int j = 0; j < array.length; j++){
                for(int k = 0; k < array[j].length; k++){
                    if(array[j][k] == result[i] && array[j][k] != 0){
                        cnt++;
                        array[j][k] = 0;
                    }
                }
            }
            if(cnt > 0){
                result[i] = 0;
            }
        }
        for(int[] item : array){
            System.out.println(Arrays.toString(item));
        }
        System.out.println();
        System.out.println(Arrays.toString(result));
    }
}
