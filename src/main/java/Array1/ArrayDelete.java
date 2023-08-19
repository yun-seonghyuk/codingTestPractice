package Array1;

import java.util.Arrays;
import java.util.Random;

public class ArrayDelete {
    public static void main(String[] args) {
        /*
         * 	[문제]
         *  아래배열 a 의 안에 있는 값을 하나 입력받는다.
         *  b배열안에 위에서 입력한 값을 제외하고 복사한다.
         *
         *  [예] 30 ==> b[] = {10,20,40,50,0};
         *

         *
         */
        int a[] = {10, 20, 30, 40, 50};
        int b[] = {0, 0, 0, 0, 0};
        int value = 20;
        int idx = 0;
        for (int item : a) {
            if (value != item) {
                b[idx] = item;
                idx++;
            }
        }
        System.out.println(Arrays.toString(b));
        /*

         *  [문제]
         *  아래 배열 c는 번호와 값이 한쌍인 배열이다.
         *  번호를 하나를 입력받고 c배열에 있는 번호이면,
         *  그번호와  값만 제외하고 d배열에 복사한다.
         *
         *  [예] 1002 ==> d[] = {1001, 40, 1003, 70 , 0, 0};
         *
         */
        int c[] = {1001, 40, 1002, 65, 1003, 70};
        int d[] = {0, 0, 0, 0, 0, 0};

        int deleteValue = 1003;
        idx = -1;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == deleteValue) {
                idx = i + 1;
                break;
            }
        }
        if (idx == -1) {
            System.out.println("방 번호 없음");
        } else {
            int room = 0;
            for (int i = 0; i < c.length; i++) {
                if (i != idx && deleteValue != c[i]) {
                    d[room] = c[i];
                    room++;
                }
            }
        }
        System.out.println(Arrays.toString(d));

        /*
		[문제]
			삽입할 위치를 래덤(0~2)으로 저장하고 배열에 삽입을 구현한다.
			삽입할 위치를 기준으로 전부 뒤로 한칸씩 이동한후에
			삽입할 값을 삽입할 위치에 저장한다.
			(예)index = 2  ==> 배열은 0부터 시작하므로 30이 2의 위치이다.
			   int array[] = { 10,20,60,30,0 };

			(예)index = 1  ==> 배열은 0부터 시작하므로 20이 1의 위치이다.
			   int array[] = { 10,60,20,30,0 };
	 */

        Random ran = new Random();

//        int array[] = {10, 20, 30, 0, 0};
//        value = 60;
//        int index = array.length-1;
//        int randomIdx = ran.nextInt(3);
//        System.out.println(randomIdx);
//        for(int i = randomIdx; i < array.length-1; i++){
//            array[index] = array[index-1];
//            index--;
//        }
//        array[randomIdx] = value;
//        System.out.println(Arrays.toString(array));

        /*
         * [문제]
         * 		array[] = {10, 43, 25, 76, 3, 100, 56};
         * 		인덱스 2개를 입력받고 작은인덱스에서 큰인덱스까지의 값들의 합을 출력한다.
         *
         * [조건] index1 이 index2 보다 더크더라도
         *       작은인덱스부터 큰인덱스까지의 합을 출력한다.
         *
         * [예] index1 = 1;  index2 = 3;
         * 43 + 25 + 76
         *
         * [예] index1 = 4;  index2 = 1;
         * 43 + 25 + 76 + 3
         *
         */
            int array[] = {10, 43, 25, 76, 3, 100, 56};

            int index1 = 4;
            int index2 = 3;
            int sum = 0;

            if(index1 > index2){
                for(int i = index2; i <= index1; i++){
                    sum += array[i];
                }
            } else {
                for(int i = index1; i <= index2; i++ ){
                    sum += array[i];
                }
            }

        System.out.println(sum);
        boolean[] check = new boolean[5];
        int[] arr1 = new int[5];
        int r = 0;
        int i = 0;
        while(true){
            r = ran.nextInt(5);

            if(check[r] == false){
                check[r] = true;
                arr1[i] = r;
                i++;
            }
            if(i == check.length){
                break;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
