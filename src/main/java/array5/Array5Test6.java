package array5;

import java.util.Arrays;

public class Array5Test6 {
    /*
		result 배열안 에 array 의 값이 있으면 result 배열안의 값들을 0으로 변경한다.
		예) result ==> {0,2,54,0,0};
	*/
    public static void main(String[] args) {
        int array[][] = {
                {10,20,30},
                {40,50,60},
                {70,80,90},
        };
        int result [] = {10,2,54,90,50};
        int idx = 0;

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(idx > result.length-1){
                    idx = 0;
                }
                if(result[idx] == array[i][j]){
                    result[idx] = 0;
                }
                idx++;
            }
        }
        System.out.println(Arrays.toString(result));

    }
}
