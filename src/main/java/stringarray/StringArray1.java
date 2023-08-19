package stringarray;

import java.util.Arrays;

public class StringArray1 {
    public static void main(String[] args) {
        // 문제) 이름은 name배열에 성적은 score배열에 각각 저장 및 출력

        String str = "김철수/87,이만수/42,이영희/95";

        String[] name = new String[3]; // 김철수,이만수,이영희
        int[] score = new int[3];      // 87,42,95

        String []token = str.split(",");
        for(int i = 0; i < token.length; i++){
            String []tmp = token[i].split("/");
            for(int j = 0; j < tmp.length; j ++){
                name[i] = tmp[0];
                score[i] = Integer.parseInt(tmp[1]);
            }
        }
        System.out.println(Arrays.toString(name));
        System.out.println(Arrays.toString(score));
    }
}
