package array3;

import java.util.Arrays;

public class ArrayTest3 {
    /*
	 * [석차 출력]
	 * . 성적 순으로 번호출력 (힌트 : 정렬 )
            1004 , 1001 , 1002 , 1003
	 */

    public static void main(String[] args) {

        int[] numList = {1001, 1002, 1003, 1004};
        int[] scoreList = { 87, 42,  11, 98};

        for(int i = 0; i < numList.length; i++){
            for(int j = 0; j < numList.length; j++){
                if(scoreList[i] > scoreList[j]){
                    int scoreTemp = scoreList[i];
                    scoreList[i] = scoreList[j];
                    scoreList[j] = scoreTemp;

                    int numTemp = numList[i];
                    numList[i] = numList[j];
                    numList[j] = numTemp;
                }
            }
        }
        System.out.println(Arrays.toString(numList));
    }

}
