package loop1;

public class LoopBasic2 {
    public static void main(String[] args) {
    /*
	 [문제1] 1~5까지의 합을 출력하시오.  1 + 2 + 3 + 4 + 5
	 [정답1] 15

	*/
        int idx = 1;
        int sum = 0;
        while(idx <= 5){
            sum+= idx;
            idx++;
        }
        System.out.println(sum);

        /*

	 [문제1] 1~10까지 중에서 3미만 7이상의 합을 출력하시오.
	       1 + 2 + 7 + 8 + 9 + 10
	 [정답1] 37


	 [문제2] 1~10까지 중에서 3미만 7이상의 개수를 출력하시오.
			 1,2,7,8,9,10 ==> 6개
	 [정답2] 6

	*/
        idx = 1;
        sum = 0;
        int cnt = 0;
        while(idx <= 10){
            if(idx < 3 || idx >= 7){
                sum += idx;
                cnt++;
            }
            idx++;
        }
        System.out.println(sum);
        System.out.println(cnt);
        System.out.println();
        /*
	     [문제] 아래조건을 만족하는 식을 작성하시오.
	       [조건1] 1~10까지 반복문을 실행한다.
	       [조건2] 1~5까지는 숫자대신 "안녕"을 출력한다.
	       [조건3] 6~10까지는 숫자를 출력한다.


	 */
        idx = 1;

        while(idx <= 10){
            if(idx >= 6){
                System.out.print(idx+" ");
            } else {
                System.out.print("안녕");
            }
            System.out.println();
            idx++;
        }
        System.out.println();

        /*

		[문제2] 아래조건을 충족하는 식을 작석하시오.
		 [조건1] 10~1까지 거꾸로 반복문을 실행한다.
		 [조건2] 3~6사이는 "안녕"을 출력한다.
		 [조건3] 3~6사이가 아닐때는 숫자를 출력한다.

	 */
        idx = 10;
        while(idx >= 1){
            if(idx >= 3 && idx <= 6){
                System.out.println("안녕");
            } else {
                System.out.println(idx);
            }
            idx--;
        }


        /*

		 [문제] 아래조건을 충복하는 식을 작성하시오.
		  [조건1] 1~10까지 반복문을 실행한다.
		  [조건2] 숫자가 짝수일떄는 "짝수" 출력한다.
		  [조건2] 숫자가 홀수일떄는 "홀수" 출력한다.

	 */
        idx = 1;

        while(idx <= 10){
            if(idx % 2 == 0){
                System.out.println("짝수");
            } else {
                System.out.println("홀수");
            }
            idx ++;
        }
        /*
		 [문제] 1~10까지 반복문을실행하고 3의배수의 개수를 출력하시오.
	*/
        idx = 1;
        cnt = 0;

        while(idx <= 10){
            if(idx % 3 == 0){
                cnt++;
            }
            idx++;
        }
        System.out.println(cnt);
    }
}
