package array7;

import java.util.Scanner;

public class MovieTickets {
    /*
     * [영화관좌석예매]
     * (1)회원가입 (2)로그인  (0) 종료
     *
     * [회원가입] ==> id 만 가입 ==> 중복처리
     * [로그인후] ==> (1) 로그아웃 (2) 예매 (3) 예매확인(본인것만 좌석번호출력 )
     *              (4) 예매취소(본인것만) (5) 전체확인 (0) 뒤로가기
     *
     * 1) 회원가입은 10명까지 가능하다.
     * 2) idList 에는 회원들의 id를 저장
     * 3) 로그인이후 좌석을 구매하면 seatList 는 구매한사람의 id 를저장
     * 4) 필요한변수는 추가할수있다.
     */
    public static void main(String[] args) {
        final int MAX = 10;
        final int ROW = 3;
        final int COL = 4;
        int idList[] = new int[MAX];
        int seatList[][]= new int[ROW][COL];
        Scanner scan = new Scanner(System.in);

    }
}
