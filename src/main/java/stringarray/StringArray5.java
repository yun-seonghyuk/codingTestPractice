package stringarray;

import java.util.Scanner;

public class StringArray5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = "코끼리";

        while(true){
            System.out.println("동물 이름을 입력하세요 : ");
            String myName = scan.next();
            boolean check = true;

            if(myName.equals("종료할래요")){
                System.out.println("프로그램 종료");
                System.exit(0);
            }
            for(int i = 0; i < name.length(); i++){
                if(name.charAt(i) != myName.charAt(i)){
                    check = false;
                    break;
                }
            }

            if(check == true){
                System.out.println("정답입니다.");
            } else{
                System.out.println("틀렸습니다.");
            }
        }


//        String start = "자전거";
//
//        while(true){
//            System.out.println("제시어 : " + start);
//
//            String str = scan.next();
//
//            if(str.equals("종료")){
//                System.out.println("프로그램 종료");
//                System.exit(0);
//            }
//
//            if(str.charAt(0) == start.charAt(start.length()-1)){
//                start = str;
//            } else {
//                System.out.println("다시 확인해주세요.");
//            }
//        }

    }
}
