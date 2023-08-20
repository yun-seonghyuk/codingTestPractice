package array4;

import java.util.Arrays;

public class Array4WithHeightSum {

    /*
	 * [가로세로합]
	 *
	     위 배열은 1~9가 섞여서 저장되어 있는 9개 사이즈의 배열이다.
		 [문제1] array 배열을 위 와같이 사각형 모양으로 출력 하고
		 각줄의 가로 합을 garo1[] 에 차례대로 저장

		 [문제2] array 배열을 위 와같이 사각형 모양으로 출력 하고
		 각줄의 세로 합을 sero1[] 에 차례대로 저장

	 */
    public static void main(String[] args) {
        int array[] = {
                2, 4, 6,
                8, 1, 5,
                9, 7, 3
        };


        int garo1[] = {0,0,0}; // {2+4+6 , 8+1+5 , 9+7+3}
        int sero1[] = {0,0,0}; // {2+8+9 , 4+1+7 , 6+5+3}
        int garoIdx = 0;
        int seroIdx = 0;

        for(int i = 0; i < garo1.length; i++){
            for(int j = 0; j < sero1.length; j++){
                garo1[i] += array[garoIdx++];
                sero1[j] += array[seroIdx++];
            }
        }
        System.out.println(Arrays.toString(garo1));
        System.out.println(Arrays.toString(sero1));
    }
}
