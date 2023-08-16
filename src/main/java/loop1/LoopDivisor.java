package loop1;

public class LoopDivisor {
    public static void main(String[] args) {
	/*
	  [문제]
	  	48의 약수를 전부 출력하시오.
	  	(0보다 큰수중 어떤수를 나누어떨어지게하는수를 그수의 약수라고합니다.)
	 */
        int idx = 1;
        int divisor = 48;
        while(idx <= 48){
            if(divisor % idx == 0){
                System.out.println(idx);
            }
            idx++;
        }
        System.out.println();
        /*
         * [문제]
         *  18의 약수를 출력하시오
         */

        idx = 1;

        while(idx <= 18){
            if(18 % idx == 0){
                System.out.println(idx);
            }
            idx++;
        }
        System.out.println();
        /*
         * [문제] 64의 약수중에서 가장 가운데 위치의 값만 출력하시오.
         * 		 예) 1,2,4,8,16,32,64
         * 		 정답 => 8
         */

        idx = 1;
        int num = 64;
        int cnt = 0;
        while(idx <= num){
            if(num % idx == 0){
                cnt++;
            }
            idx++;
        }
        System.out.println();

        int mid = cnt/2 + 1;
        num = 64;
        idx = 1;
        cnt = 0;

        while(true){
            if(num % idx == 0){
                cnt++;
            }
            if(cnt == mid){
                System.out.println(idx);
                break;
            }
            idx++;
        }

    }
}
