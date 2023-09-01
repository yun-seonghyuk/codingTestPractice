package array7;

import java.util.Arrays;

public class AddingAndDeletingInputs1 {
    /*
		1) array 배열은 사이즈3이다.
		2) input 배열 안의 값들은  추가와 삭제를 반복할 값들이다.
		3) 짝수인덱스의 값은 "추가" 이고,
		4) 홀수인덱스의 값은 "삭제" 이다.
		   [조건] 삭제한자리는 뒤에서부터 앞으로 밀어내고 0으로 표시 한다.
		5) 중복된값은 "추가" 할수없고 , 없는값은 "삭제"할수없다.
		6) input의 값들을 전부 처리하고 처리과정출력
		예)
		 10 ==> 짝수인덱스이므로 추가 ==> array[] = {10,0,0};
		 20 ==> 홀수인덱스이므로 삭제 ==> 20은 없으므로 ==> "삭제할값이 없습니다"
		 30 ==> 짝수인덱스이므로 추가 ==> array[] = {10,30,0};
		 10 ==> 홀수인덱스이므로 삭제 ==> array[] = {30,0,0};
		 30 ==> 짝수인덱스이므로 추가 ==> 30 은이미 저장되어서 ==> "중복됩니다"
		 30 ==> 홀수인덱스이므로 삭제 ==> array[] = {0,0,0};
	*/
    public static void main(String[] args) {

        int array[] = {0,0,0};
        int count = 0;

        int input[] = {10,20,30,10,30,30};
        int idx = 0;
        for(int i = 0; i < input.length; i++){
            if(i % 2 == 0){
               boolean check = false;
                for(int j = 0 ; j < array.length; j++){
                    if(array[j] == input[i]){
                        System.out.println(input[i] +" 은 중복됩니다.");
                        check = true;
                        break;
                    }
                }
               if(!check){
                   array[idx++] = input[i];
                   System.out.println(Arrays.toString(array));
               }

            } else {
                boolean check = false;
                for(int j = 0; j < array.length-1; j++){
                    if(array[j] == input[i]){
                        array[j] = array[j+1];
                        array[j + 1] = 0;
                        idx--;
                        check = true;
                        break;
                    }
                }

                if(!check){
                    System.out.println("삭제할값 없음");
                } else{
                    System.out.println(Arrays.toString(array));
                }
            }
        }
    }
}
