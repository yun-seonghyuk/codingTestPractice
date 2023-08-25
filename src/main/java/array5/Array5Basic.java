package array5;

import java.util.Arrays;

public class Array5Basic {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        int k = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = 10 * k;
                k += 1;
            }
        }

        for(int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        // 문제 1) 전체 합 출력
        // 정답 1) 45

        int result = 0;
        for(int []item1 : arr){
            for(int item2 : item1){
                result += item2;
            }
        }
        System.out.println(result);

        // 문제 2) 4의 배수만 출력
        // 정답 2) 20 40 60 80

        for(int []item1 : arr){
            for(int item2 : item1){
                if(item2 % 4 == 0){
                    System.out.print(item2 + " ");
                }
            }
        }
        System.out.println();

        result = 0;
        // 문제 3) 4의 배수의 합 출력
        // 정답 3) 200

        for(int[] itemA : arr){
            for(int itemB : itemA){
                if(itemB % 4 == 0){
                    result+= itemB;
                }
            }
        }
        System.out.println(result);

        // 문제 4) 4의 배수의 개수 출력
        // 정답 4) 4
        int cnt = 0;
        for(int[] itemA : arr){
            for(int itemB : itemA){
                if(itemB % 4 == 0){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
