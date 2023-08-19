package stringarray;

import java.util.Arrays;

public class StringArrayTest5 {
    public static void main(String[] args) {


        String data = "qwer/100,asdf/23,zxc/43";
        String[] token = data.split(",");
        String id[] = new String[token.length];
        int score[] = new int[token.length];
        /*
         * 1) data 를 id 와 score 에 저장후 출력
         */


        for(int i = 0; i < token.length; i++){
            String[] temp = token[i].split("/");
            id[i] = temp[0];
            score[i] = Integer.parseInt(temp[1]);
        }

        System.out.println(Arrays.toString(id));
        System.out.println(Arrays.toString(score));
        /*
			1) numList 는 학생번호와를 저장한것이고
			2) nameList 는 이름을 문자열로 저장해놓은것이다.
			3) 위 두 배열로 아래와 같이 data 에 저장
				"1001/김철수,1002/이만수,1003/이영희";
		 */


        int numList[] = {1001,1002,1003};
        String nameLsit[] = {"김철수" , "이만수" , "이영희"};
        data = "";

        for (int i = 0; i < numList.length; i++) {
            data += numList[i] + "/" + nameLsit[i] + ",";
        }
		data = data.substring(0, data.length()-1);

        System.out.println(data);

    }
}
