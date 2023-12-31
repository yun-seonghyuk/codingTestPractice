package array6;

import java.util.Arrays;

public class InputShopping {
    /*
		 nameList 배열은 상품이름리스트 ,
		 dataList 2차원배열은 각각 가격 , 상품개수 리스트목록이다 .
		예) 현재 재고는 새우깡은 3개 , 감자깡 1개 , 고래밥 1개 있다.
		 아래 배열은 오늘 주문이 들어온순서이다.
		 총매출을 출력해보세요.


		예) 첫번째 1 ==> 감자깡의 개수는 1이므로 판매할수있다.
		예) 두번째 2 ==> 고래밥의 개수는 1이므로 판매할수있다.
		예) 세번째 2 ==> 고래밥의 개수가 이미 두번째에서 구입해서 0이되므로 판매불가.
		   ....
		   ....
		 주문은 총  새우깡 2개 , 감자깡 3개 , 고래밥 3개 들어왔지만 ,
		 실제 판매한 품목은  새우깡 2개 , 감자깡 1개 , 고래밥 1개 이다.
	*/
    public static void main(String[] args) {

        String titleList[] = {"새우깡" , "감자깡" , "고래밥"};
        int dataList[][] = {
                {1000, 3},
                {2300, 1},
                {3100, 1}
        };
        int [] input = {1,2,2,0,0,2,1,1};

        int[] count = new int[3];

        for(int i = 0; i < input.length; i++){
            if(dataList[input[i]][1] != 0){
                dataList[input[i]][1]--;
                count[dataList[input[i]][1]] += 1;
            }
        }
        int result = 0;
        for(int i = 0; i < count.length; i++){
            result += dataList[i][0] * count[i];
        }
        System.out.println(Arrays.toString(count));
        System.out.println(result);


    }
}
