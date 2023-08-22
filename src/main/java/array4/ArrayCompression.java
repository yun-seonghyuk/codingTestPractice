package array4;

import java.util.Arrays;

public class ArrayCompression {
    /*
	 *  arr1 = {1,1,1,3,3,3,3,2,2,3,3,3,4,5};
	 *  arr1에 중복되는 숫자는 제외하고 숫자 1개씩만 압축해서
	 *  b에 저장하려고 한다.
		[예] b[] = {1,3,2,3,4,5}
	 */
    public static void main(String[] args) {
        int arr1[] = {1,1,1,3,3,3,3,2,2,3,3,3,4,5};
        int b [] = new int[arr1.length];
        int idx = 0;

        b[0] = arr1[0];
        for(int i = 1; i < arr1.length; i++){
            if(b[idx] != arr1[i]){
                idx++;
                b[idx] = arr1[i];
            }
        }
//
//        for(int i = 0; i < arr1.length; i++){
//            boolean check = false;
//            for(int j = 0; j < i; j++){
//                if(arr1[i] == b[j]){
//                    check = true;
//                    break;
//                }
//            }
//            if(check == false){
//                b[idx++] = arr1[i];
//            }
//        }
        System.out.println(Arrays.toString(b));

    }
}
