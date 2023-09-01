package array7;

import java.util.Arrays;

public class ManageStudents {
    public static void main(String[] args) {

        // 학번 , 국어 , 수학 , 영어
        int [][] arr = {
                {1001, 100, 20, 32},
                {1002, 40, 43, 12},
                {1003, 60, 21, 42},
                {1004, 76, 54, 55},
                {1005, 23, 11, 76},
        };

        //[문제1] 모든 점수의 총합 출력
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < arr[i].length; j++){
                sum+= arr[i][j];
            }
        }
        System.out.println("전체 총합 : "+sum);
        //[문제2] 국어1등 번호 출력
        int max = 0;
        for(int i = 0; i < arr.length; i++){
           if(max < arr[i][1]){
               max = arr[i][1];
           }
        }
        System.out.println("국어 1등 번호 : "+max);

        //[문제3] 수학1등 번호 출력
        max = 0;
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i][2]){
                max = arr[i][2];
            }
        }
        System.out.println("수학 1등 번호 : "+max);
        //[문제4] 영어1등 번호 출력
        max = 0;
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i][3]){
                max = arr[i][3];
            }
        }
        System.out.println("영어 1등 번호 : "+max);

        //[문제5] 전체1등 번호 출력
        int[] temp = new int[5];
        int maxNumber = -1;
        max = 0;
        for(int i = 0; i < temp.length; i++){
            temp[i] += arr[i][1] + arr[i][2] + arr[i][3];
            if(max < temp[i]){
                max = temp[i];
                maxNumber = arr[i][0];
            }
        }
        System.out.println("전체 1등번호 : "+maxNumber);

        //[문제6] 수학점수가 국어 점수 보다 높은 번호 출력
        for(int i = 0; i < arr.length; i++){
            if(arr[i][1] < arr[i][2]){
                System.out.println(arr[i][0]);
            }
        }
        //[문제6] 각점수의 총합을 아래 배열에 저장후 출력
        int total[] = new int[5];

        for(int i = 0; i < total.length; i++){
            for(int j = 1; j < arr[i].length; j++){
                total[j] += arr[i][j];
            }
        }
        System.out.println(Arrays.toString(total));
        //[문제7] 전체 점수기준으로 등수를 저장후 출력
        int rank[] = new int[5];

        for(int i = 0; i < temp.length; i++){
            for(int j = i; j < temp.length; j++){
                if(temp[i] < temp[j]){
                    int tmp = temp[i];
                    temp[i] = temp[j];
                    temp[j] = tmp;

                    int tmp2 = arr[i][0];
                    arr[i][0] = arr[j][0];
                    arr[j][0] = tmp2;
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println((i+1)+"등번호 : "+arr[i][0]);
        }

    }

}
