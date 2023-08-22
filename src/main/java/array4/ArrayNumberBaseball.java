package array4;

import java.util.Arrays;
import java.util.Random;

public class ArrayNumberBaseball {
    /*
     * [숫자 야구 게임]
     * 1. me에 1~9 사이의 숫자 3개를 저장
     *    (단, 중복되는 숫자는 저장 불가)
     *    예) 1,1,1
     * 2. com과 me를 비교해 정답을 맞출 때까지 반복
     * 3. 숫자와 자리가 같으면 		strike += 1
     *    숫자만 같고 자리가 틀리면 	ball += 1
     * 예)
     * 정답 : 1 7 3
     * 3 1 5		: 2b
     * 1 5 6		: 1s
     * ...
     *
     */
    public static void main(String[] args) {
        Random ran = new Random();
        int[] com = {1, 7, 3};
        int[] me = new int[3];
        int cnt = 0;
        while (true){
            int idx = 0;
            int s = 0;
            int b = 0;

            while(true){
                int r = ran.nextInt(9)+1;
                if(idx == me.length){
                    break;
                }
                boolean check = false;
                for(int i = 0; i < idx; i++){
                    if(me[i] == r){
                        check = true;
                        break;
                    }
                }
                if(check == false){
                    me[idx++] = r;
                }
            }

            for(int i = 0; i < me.length; i++){
                for(int j = 0; j < me.length; j++){
                    if(com[i] == me[j] && i == j) {
                        s++;
                    } else if(com[i] == me[j] && i != j){
                        b++;
                    }
                }
            }
            cnt++;
            System.out.println(Arrays.toString(me) + " s :"+s+" b :"+b);
            if(s == 3){
                System.out.println(cnt);
                break;
            }
        }

    }
}
