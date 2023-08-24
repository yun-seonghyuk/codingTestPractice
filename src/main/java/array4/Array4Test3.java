package array4;

import java.util.Arrays;

public class Array4Test3 {
    /*
	 1) array 배열안에 input 배열 안 의 값이 있을때마다
	 2) b배열안에 input 값의 인덱스를 b의 같은자리에 저장할려고 한다.
	 조건) 만약에 input 숫자가 array 에 없으면 인덱스 대신 -1 저장
	 예)  input[] ==> { 30, 40, 1, 10, 2 }
	   1) 30 은 array[2] 이므로 2저장
	   2) 40 은 array[3] 이므로 3저장
	   3) 1  은 array에 없으므로 -1 저장
	   4) 10 은 array[0] 이므로 0 저장
	   5) 2  는 array에 없으므로 -1  저장
	 [조건] 단 앞에서 부터 저장
	 b = { 2, 3, 0, -1, -1}
	*/
    public static void main(String[] args) {

        int array[] = {10, 20, 30, 40};
        int input[] = {30, 40, 1, 10, 2};

        int b[] = {-1, -1, -1, -1, -1};
        int idx = 0;

        for(int i = 0; i < input.length; i++){
            int idx2 = 0;
            boolean check = false;
            for(int j = 0; j < array.length; j++){
                if(array[j] == input[i]){
                    check = true;
                    idx2 = j;
                    break;
                }
            }
            if(check){
                b[idx++] = idx2;
            }
        }
        System.out.println(Arrays.toString(b));

    }

}
