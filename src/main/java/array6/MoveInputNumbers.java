package array6;

import java.util.Arrays;

public class MoveInputNumbers {
    /*
		 [숫자이동게임]
		 move = {1,0,0,0,8,0,0,0,1};
		 [1] move 안의 8은 플레이어이다
		 [2] move 안의 0은 이동할수있는 길이다.
		 [3] move 안의 1은 이동할수없는 벽이다.

		 input 배열의 내용을 순차적으로 실행하고,결과출력하시오.
		 input 의 값 중 1은 왼쪽이동 , 2는 오른쪽이동이다.
		 벽에서 이동하면, "이동할수없습니다" 출력
		 시작=> {1,0,0,0,8,0,0,0,1};
		 1 ==> {1,0,0,8,0,0,0,0,1};
		 1 ==> {1,0,8,0,0,0,0,0,1};
		 1 ==> {1,8,0,0,0,0,0,0,1};
		 1 ==> "이동할수없습니다"
		 2 ==> {1,0,8,0,0,0,0,0,1};
		 2 ==> {1,0,0,8,0,0,0,0,1};
		 2 ==> {1,0,0,0,8,0,0,0,1};
	 */
    public static void main(String[] args) {

        int move[] = {1,0,0,0,8,0,0,0,1};
        int input[] = {1,1,1,1,2,2,2};


        for(int i = 0; i < input.length; i++){
            for(int j = 0; j < move.length; j++){
                if(input[i] == 1 && move[j] == 8 && move[j-1] == 0) {
                    move[j] = 0;
                    move[j - 1] = 8;
                    System.out.println(Arrays.toString(move));
                    break;
                }else if(input[i] == 2 && move[j] == 8 && move[j + 1] == 0){
                    move[j] = 0;
                    move[j + 1] = 8;
                    System.out.println(Arrays.toString(move));
                    break;
                }

                if(move[j] == 8 && (move[j - 1] == 1 || move[j + 1] == 1)){
                    System.out.println("이동할수없습니다.");
                    break;
                }
            }
        }
    }
}
