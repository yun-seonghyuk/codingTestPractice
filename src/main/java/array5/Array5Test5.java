package array5;

public class Array5Test5 {
    /*
     * 아래와같이 구구단을 옆으로 출력해보세요.
     *
     * 2*1 = 2		3*1 = 3  .....  	9*1 = 9
     * 2*2 = 4  	3*2 = 6	 .....		9*2 = 18
     * 2*3 = 6  	3*3 = 9	 .....		9*3 = 27
     * ...      	...					...
     * ...      	...					...
     * 2*9 = 18		3*9 = 27 .....		9*9 = 81
     */
    public static void main(String[] args) {


        for(int i = 1; i <= 9; i++){
            for(int j = 2; j <= 9; j++){
                System.out.printf("%d x %d = %d\t\t",j,i, j*i);
            }
            System.out.println();
        }

    }
}
