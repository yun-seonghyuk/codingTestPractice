package array6;

import java.util.Arrays;

public class DeleteEqualNumbers {
    /*
	 	 input[] = {1,3,3,2,1,1,4};

		 [1] input 의 데이터를 a 에 순차적으로 저장한다.
		 [2] 단, 저장할려는 숫자의 앞의 숫자가 지금 저장할려는 수와 값이 같다면,
		  	 둘다 삭제한다.
		 예) input = {1,3,3,2,1,1,4}
		 1  ==> a[] = {1}
		 3  ==> a[] = {1,3}
		 3  ==> a[] = {1,3,3} ==> {1}
		 2  ==> a[] = {1,2}
		 1  ==> a[] = {1,2,1}
		 1  ==> a[] = {1,2,1,1} ==> {1,2}
		 4  ==> a[] = {1,2,4}
	*/
    public static void main(String[] args) {
        int input[] = {1,3,3,2,1,1,4};
        int a [] = new int[input.length];

        a[0] = input[0];

        for(int i = 1; i < input.length; i++){
            if(input[i-1] != input[i]){
               a[i] = input[i];
            } else {
                a[i-1] = 0;
            }
        }
        System.out.println(Arrays.toString(a));

        int[] temp = new int[input.length];
        int idx = 0;
        for(int i = 0; i < temp.length; i++){
            if(a[i] != 0){
                temp[idx++] = a[i];
            }
        }
        System.out.println(Arrays.toString(temp));

    }

}
