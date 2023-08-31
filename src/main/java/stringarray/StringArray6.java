package stringarray;

import java.util.Random;
import java.util.Scanner;

public class StringArray6 {
    public static void main(String[] args) {
//        String jumin = "890101-2012932";
//
//        String gender = jumin.substring(7);
//        int birth = Integer.parseInt(jumin.substring(0,2));
//
//        if(gender.charAt(0) == '1'){
//            System.out.print("성별 남 ");
//        } else {
//            System.out.print("성별 여 ");
//        }
//        System.out.println((2023 -  (1900+birth) + 1)+ "살" );
        Random ran = new Random();
        Scanner scan = new Scanner(System.in);

        String[] words = {"java", "mysql", "jsp", "spring"};
        for(int i = 0 ; i < words.length;){
            int r1 = ran.nextInt(4);
            boolean check = false;
            for(int j = 0; j < i; j++){
                if (words[j] == words[r1]){
                    check = true;
                    break;
                }
            }
            if(check == false){
                String temp = words[i];
                words[i] = words[r1];
                words[r1] = temp;
                i++;
            }
        }

        int i = 0;
        System.out.println("타자연습 게임 : ");

        while(true){

            if(i >= 1){
                System.out.println("다음 제시어 : "+words[i]);
            }else {
                System.out.println("문제 : "+words[i]);
            }
            String input = scan.next();

            if(input.equals("프로그램 종료")){
                System.exit(0);
            }

            if(input.equals(words[i])){
                System.out.println("정답입니다");
                i++;
            } else {
                System.out.println("땡");
            }

            if(i == words.length){
                break;
            }
        }

    }
}
