package array2;

import java.util.Arrays;

public class ArrayTest3 {

    /*
     * [문제]
     * 	4번째마다 바로앞의 값과 교환
     *
     *  [예]
     *  교환전  {10,20,30,40,50,60,70,80,90}
     *  교환후  {10,20,40,30,50,60,80,70,90};
     *
     */
    public static void main(String[] args) {

        int arr[] = {10,20,30,40,50,60,70,80,90};

        for(int i = 0; i < arr.length; i++){
            if(i % 4 == 3){
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
