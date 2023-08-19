package Array3;

import java.util.Arrays;

public class ArrayDelete3 {
    /*

		 [문제] 값을 입력받고 삭제
		 [조건] 만약에 같은값이 여러개 있으면 가장첫번째의 값  한개만 삭제 후
		 		b 에 순차적으로 저장

		 		   data[] = {5,2,6,8,5,6};

		 [예] 2 ==>  b [] = {5,6,8,5,6,0};
		 [예] 6 ==>  b [] = {5,2,8,5,6,0};
	 */
    public static void main(String[] args) {

        int data[] ={5,2,6,8,5,6};
        int b [] = {0,0,0,0,0,0};

        int value = 6;
        int idx = 0;
        boolean flag = false;
        for(int i = 0; i < data.length; i++){
            if(value == data[i] && flag == false){
                System.out.println(i);
                data[i] = 0;
                flag = true;
            }
            if(data[i] != 0){
                b[idx++] = data[i];
            }
        }
        System.out.println(Arrays.toString(b));
        /*
          [문제] c 배열을 아래와같이 삼각형모양으로출력한다.
           1
           23
           456
           7890
	     */
        int c [] = {1,2,3,4,5,6,7,8,9,0};
        int cnt = 1;
        idx= 1;
        for(int i = 0; i < c.length; i++){
            System.out.print(c[i]); // 23
                                    // 456
            if(cnt == idx){         // 7890
                cnt++;//3
                idx = 0;//0
                System.out.println();
            }
            idx++;//3
        }

        int seatList[] = {1003,1003,0,0,1002,0,1001};
        int seatIndex[] = {1,1,4};
        int userList [] = {1003,1002,1005};

        for(int i = 0; i < userList.length; i++){
            if(seatList[seatIndex[i]] == userList[i]){
                seatList[seatIndex[i]] = 0;
                System.out.println("예매 취소 합니다. "+Arrays.toString(seatList));
            } else if(seatList[seatIndex[i]] == 0){
                seatList[seatIndex[i]] = userList[i];
                System.out.println("자리를 예매 합니다. "+Arrays.toString(seatList));
            } else if(seatList[seatIndex[i]] != 0 &&
                    seatList[seatIndex[i]] != userList[i]){
                System.out.println("이미 있는 자리입니다. "+ userList[i] + " x");
            }
        }
    }
}
