package array5;

import java.util.Arrays;

public class Array5Basic2 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        int k = 1;
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                arr[i][j] = 10 * k;
                k += 1;
            }
        }
        for(int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        // 문제1) 인덱스 2개를 입력받아 값 출력
        // 예1) 인덱스1 입력 : 1	인덱스2 입력 : 2
        //		   값 출력 : 60
        int x = 1;
        int y = 2;
        System.out.println(arr[x][y]);

        // 문제2) 값을 입력받아 인덱스 2개 출력
        // 예2) 값 입력 : 60
        //		   인덱스1 출력 : 1	인덱스2 출력 : 2

        int value = 60;
        x = 0;
        y = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(value == arr[i][j]){
                    x = i;
                    y= j;
                }
            }
        }
        System.out.println(x +" "+y);

        // 문제3) 가장 큰 값의 인덱스 2개 출력
        // 정답3) 2 2

        x = 0;
        y = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(max < arr[i][j]){
                    max = arr[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println(x + " "+y);


        // 문제4) 값 2개를 입력받아 값 교체

        int num1 = 40;
        int num2= 60;
        int a1 = 0;
        int b1 = 0;
        int c1 = 0;
        int d1 = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(num1 == arr[i][j]){
                    a1 = i;
                    b1 = j;
                }
                if(num2 == arr[i][j]){
                    c1 = i;
                    d1 = j;
                }
            }
        }

        int temp = arr[a1][b1];
        arr[a1][b1] = arr[c1][d1];
        arr[c1][d1] = temp;

        for(int[] item: arr){
            System.out.println(Arrays.toString(item));
        }
    }
}
