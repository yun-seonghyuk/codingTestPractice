package array5;

public class FindMultipleDecimals {

    /*
     * [소수여러개찾기]
     * 정수 한 개를 입력받아, 2부터 해당 숫자까지의 모든 소수 출력
     * 예)
     * 입력 : 20
     * 2, 3, 5, 7, 11, 13, 17, 19
     */

    public static void main(String[] args) {

        int num = 20;

        System.out.println(4 % 2 == 0);

        for (int i = 2; i <= num; i++) {
            int cnt = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }
            if (cnt < 3) {
                System.out.print(i + " ");
            }

        }

    }

}
