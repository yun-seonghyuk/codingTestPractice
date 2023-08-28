package array5;

public class Array5OverdueBooks {
    /*
     *  아래 와 같은데이터일때 도서 연체여부 출력(단, 윤년은 계산하지않는다)
     */

    public static void main(String[] args) {
        int rentalPeriod = 70;
        int [] rentalDay = {2020 , 12, 29};
        int [] today = {2021, 3, 10};

        int monthList[] = {31, 28, 31, 30, 31, 31, 30,
                31 , 30 , 31 , 30 , 31};

        int sum = 0;
        int day = monthList[monthList.length-1] - rentalDay[2];
        for(int i = 0; i < today[1]-1; i++){
            sum += monthList[i];
        }
        System.out.println(sum + day + today[2]);
        int result = rentalPeriod -  (sum + day + today[2]);

        if(result < 0){
            System.out.println("연체입니다");
        } else {
            System.out.println("연체가 아닙니다.");
        }
        System.out.println(result);
    }
}
