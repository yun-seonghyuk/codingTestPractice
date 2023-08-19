package Array3;

import java.util.Arrays;

public class Array3Basic {
    /*
     * [중첩반복문과배열]
     *   - 중첩반복문 3 x 4 을 활용해  1차원배열에 1~12 값넣기
     */

    public static void main(String[] args) {
        int arr[] = new int[12];

        int k = 1;
        int idx = 0;
        for(int i = 0; i < arr.length/4; i++){
            for(int j = 0; j < arr.length/3; j++){
                arr[idx++] = k++;
            }
        }
        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
