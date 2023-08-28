package array5;

import java.util.Arrays;

public class Array5Compressing {
    /*
		 위 데이터는 압축전 데이터이다.
		 연속으로 이뤄진 데이터를 모아 압축할려고한다.
		 예) 33    ==> {3,2}
		 예) 55555 ==> {5,5}
		 예) 3     ==> {3,1};
		 예) 444   ==> {4,3};
		  0번은 압축할값 , 1번은 연속된개수
		 문제) 위 압축전데이터를 분석후 2차원으로 저장하시요.
	*/
    public static void main(String[] args) {

        int before[] = {3, 3, 5, 5, 5, 5, 5, 3, 4, 4, 2};
        int after[][] = new int[5][2];

        after[0][0] = before[0];

        int front = 1;
        int back = 0;
        int cnt = 1;

        int count = 0;
        for (int i = 0; i < before.length - 1; i++) {
            count++;
            if (before[i] == before[i + 1]) {
                cnt++;
                after[back][1] = cnt;

            } else {
                back++;
                cnt = 1;
                after[back][1] = cnt;
            }

            if (after[front - 1][0] != before[i+1]) {
                after[front++][0] = before[i+1];
            }

        }
        System.out.println(count);
        for (int[] item : after) {
            System.out.println(Arrays.toString(item));
        }
    }
}
