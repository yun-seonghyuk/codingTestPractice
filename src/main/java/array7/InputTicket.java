package array7;

import java.util.Arrays;

public class InputTicket {
    /*
	    영화관 예매를 기록할려고한다. 영화관크기는 4 * 3 사이즈이다 (y , x)
		input의 데이터는 3개씩 5 번이다.
		input의 데이터3개는 각각 {y , x , 회원번호}를 뜻한다.
		input의 데이터를 영화관에 기록후 출력

        비어있는자리는 추가할수있고, 이미 예약된자리는 추가할수없다. 단, 본인이 예매한자리는 취소가된다.
		[예]

		---------------------------------------------------------
	    [1] { 1,1,1001 }
	    {출력 : 예매를 완료합니다.}
	 	{
			{0	,   0,	0},
			{0	,1001,	0},
			{0	,   0,	0},
			{0	,   0,	0}
		};

		---------------------------------------------------------
	    [2] { 2,2,1003 }
	    {출력 : 예매를 완료합니다.}
	 	{
			{0   ,    0,    0},
			{0   , 1001,    0},
			{0   ,    0, 1003},
			{0   ,    0,	0}
		};

		---------------------------------------------------------
	    [3] { 0,0,1006 }
	    {출력 : 예매를 완료합니다.}
	 	{
			{1006,  0,	 0},
			{0	,1001,	 0},
			{0	,   0,1003},
			{0	,   0,	 0}
		};

		---------------------------------------------------------
	    [4] { 1,1,5422 }
	 	{출력 : 이미 예매한 자리입니다.}

		---------------------------------------------------------
		[5] {0,0,1006} //1006 본인 자리이므로 예매 취소가된다.
		{출력 : 예매를 취소합니다.}
	 	{
			{0  ,   0,	 0},
			{0	,1001,	 0},
			{0	,   0,1003},
			{0	,   0,	 0}
		};
	 */


    public static void main(String[] args) {

        int[][] cinema = {
                {0,0,0},
                {0,0,0},
                {0,0,0},
                {0,0,0}
        };

        int input[][] = {
                {1,1,1001},
                {2,2,1003},
                {0,0,1006},
                {1,1,5422},
                {0,0,1006},
        };
        System.out.println(cinema.length);
        for(int i = 0; i < input.length; i++){
            if(cinema[input[i][0]][input[i][1]] == 0){
                cinema[input[i][0]][input[i][1]] = input[i][2];
                System.out.println("예매가 완료되었습니다.");
                for(int j = 0; j < cinema.length; j++){
                    System.out.println(Arrays.toString(cinema[j]));
                }
                System.out.println("-----------------------------------------");
            } else if(cinema[input[i][0]][input[i][1]] == input[i][2]){
                cinema[input[i][0]][input[i][1]] = 0;
                for(int j = 0; j < cinema.length; j++){
                    System.out.println(Arrays.toString(cinema[j]));
                }
                System.out.println("예매를 취소합니다.");
                System.out.println("-----------------------------------------");
            }
            else {
                System.out.println("예약된 자리입니다.");
                System.out.println("-----------------------------------------");
            }
        }



    }
}
