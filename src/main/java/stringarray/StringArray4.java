package stringarray;

import java.util.Arrays;

public class StringArray4{

    public static void main(String[] args) {

        // 문자열 함수를 사용해서 풀어볼것
        String str = "11/100/89";
        // 문제 1) arr 배열에 각 점수를 저장하고, 총점 출력
        // 정답 1) 200
        int[] arr = new int[3];
        String[] strSplit = str.split("/");
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strSplit[i]);
            sum += arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(sum);

        // 문제 2) scores 배열의 각 점수를 슬러시를 구분자로 하나의 문자열로 연결
        // 정답 2) 11/100/89
        int[] scores = {11, 100, 89};
        String text = "";

        for (int i = 0; i < scores.length; i++) {
            text += scores[i] + "/";
        }
        System.out.println(text.substring(0, text.length() - 1));

        str = "김철수/87,이만수/42,이영희/95";

        String[] name = new String[3]; // 김철수,이만수,이영희
        int[] score = new int[3];

        String[] temp = str.split(",");
        System.out.println(Arrays.toString(temp));

        int y = temp.length;
        String[][] data = new String[y][];
        for (int i = 0; i < temp.length; i++) {
            String temp2[] = temp[i].split("/");
            data[i] = temp2;
        }
    }
}
