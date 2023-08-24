package array4;

public class Array4Test1 {
    /*
	  	scoreList[] = {31, 76, 54, 2, 100, 23};

		위 데이터는 학생 6명의 점수이다.
		위 데이터를 그래프로 표현해볼려고한다.
		 표시는 10의 자리숫자로 표현해서 개수만큼  * 로 출력할려고한다.
		예)
		 31  ==> ***
		 76  ==> *******
		 54  ==> *****
		 2   ==>
		 100 ==> **********
		 23  ==> **
	*/

    public static void main(String[] args) {
        int scoreList[] = {31, 76, 54, 2, 100, 23};
        int num = 0;
       for(int i  = 0; i < scoreList.length; i++){
           num = scoreList[i] / 10;
           for(int j = 0; j < num; j++){
               System.out.print("*");
           }
           System.out.println();
       }



    }
}
