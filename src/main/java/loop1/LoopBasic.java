package loop1;

public class LoopBasic {

    public static void main(String[] args) {
        // 1 ~ 10 까지 반복해 5 ~ 9 출력
        int idx = 1;
        while(idx < 10){
            idx+=1;
            if(idx >= 5 && idx <= 9){
                System.out.print(idx+" ");
            }
        }
        System.out.println();


        // 10 ~ 1 까지 반복해 6 ~ 3 거꾸로 출력

        idx = 10;

        while(idx >= 1){
            idx--;

            if(idx <= 6 && idx >= 3){
                System.out.print(idx+" ");
            }
        }
        System.out.println();

        // 1 ~ 10 까지 반복해 짝수만 출력
        idx = 1;
        while(idx < 10){
            idx++;
            if(idx % 2 == 0) {
                System.out.print(idx+" ");
            }
        }
    }

}
