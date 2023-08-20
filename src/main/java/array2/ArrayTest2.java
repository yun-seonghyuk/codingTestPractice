package array2;

import java.util.Arrays;

public class ArrayTest2 {
    public static void main(String[] args) {
/*
	 * [문제]
	 *
	 * [1등]
	 *   아래 데이터는 학생번호1개, 점수2개가 한세트이다.
		 번호는 1001부터시작이고 , 점수는 0~100 이다.
		 예) 1001 , 20, 30 ==> 1001번 1번점수 20점, 2번점수 30점


		 1등의 번호 출력한다.
		 점수는 두점수의 합으로계산한다.
	 */

        int arr[] = {1001, 20, 30, 1002, 43, 23, 1003, 45, 1};

        /*
		 	[힌트] 값이 3개가 하나의 묶음이므로 반복할때 한번에 i값을 3씩 증가해야한다.
		 */
        int total = 0;
        int max = 0;
        int maxIdx = 0;
        for(int i = 0; i < arr.length; i+=3){
            total = arr[i + 1] + arr[i + 2];
            if(max < total){
                max = total;
                maxIdx = i;
            }
        }

        System.out.println("1등번호 : "+arr[maxIdx] + " 총점 : "+ max);


        /*
	 * [교차합]
	 *
	    arr1은 앞에서부터 뒤로 반복한다.
		arr2는 뒤에서부터 앞으로 거꾸로 반복한다.

		b에 arr1 과 arr2 각각의 값의 합을 저장후 출력한다.

		 예) b[0] = arr1[0] + arr2[4]
		 예) b[1] = arr1[1] + arr2[3]

	 */
        int arr1[] = {11,21,31,41,51};
        int arr2[] = {25,26,27,28,29};
        int b[] = new int[5];

        for(int i = 0; i < arr1.length; i++){
            b[i] = arr1[i] + arr2[arr1.length -1 - i];
        }
        System.out.println(Arrays.toString(b));

    }
}
