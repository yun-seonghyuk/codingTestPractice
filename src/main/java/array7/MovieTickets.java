package array7;

import java.util.Arrays;
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
        int idSize = 0;
        int log = -1;
        int seatList[][] = new int[ROW][COL];
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println(Arrays.toString(idList));
            System.out.println("영화관 좌석예매");
            System.out.println("(1)회원가입 (2)로그인 (0) 종료");

            int sel = scan.nextInt();

            if (sel > 2 || sel < 0) {
                System.out.println("해당 인덱스 범위를 벗어남");
                continue;
            }

            if (sel == 1) {
                if (idSize == MAX) {
                    System.out.println("회원가입을 할수없습니다.");
                    continue;
                }

                System.out.println("아이디 입력 : ");
                int id = scan.nextInt();

                if(id < 0){
                    System.out.println("이용할수 없는 아이디 입니다.");
                    continue;
                }
                boolean flag = false;
                for (int i = 0; i < idList.length; i++) {
                    if (id == idList[i]) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    System.out.println("중복된 아이디가 있습니다.");

                } else {
                    idList[idSize++] = id;

                }
            } else if (sel == 2) {

                if (log == -1) {
                    System.out.println("로그인 화면");
                    System.out.println("아이디 입력 : ");
                    int id = scan.nextInt();

                    boolean flag = false;
                    for (int i = 0; i < idList.length; i++) {
                        if (id == idList[i]) {
                            flag = true;
                            log = id;
                            break;
                        }
                    }
                    if (flag) {
                        System.out.println("로그인 성공");
                    } else {
                        System.out.println("해당 아이디가 없습니다.");
                    }
                }

                if(log != -1){
                    while (true) {
                        System.out.println("(1) 로그아웃 (2) 예매 (3) 예매확인(본인것만 좌석번호출력 )\n" +
                                "(4) 예매취소(본인것만) (5) 전체확인 (0) 뒤로가기");
                        sel = scan.nextInt();

                        if (sel > 5 || sel < 0) {
                            System.out.println("해당 인덱스가 없습니다.");
                            continue;
                        }

                        if (sel == 1) {

                            log = -1;
                            System.out.println("로그아웃.");
                            break;
                        } else if (sel == 2) {
                            for (int i = 0; i < seatList.length; i++) {
                                System.out.println(Arrays.toString(seatList[i]));
                            }
                            System.out.println("좌석을 예매해주세요.");
                            sel = scan.nextInt();

                            if(sel < 0 || sel > ROW * COL - 1){
                                System.out.println("예매할수 없는 자리입니다.");
                                continue;
                            }

                            int size = 0;
                            boolean check = false;
                            for(int i = 0; i < seatList.length; i++){
                                for(int j = 0; j < seatList[i].length; j++){
                                    if(sel == size){
                                        if(seatList[i][j] == 0){
                                            seatList[i][j] = log;
                                            System.out.println("예매가 완료 되었습니다.");
                                            check = true;
                                            break;
                                        } else {
                                            System.out.println("이미 예매된 자리입니다.");
                                            check = true;
                                            break;
                                        }
                                    }
                                    size++;
                                }
                                if (check){
                                    break;
                                }
                            }
                        } else if (sel == 3) {
                            boolean check = false;
                            int size = 0;
                            for(int i = 0; i < seatList.length; i++){
                                for(int j = 0; j < seatList[i].length; j++){
                                    if(log == seatList[i][j]){
                                        check = true;
                                        System.out.println("좌석번호 : "+size);
                                    }
                                    size++;
                                }
                            }
                            if (!check){
                                System.out.println("예매된 자리가 없습니다.");
                            }
                        } else if (sel == 4) {
                            for(int i = 0; i < seatList.length; i++){
                                System.out.println(Arrays.toString(seatList[i]));
                            }

                            System.out.println("취소할 자리를 입력해주세요.");
                            sel = scan.nextInt();

                            int size = 0;
                            boolean check = false;

                            for(int i = 0; i < seatList.length; i++){
                                for(int j = 0; j < seatList[i].length; j++){
                                    if(sel == size){
                                        if(seatList[i][j] == 0){
                                            System.out.println("자리가 없는 자리입니다.");
                                            check = true;
                                            break;
                                        }else if(seatList[i][j] == log){
                                            System.out.println("예매가 취소되었습니다.");
                                            seatList[i][j] = 0;
                                            check = true;
                                            break;
                                        } else if(seatList[i][j] != log){
                                            System.out.println("내가 예매한 자리가 아닙니다.");
                                            check = true;
                                            break;
                                        }
                                    }
                                    size++;
                                }
                                if (check){
                                    break;
                                }
                            }

                        } else if (sel == 5) {
                            for (int i = 0; i < seatList.length; i++) {
                                System.out.println(Arrays.toString(seatList[i]));
                            }
                        } else if (sel == 0) {
                            System.out.println("뒤로가기");
                            break;
                        }
                    }
                }

            } else if (sel == 0) {
                System.out.println("종료");
                break;
            }
        }

    }
}
