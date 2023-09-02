package array7;

import java.util.Arrays;

public class NumberOf9s {
    /*
	   mine = {0,9,0},
			  {9,0,9},
			  {0,0,9}

	  	위 mine배열의 숫자 0의 자리에 숫자를 저장할려고한다.
	 	저장할숫자는 주변 8방향을 검사후 9의 개수를 저장후출력.

		 예) 아래와 같이 출력
		   {2,9,2},
		   {9,4,9},
		   {1,3,9}

	 */
    public static void main(String[] args) {
        int mine[][] = {
                {0,9,0},
                {9,0,9},
                {0,3,9}
        };

        for(int i = 0; i < mine.length; i++){
            int idx = 0;
            for(int j = 0; j < mine[i].length; j++){
                int size = 0;
                if(mine[i][j] == 0){
                    if (j < mine.length - 1 && mine[i][j + 1] == 9) {
                        size++;
                    }
                    if (i < mine.length - 1 && mine[i + 1][j] == 9) {
                        size++;
                    }
                    if (i > 0 && mine[i - 1][j] == 9) {
                        size++;
                    }
                    if (j != 0 && mine[i][j - 1] == 9) {
                        size++;
                    }

                    if(j != 0 && i != 0 && mine[i-1][j-1] == 9){
                        size++;
                    }
                    if(j < mine.length-1 && i != 0 && mine[i-1][j+1] == 9){
                        size++;
                    }
                    if(i <= j && j < mine.length-1 && mine[i+1][j+1] == 9){
                        size++;
                    }
                    if(i < mine.length-1 && j != 0 && mine[i+1][j-1] == 9){
                        size++;
                    }
                }
                if(mine[i][idx] == 0){
                    mine[i][idx] = size;
                }
                idx++;
            }
        }
        for(int i = 0; i < mine.length; i++){
            System.out.println(Arrays.toString(mine[i]));
        }

    }
}
