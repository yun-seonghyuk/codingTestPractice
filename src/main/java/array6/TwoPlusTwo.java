package array6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoPlusTwo {
    /*
		 [1] arr 배열에서 숫자 2개씩 뽑아서 더한값을 차례대로 result 에 저장후출력
		 [2] 자기차례 인덱스의 값은  더하지않는다.
		  (1) [인덱스 0] 의값 2 + (1,3,4,1) ==> 2 + 1 , 2 + 3 , 2 + 4 , 2 + 1
		  (2) [인덱스 1] 의값 1 + (2,3,4,1) ==> 1 + 2 , 1 + 3 , 1 + 4 , 1 + 1
		  (3) [인덱스 2] 의값 3 + (2,1,4,1) ==> 3 + 2 , 3 + 1 , 3 + 4 , 3 + 1
		   ....
		 [추가 조건] result 에 저장된값들중 중복되는 값은 전부 삭제후 출력
	*/
    public static void main(String[] args) {
        int arr[]  = {2,1,3,4,1};

        int result [] = new int[100];


        int idx = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(i != j){
                    result[idx++] = arr[i] + arr[j];
                }
            }
        }
        int[] result2 = new int[idx];
        for(int i = 0; i < idx; i++){
           if(result[i] != 0){
               result2[i] = result[i];
           }
        }
        System.out.println(Arrays.toString(result2));
        int[] result3 = new int[idx];
        idx = 0;
        for(int i = 0; i < result2.length; i++){
            boolean flag = false;
            for(int j = 0; j < result3.length; j++){
                if(result2[i] == result3[j]){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                result3[idx++] = result[i];
            }
        }
        System.out.println(Arrays.toString(result3));

    }
}
