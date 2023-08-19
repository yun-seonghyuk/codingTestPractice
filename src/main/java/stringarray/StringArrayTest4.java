package stringarray;

public class StringArrayTest4 {
    public static void main(String[] args) {

        /*
         * 1) id 와 score 를 data 에 저장
         * 2) 구분자는 / 와 , 를 이용한다.
         *
         * 	- 예) "qwer/100,asdf/23,zxc/43"
         *
         */

        String id[] = {"qwer" , "asdf" , "zxc"};
        int score[] = {100,23,43};

        String data = "";

        for(int i = 0; i < score.length; i++){
            data +=  id[i] + "/" + score[i] + ",";
        }
        data = data.substring(0, data.length()-1);

        System.out.println(data);
    }
}
