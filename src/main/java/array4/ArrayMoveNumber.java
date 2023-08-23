package array4;

import java.util.Scanner;

public class ArrayMoveNumber {
    /*
	 * [숫자이동]
	   0. 아래배열을 사각형으로 출력한다.
	 * 1. 각숫자는 기능이 있다.
	 * 	 [1] 숫자8는 플레이어이다.
	 *   [2] 숫자0은 이동할수있는 길이다.
	 *   [3] 숫자1은 이동불가능한 벽이다.
	 *   [4] 숫자3은 골인지점이다.
	 * 2. System.out.println("1.left  2.right 3.up 4.down");
	 * 	  	번호를 입력받고 각 방향으로 한칸씩 이동 가능
	 *
	 * 3. left
	  		{1,1,1,1,1,
			 1,0,0,0,1,
			 1,8,0,0,1,
		     1,0,0,0,3,
			 1,1,1,1,1};

	 * 4.계속 이동하다가 3에 도착하면 종료.
	 */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] game = {
                1,1,1,1,1,
                1,0,0,0,1,
                1,0,8,0,1,
                1,0,0,0,3,
                1,1,1,1,1
        };

        int player = 12; // 현재 플레이어위치



        while (true){
            for(int i = 0; i < game.length; i++){
                System.out.print(game[i] + " ");
                if (i % 5 == 4){
                    System.out.println();
                }
            }
            System.out.println("1.left  2.right 3.up 4.down");

            if(player == 19){
                System.out.println("종료");
                break;
            }
            int sel = scan.nextInt();


            if(sel == 1 && game[player-1] != 1){
                game[player] = 0;
                player--;
                game[player] = 8;
            } else if(sel == 2 && game[player+1] != 1){
                game[player] = 0;
                player++;
                game[player] = 8;
            } else if(sel == 3 && game[player-5] != 1){
                game[player] = 0;
                player-=5;
                game[player] = 8;
            }else if(sel == 4 && game[player+5] != 1){
                game[player] = 0;
                player+=5;
                game[player] = 8;
            } else {
                System.out.println("없는 번호입니다.");
            }
        }

    }
}
