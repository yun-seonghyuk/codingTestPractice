package array3;

import java.util.Arrays;

public class ArrayLeftRight {
    /*
	 * [왼쪽오른쪽]
	 *
	 *   아래 번호를 입력받고 각방향 으로 0 이아닌숫자를 모으시요.
		 1)left 2)right
		 예) 1) left ==> arr = {2,3,4,5,0,0,0,0,0};
		 예) 1) right ==> arr = {0,0,0,0,0,2,3,4,5};
	 */
    public static void main(String[] args) {
        int arr[] = {0,2,0,3,4,0,0,5,0};

        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                if(arr[i] == 0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] =temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
//
//        for(int i = 0; i < arr.length; i++ ){
//            for(int j = 0; j < i; j++){
//                if(arr[i] == 0){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] =temp;
//                }
//            }
//        }
        System.out.println(Arrays.toString(arr));
    }
}
