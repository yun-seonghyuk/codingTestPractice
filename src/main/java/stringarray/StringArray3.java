package stringarray;

import java.util.Arrays;

public class StringArray3 {
    public static void main(String[] args) {
        String str = "김철수/87,이만수/42,이영희/95";

        // 위 데이터에서 꼴등을 삭제후 다시 문자열로 변경

        //1) 문자열을 잘라서 배열에 저장한다.
        //2) 배열에서 꼴등을 삭제한다
        //3) 삭제한배열을 다시 문자열로 만든다.

        // str = "김철수/87,이영희/95";

        String[] token = str.split(",");
        int[] score = new int[token.length];
        int min = Integer.MAX_VALUE;
        int idx = 0;
        for (int i = 0; i < token.length; i++) {
            String[] temp = token[i].split("/");
            score[i] = Integer.parseInt(temp[1]);
            if (score[i] < min) {
                min = score[i];
                idx = i;
            }
        }

        for (int i = 0; i < token.length; i++) {
            if (idx == i) {
                token[i] = "";
            }
        }
        str = "";
        for (int i = 0; i < token.length; i++) {
            if (!token[i].equals("")) {
                str += token[i] + ",";
            }
        }
        System.out.println(str.substring(0, str.length() - 1));
    }
}
