package array7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveSingleDigit {
    /*
		 아래 배열에서 혼자있는 숫자를 제거한후 나머지값들만  temp1~3 에 저장후 출력
		 1) {1,2,2,1,0}    // 3이 혼자있음
		 2) {4,4,0,0,0}        // 1,2,3 혼자있음
		 3) {1,1,1,1,1}  // 없음
	*/

    public static void main(String[] args) {
        int test1[] = {1,2,3,2,1};
        int test2[] = {1,3,4,4,2};
        int test3[] = {1,1,1,1,1};

        int temp1[] = new int[5];
        int temp2[] = new int[5];
        int temp3[] = new int[5];


        int idx1 = 0;
        int idx2 = 0;
        int idx3 = 0;
        for(int i = 0; i < test3.length; i++){
            int size1 = 0;
            int size2 = 0;
            int size3 = 0;
            for(int j = 0; j < test3.length; j++){
                if(test1[i] == test1[j]){
                    size1++;
                }
                if(test2[i] == test2[j]){
                    size2++;
                }
                if(test3[i] == test3[j]){
                    size3++;
                }
            }
            if(size1 > 1){
                temp1[idx1++] = test1[i];
            }
            if(size2 > 1){
                temp2[idx2++] = test2[i];
            }
            if(size3 > 1){
                temp3[idx3++] = test3[i];
            }
        }
        System.out.println(Arrays.toString(temp1));
        System.out.println(Arrays.toString(temp2));
        System.out.println(Arrays.toString(temp3));
    }
}
