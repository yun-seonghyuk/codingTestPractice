package array4;

public class Array4Test5 {
    public static void main(String[] args) {
        int arr1[] = {1,5,4,5,3,2,2,3,5,4,5,1};
        //위 배열들이 각각 팰린드롬인지 아닌지 출력하시요.

        //팰린드롬이란?

        // 앞에서부터 읽을 때와
        // 뒤에서부터 읽을 때 똑같은 숫자가 나오면 팰린드롬이다
        // 예) 2112
        // 예) 12321

        int reversIdx = arr1.length-1;
        boolean flag = false;

        for(int i = 0; i < arr1.length/2; i++){
            if(arr1[i] != arr1[reversIdx]){
                flag = true;
                break;
            }
            reversIdx--;
        }

        if(flag){
            System.out.println("팰린드롬이 아니다.");
        } else {
            System.out.println("팰린드롬 이다.");
        }

    }
}
