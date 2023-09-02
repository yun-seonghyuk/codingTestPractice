package array7;

import java.util.Arrays;

public class Rotate {
    /*
     * 문제)  아래 명령어를 입력받을때마다 block배열을 90도 회전해보세요.
     * [1.left_turn] [2.right_turn]
     *
     * 예) [1.left_turn] (왼쪽으로 90도 회전)
     *
     * 4 8 12 16
     * 3 7 11 15
     * 2 6 10 14
     * 1 5 9  13
     */

    public static void main(String[] args) {
        int block[][] = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
        };


        for(int i = block.length-1; i >= 0; i--){
            for(int j = 0; j < block.length; j++){
                System.out.print(block[j][i]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 0; i < block.length; i++){
            for(int j = block[i].length-1; j >= 0; j--){
                System.out.print(block[j][i]+" ");
            }
            System.out.println();
        }


    }

}
