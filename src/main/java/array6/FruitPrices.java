package array6;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FruitPrices {
    public static void main(String[] args) {
        int itemdata[][] ={
                {1001,500},
                {1002,1500},
                {1003,800},
                {1004,600},
                {1005,1200}
        };

        int orderData []= {1001,1003,1005,1002,1001,1005,1003,};
        int countData[] = {2,   4,   3,   1,   2,   3,   4,};

		/*
		  	itemdata 는 상품 정보이다.
		  	상품번호,가격 이 한쌍이다.

		 	orderdata 는 주문정보이다.
		 	countdata 는 주문개수이다.

		 	total 배열에 각 아이템 번호변 주문 총합을 저장후 출력

		 	[예시]
		 		1001번은 4개 주문했으므로 2000  => total = {2000}
		 		1002번은 1개 주문했으므로 1500  => total = {2000,1500}
		 		...

		 */

        int total[] = new int[5];
        int idx = 0;

        for(int i = 0; i < itemdata.length;i++){
            for(int j = 0; j < orderData.length; j++){
                if(itemdata[i][0] == orderData[j]){
                    total[idx] += itemdata[i][1] * countData[j];
                }
            }
            idx++;
        }
        System.out.println(Arrays.toString(total));
    }

}
