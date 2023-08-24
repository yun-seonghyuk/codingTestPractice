package array4;

import java.util.Arrays;

public class Array4Test6 {
    /*

	    [펠림드롬]

	     -펠림드롬이란 앞에서 시작해도 뒤에서시작해도 똑같은 값이다.

	  	위 배열에서 0이나 1을 제외한 나머지 값들이 페린드롬인지 출력한다.
		[예] 1과 0을 전부 제외하면 3,2,2,3 이므로 펠린드롬이다.
	 */
    public static void main(String[] args) {
        int arr[] = {1,3,0,0,2,1,5,3,0};

        int size = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 1){
                size ++;
            }
        }
        int[] palindrome = new int[size];
        int idx = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 1){
                palindrome[idx++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(palindrome));
        int reversIdx = palindrome.length-1;
        boolean flag = false;
        for(int i = 0; i < palindrome.length/2; i++){
            if(palindrome[i] != palindrome[reversIdx--]){
                flag = true;
                break;
            }
        }

        if(!flag){
            System.out.println("팰린드롬 이다.");
        } else {
            System.out.println("팰린드롬이 아니다.");
        }
    }
}
