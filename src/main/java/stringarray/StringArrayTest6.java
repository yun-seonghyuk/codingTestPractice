package stringarray;

import java.util.Arrays;

public class StringArrayTest6 {
    public static void main(String[] args) {

        /*
			1) data 는 학생번호와 , 이름을 문자열로 저장해놓은것이다.
			2) 아래 배열에 각각 잘 저장해서 출력
		 */

        String data = "1001/김철수\n";
        data += "1002/이만수\n";
        data += "1003/이영희";
        System.out.println(data);
        String[] token = data.split("\n");

        int[] numList = new int[token.length];
        String[] nameList = new String[token.length];

        for(int i = 0; i < numList.length; i++){
            String[] temp = token[i].split("/");
            nameList[i] = temp[1];
            numList[i] = Integer.parseInt(temp[0]);
        }
        System.out.println(Arrays.toString(nameList));
        System.out.println(Arrays.toString(numList));

    }
}
