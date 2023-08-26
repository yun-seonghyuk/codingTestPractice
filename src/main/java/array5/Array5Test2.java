package array5;

import java.util.Scanner;

public class Array5Test2 {
    /*
     *  [다음 소수 찾기]
     * 1. 숫자를 한 개 입력받는다.
     * 2. 입력받은 숫자보다 큰 첫 번째 소수를 출력한다.
     *
     * 예) Enter Number ? 1000
     *    1000보다 큰 첫번재 소수는 1009
     * 예) Enter Number ? 500
     *    500보다 큰 첫번째 소수는 503
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Number ? ");
        int number = scan.nextInt();
        int i = 2;
        while(true){
            int cnt = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    cnt++;
                }
            }
            if(cnt < 3 && number < i){
                System.out.println(i);
                break;
            }
            i++;
        }



    }

}
