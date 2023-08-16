package loop1;

public class Loop2 {
    public static void main(String[] args) {
        /*
	  [문제]
		철수네 가족은 x 와 y 두지점을 자전거를 타고 왕복하였다.
		갈때는 시속15km , 올때는 시속12km 로 이동하여 총  45분이 걸렸을때 ,
		두지점의 x , y 거리를 구하시오.
	 */


        double x = 15/60.0;
        double y = 12/60.0;

        int total = 45;
        int tmpTotal = 0;
        while(true){
            if(total * x == y * tmpTotal){
                System.out.println(total + " "+tmpTotal);
                break;
            } else {
                total--;
                tmpTotal++;
            }
        }

        System.out.println(x);
        System.out.println(y);


        	/*
	 * [문제]
		  아래와같은 휴대요금제가 있다
		  B를 선택할경우 A보다 더 경제적이될려면,
		  통화시간을 얼마까지 사용해야될까요?
		  정답을 초로 구하시오.
		  A요금제 기본요금 17500원 초당 5원
		  B요금제 기본요금 31000원 초당 2원

	 */
        int a = 5;
        int b = 2;
        int mi = 0;
        while(true){
            if((17500 + a) > (31000 + b)){
                System.out.print(mi/3600+"시간 ");
                System.out.println(mi%3600/60+"분");
                break;
            }
            a = 5;
            b = 2;
            mi++;
            a*=mi;
            b*=mi;
        }

        /*
	 * [문제]
		학교에서 집까지 갈때 시속 15km로 자전거를 타고 가면,
		시속 6km로 걸어가는거보다 18분 빨리 도착한다고 한다.
		학교에서 집까지의 거리를 구하시오.
	 */

        x  = 15/60.0;
        y = 6/60.0;
        System.out.println(x);
        System.out.println(y);


    }
}
