package array3;

import java.util.Arrays;

public class Array3Test1 {
    /*
      *   [문제] 삭제할 값을 입력받고 data배열에서 삭제후 b에 저장
          int data[] = {5,2,6,8,5,6};

          [조건] 만약에 같은값이 여러개 있으면 전부 삭제 후 b 에 순차적으로 저장
          [예] 5 ==> b [] = {2,6,8,6,0,0};
          [예] 6 ==> b [] = {5,2,8,5,0,0};
      */
    public static void main(String[] args) {

        int data[] = {5,2,6,8,5,6};
        int b [] = {0,0,0,0,0,0};

        int value = 6;
        int idx = 0;
        for(int item : data){
            if(item != value){
                b[idx++] = item;
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
