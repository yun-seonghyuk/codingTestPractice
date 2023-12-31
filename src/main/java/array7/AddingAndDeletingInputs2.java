package array7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AddingAndDeletingInputs2 {
    /*
		1) arr 배열은 사이즈3이다.
		2) input 배열 안의 값들은  추가와 삭제를 반복할 값들이다.
		3) 0번 인덱스의 값은 "추가" 이고,
		4) 1번 인덱스의 값은 "삭제" 이다.
		   [조건] 삭제한자리는 뒤에서부터 앞으로 밀어내고 0으로 표시 한다.
		5) 중복된값은 "추가" 할수없고 , 없는값은 "삭제"할수없다.
		6) input의 값들을 전부 처리하고 처리과정출력
		예)
		 10 ==> 0인덱스이므로 추가 ==> arr[] = {10,0,0};
		 20 ==>1인덱스이므로 삭제 ==> 20은 없으므로 ==> "삭제할값이 없습니다"
		 30 ==> 0인덱스이므로 추가 ==> arr[] = {10,30,0};
		 10 ==>1인덱스이므로 삭제 ==> arr[] = {30,0,0};
		 30 ==> 0인덱스이므로 추가 ==> 30 은이미 저장되어서 ==> "중복됩니다"
		 30 ==> 1인덱스이므로 삭제 ==> arr[] = {0,0,0};
	*/
    public static void main(String[] args) {

        int arr[] = {0,0,0};
        int count = 0;

        int input[][] = {{10,20},{30,10},{30,30}};

        int idx = 0;
        for(int i = 0; i < input.length; i++){
            for(int j = 0; j < input[i].length; j++){
                if(j == 0){
                    boolean check = false;
                   for(int k = 0; k < arr.length; k++){
                       if(arr[k] == input[i][j]){
                           check = true;
                           System.out.println(input[i][j]+" 은 이미 중복됩니다.");
                           break;
                       }
                   }
                   if(!check){
                       arr[i] = input[i][j];
                       System.out.println(Arrays.toString(arr));
                   }
                } else if(j == 1){
                    boolean check = false;
                    for(int k = 0; k < arr.length; k++){
                        if(arr[k] == input[i][j]){
                            check = true;
                            arr[k] = arr[k+1];
                            arr[k+1] = 0;
                            System.out.println(Arrays.toString(arr));
                            break;
                        }
                    }
                    if(!check){
                        System.out.println("삭제할 값이 없습니다.");
                    }
                }
            }
        }
    }
}
