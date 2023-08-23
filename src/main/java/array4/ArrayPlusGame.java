package array4;

import java.util.*;

public class ArrayPlusGame {
    /*
	  [더하기게임]
		1) 1~10 사이의 숫자를 랜덤으로 7개보여준다. (중복금지)
		2) 그안에서 3개의 인덱스를 고를수있게해준다. (중복금지)
		3) 숫자를 하나 제시하는데  인덱스3개의 값의 합이
		   제시된 숫자랑 같으면 정답.
		   단, 정답은 여러개 일수있다.
		4) 반드시 정답의 경우의 수는 있어야한다.
		   단! 중복으로 값을 고를순없다.
		 [예]
		    보기  = {1,5,8,6,4,2,9};
		    제시어 = 13
		    정답) 인덱스 ==> 0,2,4  ==>  1 + 8 + 4

		    잘못된예) 인덱스 ==> 5,5,6 ==> 2 + 2 + 9
	*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();


        // 게임 시작
        System.out.println("[플러스 게임]");

        while (true) {
            // 중복되지 않는 숫자
            Set<Integer> set = new HashSet<>(Arrays.asList());
            int r = 0;
            while (true) {
                r = ran.nextInt(10) + 1;
                set.add(r);
                if (set.size() == 7) {
                    break;
                }
            }

            // 중복되지않는 3개의 인덱스
            Set<Integer> total = new HashSet<>(Arrays.asList());
            int result = 0;
            while (true) {
                r = ran.nextInt(7);
                total.add(r);
                if (total.size() == 3) {
                    break;
                }
            }

            // 중복되지않는 3개의 인덱스의 합
            for (int i = 0; i < 3; i++) {
                result += (int) set.toArray()[(int) total.toArray()[i]];
            }

            int sum = 0;
            int[] duplicateIndex = {100, 100, 100};
            int idx = 0;
            System.out.println("1. 종료  2 . 게임시작");
            int sel = scan.nextInt();

            if (sel == 1) {
                System.out.println("프로그램 종료.");
                break;
            } else if (sel == 2) {

                while (true) {
                    System.out.println(set);
                    System.out.println(result);

                    sel = scan.nextInt();

                    if (sel == -1000) {
                        System.out.println("뒤로가기");
                        break;
                    }

                    if (sel < 0 || sel > set.size()) {
                        System.out.println("해당 범위를 벗어남.");
                    }

                    boolean check = false;
                    for (int i = 0; i < idx; i++) {
                        if (duplicateIndex[i] == sel) {
                            System.out.println(duplicateIndex[i]);
                            check = true;
                            break;
                        }
                    }

                    if (check == false) {
                        duplicateIndex[idx] = sel;
                        idx++;
                        sum += (int) set.toArray()[sel];
                    } else {
                        System.out.println("이미 고른 인덱스 입니다.");
                    }

                    if (idx == 3) {
                        if (sum == result) {
                            System.out.println("정답입니다.");
                            break;
                        } else {
                            System.out.println("틀렸습니다.");
                        }
                    }
                }
            }

        }

    }
}
