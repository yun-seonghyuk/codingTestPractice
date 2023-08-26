package array5;

import java.util.Arrays;

public class Array5Test4 {
    /*
		data 리스트의 세로값들의 합을 sumList 에저장
		예) data[0] ==> 3,1,4,2 ==> sumList = {10,0,0,0,0};
	 */
    public static void main(String[] args) {
        int data[][] = {
                {0,0,0,0,0},
                {0,0,0,0,3},
                {0,2,0,0,3},
                {3,1,3,0,1},
                {1,4,2,0,2},
                {4,1,4,0,4},
                {2,1,4,3,3},
        };
        int[] sumList = {0,0,0,0,0};

        for(int i = 0; i < data.length; i++){
            for(int j = 0; j < data[i].length; j++){
                sumList[j]+= data[i][j];
            }
        }
        System.out.println(Arrays.toString(sumList));
    }

}
