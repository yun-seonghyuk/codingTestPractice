package array6;

import java.util.Arrays;

public class CombineEqualNumbers {
    /*
	  	input = {8,4,2,2,4,4,8};

		 [1] input 의 데이터를 순차적으로 a에 저장한다.
		 [2] 저장할려는 수와 그앞의 수가 서로같으면 합친다. (계속 중첩적용)
		 input = {8,4,2,2,4,4,8}
		 8  ==> a[] =  {8}
		 4  ==> a[] =  {8,4}
		 2  ==> a[] =  {8,4,2}
		 2  ==> a[] =  {8,4,2,2} ==> {8,4,4} ==> {8,8} ==> {16}
		 4 ==>  a[] =  {16,4}
		 4  ==> a[] =  {16,4,4} ==> {16,8}
		 8  ==> a[] =  {16,8,8} ==> {16,16} ==> {32}
	 */
    public static void main(String[] args) {
        int[] input = {8, 4, 2, 2, 4, 4, 8};
        int a[] = new int[input.length];
        int idx = 1;
        a[0] = input[0];
        for (int i = 1; i < input.length; i++) {
            if (input[i - 1] == input[i]) {
                int result = input[i] + input[i - 1];
                a[idx - 1] = result;
                a[idx] = 0;
                System.out.println(Arrays.toString(a));
            } else {
                a[idx++] = input[i];
            }
            for (int j = 1; j < idx; j++) {
                if (a[j - 1] == a[j]) {
                    int result = a[j] + a[j - 1];
                    a[j - 1] = result;
                    a[j] = 0;
                    idx--;
                    System.out.println(Arrays.toString(a));
                    for(int k = 0; k < idx-1; k++){
                        if(a[k] == a[k + 1]){
                            a[k] = a[k] + a[k + 1];
                            idx--;
                            a[k + 1] = 0;
                            System.out.println(Arrays.toString(a));
                        }
                    }

                }
            }
        }

    }
}
