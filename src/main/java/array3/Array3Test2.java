package array3;

import java.util.Arrays;

public class Array3Test2 {
    /*
	 *   [문제] 값을 입력받고 삭제
		 [조건] 만약에 같은값이 여러개 있으면 가장 마지막의값 한개만 삭제 후 b 에 순차적으로 저장

		 [예] 5 ==> b [] = {5,2,6,8,6,0};

		 [예] 6 ==> b [] = {5,2,6,8,5,0};
	 */
    public static void main(String[] args) {

        int data[] = {5,2,6,8,5,6};
        int b [] = {0,0,0,0,0,0};
        int value = 6;
        int findIdx = 0;

        for(int i = 0; i < data.length; i++){
            if(data[i] == value){
                findIdx = i;
            }
        }
        System.out.println(findIdx);
        int bIdx = 0;
        for(int i = 0; i < data.length; i++){
            if(i != findIdx){
                b[bIdx++] = data[i];
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
