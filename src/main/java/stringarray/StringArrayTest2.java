package stringarray;

import java.util.Arrays;

public class StringArrayTest2 {
    /*
     * 1) id[] 는  아이디를 저장해놓은 배열이다.
     *
     * 2) id[] 를 오름차순으로 정렬
     */
    public static void main(String[] args) {
        String id[] = {"qwer" , "asdf" , "zxc" , "erer"};


        for(int i = 0; i < id.length; i++){
            for(int j = 0; j < id.length; j++){
                if(id[i].compareTo(id[j]) < 1){
                    String temp = id[i];
                    id[i] = id[j];
                    id[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(id));
        /*
		user 의 값이 userData 에 있는 지 검사
	 */
        String userData = "1001,1002,1003,1004";
        int user = 1003;

        String[]temp = userData.split(",");
        String userStr = String.valueOf(user);
        boolean flag = false;
        for(int i = 0; i < temp.length; i++){
            if(temp[i].equals(userStr)){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("있다");
        } else{
            System.out.println("없다");
        }
    }
}
