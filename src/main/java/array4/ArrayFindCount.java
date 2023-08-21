package array4;

import java.util.Arrays;

public class ArrayFindCount {
    /*
	  [개수찾기]
	  	 가장많이 들어있는 숫자개수와
		 가장 적개 들어있는 숫자의 개수의 합을 구하시요.
		 100 : 1개
		 3   : 5개
		 답 : 6
	 */
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 100, 1, 3, 3, 2, 3, 2 };
        int[] temp = new int[arr.length];
        int idx = 0;
        for(int i = 0; i < arr.length; i++){
            boolean check = false;
            for(int j = 0; j < i; j++){
                if(arr[i] == temp[j]){
                    check = true;
                    break;
                }
            }
            if(check == false){
                temp[idx++] = arr[i];
            }
        }

        int[] result = new int[idx];

        for(int i = 0; i < idx; i++){
            for(int j = i; j < arr.length; j++){
                if(arr[j] == temp[i]){
                    result[i]+=1;
                }
            }
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxIndex = 0;
        int minIndex = 0;
        for(int i = 0; i < result.length; i++){
            if(min > result[i]){
                min = result[i];
                minIndex = i;
            }

            if(max < result[i]){
                max = result[i];
                maxIndex = i;
            }

        }

        System.out.println(Arrays.toString(temp));
        System.out.println(Arrays.toString(result));
        System.out.println(maxIndex);
        System.out.println(minIndex);
        System.out.println("가장많이 나온수 : "+temp[maxIndex]+" " +max + " 가장적게 나온수 : "+temp[minIndex]+" "+min);
        System.out.println(max + min);
    }
}
