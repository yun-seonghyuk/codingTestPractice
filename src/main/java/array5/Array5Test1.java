package array5;

import java.util.Arrays;

public class Array5Test1 {
    /*
		 문제 1) 각층별 관리비 합 출력
		 정답 1) 4400, 7100, 5400
		 문제 2) 호를 입력하면 관리비 출력
		 정답 2) 입력 : 202	관리비 출력 : 2000
		 문제 3) 관리비가 가장 많이 나온 집, 적게 나온 집 출력
		 정답 3) 가장 많이 나온 집(201), 가장 적게 나온 집(303)
		 문제 4) 호 2개를 입력하면 관리비 교체 (101 , 102) ==>  (2100, 1000)
		 문제 5) 관리비 많이 나온순서대로 관리비와 호수 출력 (정렬)
	*/
    public static void main(String[] args) {

        int[][] apt = {
                {101, 102, 103},
                {201, 202, 203},
                {301, 302, 303}
        };

        int[][] pay = {
                {1000, 2100, 1300},
                {4100, 2000, 1000},
                {3000, 1600, 800}
        };

        int[] sum = new int[pay.length];
        int idx = 0;
        for (int[] item : pay) {
            for (int item2 : item) {
                sum[idx] += item2;
            }
            idx++;
        }
        System.out.println(Arrays.toString(sum));
        System.out.println();

        int a1 = 0;
        int a2 = 0;
        int value = 202;
        for (int i = 0; i < apt.length; i++) {
            for (int j = 0; j < apt[i].length; j++) {
                if (value == apt[i][j]) {
                    a1 = i;
                    a2 = j;
                    break;
                }
            }
        }
        System.out.println(pay[a1][a2]);
        System.out.println();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int p1 = 0;
        int p2 = 0;
        for (int i = 0; i < pay.length; i++) {
            for (int j = 0; j < pay[i].length; j++) {
                if (max < pay[i][j]) {
                    max = pay[i][j];
                    a1 = i;
                    a2 = j;
                }
                if (min > pay[i][j]) {
                    min = pay[i][j];
                    p1 = i;
                    p2 = j;
                }
            }
        }
        System.out.println(apt[a1][a2]);
        System.out.println(apt[p1][p2]);
        System.out.println();

        int apt1 = 101;
        int apt2 = 102;
        a1 = 0;
        a2 = 0;
        int a3 = 0;
        int a4 = 0;
        for (int i = 0; i < apt.length; i++) {
            for (int j = 0; j < apt[i].length; j++) {
                if (apt[i][j] == apt1) {
                    a1 = i;
                    a2 = j;
                }
                if (apt[i][j] == apt2) {
                    a3 = i;
                    a4 = j;
                }
            }
        }
        int temp = pay[a1][a2];
        pay[a1][a2] = pay[a3][a4];
        pay[a3][a4] = temp;

        for (int[] item : pay) {
            System.out.println(Arrays.toString(item));
        }

        int[] aptTemp = new int[pay.length * pay[0].length];
        int[] payTemp = new int[apt.length * apt[0].length];
        int aptIdx = 0;
        int payIdx = 0;
        for (int i = 0; i < apt.length; i++) {
            for(int j = 0; j < apt[i].length; j++){
                aptTemp[aptIdx++] += apt[i][j];
                payTemp[payIdx++] += pay[i][j];
            }
        }

        for(int i = 0; i < aptTemp.length; i++){
            for(int j = i+1; j < aptTemp.length; j++){
                if(payTemp[i] < payTemp[j]){
                    int tmp = payTemp[i];
                    payTemp[i] = payTemp[j];
                    payTemp[j] = tmp;

                    int tmp2 = aptTemp[i];
                    aptTemp[i] = aptTemp[j];
                    aptTemp[j] = tmp2;
                }
            }
        }
        System.out.println();
        aptIdx = 0;
        payIdx = 0;
        for(int i = 0; i < apt.length; i++){
            for(int j = 0; j < apt[i].length; j++){
                apt[i][j] = aptTemp[aptIdx++];
                pay[i][j] = payTemp[payIdx++];
            }
        }

        System.out.println();
        for(int[] item: pay){
            System.out.println(Arrays.toString(item));
        }
        System.out.println();
        for(int i = 0; i < apt.length; i++){
            System.out.println(Arrays.toString(apt[i]));
        }
    }
}
