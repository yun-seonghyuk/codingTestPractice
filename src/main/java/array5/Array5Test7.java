package array5;

import java.util.Arrays;

public class Array5Test7 {
    /*
		 array , b , c 에 전부 있는 값을 result 에순차적으로  저장
		 예) 40, 50 이 전부 있으므로
		 result = {40,50,0,0};
	 */
    public static void main(String[] args) {
        int array[][] = {
                {10,20,30},
                {40,50,60},
                {70,80,90},
        };

        int b[] = {23,40,30,50};
        int c[] = {4,34,40,50};

        int result[] = new int[4];
        int idx = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                for(int k = 0; k < b.length; k++){
                    for(int a = 0; a < c.length; a++){
                        if(array[i][j] == b[k] && array[i][j] == c[a]){
                            result[idx++] = b[k];
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
