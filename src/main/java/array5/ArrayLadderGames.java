package array5;

import java.util.Scanner;

public class ArrayLadderGames {

    /*
     * # 사다리 게임
     * 1. 인덱스 0~4를 하나선택한다. (가로개수가 5개)
     * 2. 숫자 0 을 만나면 그냥 아래로 내려간다.
     * 3. 숫자 1 을 만나면 오른쪽으로 이동후 내려간다.
     * 4. 숫자 2 를 만나면 완쪽으로 이동후 내려간다.
     * 5. 오늘의 메뉴 출력
     *
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String menu[] = {"떡라면" , "돈까스" ,"짜장면" , "쫄면" , "된장찌개"};

        int ladder[][]= {
                {0,0,0,0,0},
                {1,2,0,1,2},
                {0,1,2,0,0},
                {0,0,1,2,0},
                {1,2,0,1,2},
                {0,1,2,0,0},
                {0,1,2,0,0},
                {0,0,1,2,0},
                {0,0,0,0,0}};
        System.out.println("인덱스를 선택해주세요.");
        int idx = scan.nextInt();

        if(idx < 0 || idx > menu.length-1){
            System.out.println("범위를 벗어남");
        } else {
            for (int i = 0; i < ladder.length; i++) {
                if (ladder[i][idx] == 1) {
                    ladder[i][idx] = ladder[i][++idx];

                } else if (ladder[i][idx] == 2) {
                    ladder[i][idx] = ladder[i][--idx];
                }
            }
            System.out.println(menu[idx]);
        }

    }
}
