package stringarray2;

import java.util.Scanner;

public class WordSearch {
    /*
     * # 단어 검색
     * 1. 단어를 입력받아 text변수 문장 속에 해당 단어가 있는지 검색한다.
     * 2. 단어가 존재하면 전부출력한다.
     * 3. 부분검색도 되어야한다.
     * 	예) ch ==> school , teacher , child
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] text = {"school" , "teacher" , "child" ,"father" , "love"};


        System.out.print("검색할 단어를 입력하세요 : ");
        String word = scan.nextLine();

    }
}
