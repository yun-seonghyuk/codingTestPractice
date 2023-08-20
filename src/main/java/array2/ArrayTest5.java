package array2;

import java.util.Arrays;

public class ArrayTest5 {
    /*
     * [문제]
     *
     * [예매확인]
     *
     * [1] seatList 는 영화관 7자리를 나타낸다.
     *
     * [2] seatList 의 값들은 영화관 예매한 회원번호를 나타낸다.
     *
     * [3] find 는 검색하고자하는 회원번호이다.
     *
     * [4] find 의 값을 영화관에서 찾아 자리를 출력해주자
     * 	- 예) 1003 이므로 영화관 0, 1 번이다.
     */
    public static void main(String[] args) {
        int seatList[] = {1003,1003,0,0,1002,0,1001};
        int find = 1003;

        for(int i = 0; i < seatList.length; i++){
            if(find == seatList[i]){
                System.out.println(i);
            }
        }

        /*
	 *  [점수교체]
	 *  	 번호 2개를 입력받아 성적 교체하기
		 [예]
		  	번호1 입력 : 1002 , 번호2 입력 : 1003

		  [교환전] { 87, 11, 45, 98, 23 }
		  [교환후] { 87, 45, 11, 98, 23 }

	 *
	 */
        int[] numbers = { 1001, 1002, 1003, 1004, 1005 };
        int[] scores = { 87, 11, 45, 98, 23 };


        int n1 = 1002;
        int n2 = 1003;
        int idx1 = 0;
        int idx2 = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == n1){
                idx1 = i;
            }
            if(numbers[i] == n2){
                idx2 = i;
            }

        }
        int temp = scores[idx1];
        scores[idx1] = scores[idx2];
        scores[idx2] = temp;
        System.out.println(Arrays.toString(scores));
    }
}
