package array6;

import java.util.Arrays;

public class FruitPrices2 {
    public static void main(String[] args) {
        int itemdata[][] ={
                {1001,500},
                {1002,1500},
                {1003,800},
                {1004,600},
                {1005,1200}
        };

        int orderdata [][] = {
                {1001,4},
                {1003,2},
                {1005,3},
                {1002,1},
                {1001,2},
                {1005,5},
                {1003,1},
        };
        int totaldata[][] = new int[itemdata.length][3];

		/*
		  	itemdata 는 상품 정보이다.
		  	상품번호,가격 이 한쌍이다.

		 	orderdata 는 주문정보이다.

		 	상품번호,개수가 한쌍이다.
		 	아래 total 데이터에 아이템번호 주문개수 판매가격을 저장후 출력

		[예시]
			{1001 , 6 , 3000}
			{1002 , 1 , 1500}
			{1003 , 3 , 2400}
			{1004 , 0 , 0};
			{1005 , 8 , 9600}
		 */

        for(int i = 0; i < orderdata.length; i++){
            for(int j = 0; j < itemdata.length; j++){
                totaldata[j][0] = itemdata[j][0];
                if(itemdata[j][0] == orderdata[i][0]){
                    totaldata[j][1] += orderdata[i][1];
                    totaldata[j][2] += itemdata[j][1] * orderdata[i][1];
                }
            }
        }

        for(int[] item : totaldata){
            System.out.println(Arrays.toString(item));
        }
    }
}
