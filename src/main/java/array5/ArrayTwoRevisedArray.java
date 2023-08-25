package array5;

import java.util.Arrays;

public class ArrayTwoRevisedArray {

    /*
	 * [정렬]
	     두 배열을 한나로 합치고 오름차순으로정렬하시오.
		 예) 1,2,3,5,7,8,9,10,12,15,19,20
	 */
    public static void main(String[] args) {
        int[] arr1 = {9,10,3,2,20,19};
        int[] arr2 = {15,12,1,5,7,8};
        int[] temp = null;
        int size1 = arr1.length;
        int size2 = arr2.length;
        temp = new int[size1 + size2];

        int i1 = 0;
        int i2 = 0;
        int cnt = 0;
        for(int i = 0; i < temp.length; i++){
            cnt++;
            if(i % 2 == 0){
                temp[i] = arr1[i1++];
            } else {
                temp[i] = arr2[i2++];
            }
        }

        for(int i = 0; i < temp.length; i++){
            for(int j = i+1; j < temp.length; j++){
                if(temp[i] > temp[j]){
                    int tmp = temp[i];
                    temp[i] = temp[j];
                    temp[j] = tmp;
                }
                cnt++;
            }
        }
        System.out.println(cnt);
        System.out.println(Arrays.toString(temp));
        System.out.println();

        int[][] array = new int[3][4];
        int k = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                array[i][j] += temp[k++];
            }
        }
        for(int i = 0; i < array.length; i++){
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
