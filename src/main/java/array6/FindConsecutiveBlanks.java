package array6;

import java.util.Arrays;

public class FindConsecutiveBlanks {
    /*

	 [1] 배열 arr 은 1과 0으로 되어있다.
	 [2] 숫자1 은 이미 채워진 자리이고 0은 비어있는자리이다.
	 [3] input 변수에 값을 입력받고 아래 내용대로 구현
	  	예) input => 3 ==> 인덱스 2부터 연속으로 3칸이 비어있으므로,
	 		{0,1,1,1,1,1,0,0};

	 	예) input => 4 ==> 연속으로4칸 비어있는자리가 없으므로 "x"
	 		{0,1,0,0,0,1,0,0};

	 	예) input => 1 ==> 인덱스 0의 자리가 비어있으므로
	 		{1,1,0,0,0,1,0,0};
	*/
    public static void main(String[] args) {

        int arr[] = {0,1,0,0,0,1,0,0};
        int input = 4;
        int cnt = 0;
        int idx = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                cnt++;
            } else {
                cnt = 0;
            }

            if (input == cnt) {
                idx = i;
                break;
            }
        }

        if (idx != -1) {
            for (int i = input - 1; i <= idx; i++) {
                arr[i] = 1;
            }
            System.out.println(Arrays.toString(arr));
        } else {
            System.out.println("x");
        }

    }
}
