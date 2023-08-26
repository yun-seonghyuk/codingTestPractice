package array5;

import java.util.Arrays;

public class ArrayGraphVertical {
    /*
	    scoreList[] = {31, 76, 54, 2, 100, 23};
	    위 데이터는 학생 6명의 점수이다.
		위 데이터를 그래프로 표현해볼려고한다.
	 	표시는 10의 자리숫자로 표현해서 개수만큼  * 로 출력할려고한다.
	 	전에는 왼쪽에서 오른쪽으로 표현했지만 이번엔 아래서 위로 표현할려고한다.

		---------------------------------
		                 *
		                 *
		                 *
		        *        *
		 	    *        *
		  	    *  *     *
		        *  *     *
		     *  *  *     *
		     *  *  *     *  *
		  	 *  *  *     *  *
		    31 76 54 2 100 23
		---------------------------------

	*/

    public static void main(String[] args) {
        int scoreList[] = {31, 76, 54, 2, 100, 23};
        int idx = 0;

        int[] temp = {100, 100, 100, 100, 100, 100};

        for(int i = 0; i < scoreList.length; i++){
            temp[i] -= scoreList[i]/10*10;
        }

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < scoreList.length; j++){
                if(temp[j]/10 > 0 ){
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            for(int k = 0; k < scoreList.length; k++){
                temp[k] -= 10;
            }
            System.out.println();
        }


    }
}
