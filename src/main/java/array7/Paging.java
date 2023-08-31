package array7;

import java.util.Scanner;

public class Paging {
    public static void main(String[] args) {

        /*
         *  1~1000 사이의 숫자를 입력받고 다음과 같이 출력하시오.

         *  입력받은값이
         * 	1~10 사이 값이면  ==> 1
         *  11~20 사이 값이면 ==> 11
         *  21~30 사이 값이면 ==> 21
         *  ......
         *
         *  예)
         *  	5 ==> 1
         *  	24 ==> 21
         *  	154 ==> 151
         *  	10 ==> 1
         */

        Scanner scan = new Scanner(System.in);

        int num = 150;

        if(num % 10 == 0 ){
            System.out.println((num/10-1)*10+1);
        } else{
            System.out.println((num/10)*10+1);
        }


    }
}











