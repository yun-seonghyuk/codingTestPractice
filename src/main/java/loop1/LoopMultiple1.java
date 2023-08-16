package loop1;

public class LoopMultiple1 {
    public static void main(String[] args) {

    /*
	  [문제]
	  	7의 배수중 작은수부터 3개만 출력 하시오.
	    답 : 7,14,21
    */
        int cnt = 0;
        int num = 7;
        int idx = 1;
        while(true){
            if(idx % num == 0){
                cnt++;
                System.out.println(idx);
            }
            idx++;
            if(cnt == 3){
                break;
            }
        }
        System.out.println();
/*
	  [문제]
	  		1 에서 200 사이의 숫자중 다음 조건에 맞는 숫자를 출력.
	      	[조건1] 6의 배수중에서 100에 가장가까운 수를 출력

	 		정답 : 102
	 */
        idx = 1;
        int minusNumber = 0;
        int limit = 100;
        int min = 200;
        int result = 0;

        while(idx <= 200){
            if(idx % 6 == 0 && idx >= 90 && idx < 110){
                minusNumber = limit - idx;
                if(minusNumber < 0){
                    minusNumber = idx - limit;
                }
                if(min > minusNumber){
                    min = minusNumber;
                    result = idx;
                }
            }
            idx ++;
        }
        System.out.println("6의 배수중 제일 가까운수 : "+result);
        System.out.println();

        /*
	  [문제]
	  		1~1000 사이의 숫자중 다음조건에 전부 해당하는 값을 출력하시오.
	    	[조건] 28의 배수를 출력하는가운데 가운데위치의 값만 출력한다.

	    	답: 504
	 */
        idx = 1;
        cnt = 0;
        while(idx <= 1000){
            if(idx % 28 == 0){
                cnt++;
            }
           idx++;
        }
        System.out.println(28 * (cnt+1)/2);

      /*
	  [문제]
	   28의 배수 중에서 가장 큰 세자리 수를 출력하시오.
	   답 : 980
	 */
        idx = 0;
        while(true){
            if(1000 < idx){
                break;
            } else{
                result = idx;
                idx += 28;
            }
        }
        System.out.println(result);


        /*
	  [문제]
	   9의 배수중 십의 자리가 6인 첫번째 배수 출력하시오.
	   답 : 63
	 */
        idx = 1;
        num = 0;
        while(true){
            num = idx / 10;
            if(idx % 9 == 0 && num == 6){
                System.out.println(idx);
                break;
            }
            idx ++;
        }

        /*
         * [문제]
         * 	7의 배수중 1보다크고  150보다 작은수중 가장큰수 출력하시오.
         *  답 : 147
         */
        idx = 1;
        result = 0;
        while (idx < 150){
            if(idx % 7 == 0){
                result = idx;
            }
            idx++;
        }
        System.out.println(result);
        System.out.println();
        /*
         * [문제]
         *  8의 배수를 8부터 순차적으로  4개만 출력하시오.
         *  답 : 8,16,24,32
         */
        cnt = 0;
        idx = 1;
        while(true){
            if(idx % 8 == 0){
                cnt++;
                System.out.println(idx);
            }
            if(cnt == 4){
                break;
            }
            idx++;
        }
        System.out.println();
        int first = 50;
        int last = 100;
        cnt = 0;
        while(first <= last){
            if(first % 9 == 0){
                cnt++;
            }
            first++;
        }
        System.out.println(cnt);
        System.out.println();
        /*
	  [문제]
	  		9의 배수중 100보다 큰 첫번째 배수 출력하시오.
	 */
        idx = 1;

        while(true){
            if(idx % 9 == 0 && idx > 100){
                System.out.println("9의 배수중 100보다 큰 첫번째 배수 : "+idx);
                break;
            }
            idx++;
        }
        /*
	   [문제]
	   	1000이하의 숫자중에서  8의 배수를 큰수부터 차례대로 4개 출력하시오.
	 */

        idx = 1;
        num = 1000;
        cnt = 0;
        while(idx <= 1000){
            if(idx % 8 == 0) {
                cnt++;
            }
            idx++;
        }
        System.out.println();
        idx = 1;

        while(idx <= 1000){
            if(idx % 8 == 0){
                if(8 * (cnt - 4) < idx){
                    System.out.println(idx);
                }
            }
            idx ++;
        }
        System.out.println();

        	/*
	  [문제]
	  	9의 배수중 일의 자리가 6인 첫번째 배수 출력하시오.
	    답 : 36
	 */
        num = 9;
        idx = 1;
        int a = 0;
        while(true){
            a = idx % 10;
            if(idx % num == 0 && a == 6){
                System.out.println(idx);
                break;
            }
            idx++;
        }
    }
}
