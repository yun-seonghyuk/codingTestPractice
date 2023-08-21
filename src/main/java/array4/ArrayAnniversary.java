package array4;

public class ArrayAnniversary {
    /*
	 * [기념일]
	 *
	 *  철수와 영희는 3월 3일에 만났다.
		 철수는 영희와 100일 기념일에 축하파티를 할려고한다.
		 만난지 100일뒤는  몇월몇일인가?
		 단 윤년은 계산하지않는다.
	 */
    public static void main(String[] args) {
        int monthList[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int day = 3;
        int month = 3;

        int total = 0;
        for(int i = 0; i < month; i++){
            total += monthList[i];
            if(i == month-1){
                total-= (monthList[i]-day);
            }
        }
        total += 100;
        month = 0;
        int result = 0;
        while(true){
            result = result +  monthList[month];
            if(total <= result){
                break;
            } else {
                month++;
            }
        }

        day = monthList[month] - (result-total);

        System.out.println((month+1)+"월" + day +"일");
    }
}
