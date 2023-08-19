package stringarray;

public class StringArrayTest {
    /*
     * 1) id[] 는  아이디를 저장해놓은 배열이다.
     *
     * 2) find 는  로그인할 아이디 이다.
     *
     * 3) find 의 값이 id[] 에 있으면 "로그인", 없으면 "로그인실패" 출력.
     *
     *
     */
    public static void main(String[] args) {
        String id[] = {"qwer", "asdf", "zxc"};

        String find = "asd";
        boolean flag = false;
        for(String str : id){
            if(str.equals(find)){
                flag = true;
                break;
            }
        }
        if (flag == true){
            System.out.println("로그인");
        } else {
            System.out.println("로그인 실패");
        }
    }
}
