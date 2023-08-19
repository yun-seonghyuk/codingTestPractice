package stringarray;

import java.util.Arrays;
import java.util.Random;

public class StringArrayTest3 {
    /*
     * 1) userData 는 학생 번호 데이터이다
     * 2) scoreData 는 학생 점수 데이터이다.
     *
     * 3) 1등 번호 출력
     *  - 예) 1003 : 43
     *
     * 4) 전체 평균 출력
     *  - 예) (10 + 21 + 43 + 12) / 4.0
     */
    public static void main(String[] args) {
        String userData = "1001,1002,1003,1004";
        String scoreData = "10,21,43,12";

        String[] name = userData.split(",");
        String[] tempScores = scoreData.split(",");
        int[] scores = new int[name.length];
        int sum = 0;
        int max = 0;
        int maxIdx = 0;
        for(int i = 0; i < name.length; i++){
            scores[i] = Integer.parseInt(tempScores[i]);
            sum += scores[i];
            if(max < scores[i]){
                max = scores[i];
                maxIdx = i;
            }
        }

        System.out.println(name[maxIdx] + " : "+scores[maxIdx]);
        System.out.println(sum);
        System.out.println(sum / name.length);


        int[] scoreList = {12, 32, 54, 43};
        String data = "";

        for(int i = 0; i < scoreList.length; i++){
            for(int j = 0; j < i; j++){
                if(scores[i] > scoreList[j]){
                    int temp = scoreList[i];
                    scoreList[i] = scoreList[j];
                    scoreList[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(scoreList));
        for(int item : scoreList){
            data+= item + ",";
        }
        data = data.substring(0,data.length()-1);
        System.out.println(data);
        String[] words = {"java", "mysql", "jsp", "spring"};
        Random ran = new Random();
        for(int i = 0; i < 100; i++){
            int r1 = ran.nextInt(4);
            int r2 = ran.nextInt(4);

            String temp = words[r1];
            words[r1] = words[r2];
            words[r2] = temp;
        }
        System.out.println(Arrays.toString(words));

    }
}
