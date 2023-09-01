package stringarray3;

import java.util.Arrays;

public class ManageEmployees {
    public static void main(String[] args) {
        //[부서정보]
        //[부서번호,부서명,지역]
        String[][] departmentData = {
                { "10", "ACCOUNTING", "NEW YORK" },
                { "20", "RESEARCH", "DALLAS" },
                { "30", "SALES", "CHICAGO" },
                { "40", "OPERATIONS", "BOSTON" },
        };
        // [사원정보]
        // [번호,이름,직책,상사번호,입사일,급여,커미션,부서번호]
        String[][] employeeData = {
                { "7369", "SMITH", "CLERK", "7902", "17-12-1980", "800", "0", "20" },
                { "7499", "ALLEN", "SALESMAN", "7698", "20-2-1981", "1600", "300", "30" },
                { "7521", "WARD", "SALESMAN", "7698", "22-2-1981", "1250", "500", "30" },
                { "7566", "JONES", "MANAGER", "7839", "2-4-1981", "2975", "0", "20" },
                { "7654", "MARTIN", "SALESMAN", "7698", "28-9-1981", "1250", "1400", "30" },
                { "7698", "BLAKE", "MANAGER", "7839", "1-5-1981", "2850", "0", "30" },
                { "7782", "CLARK", "MANAGER", "7839", "9-6-1981", "2450", "0", "10" },
                { "7788", "SCOTT", "ANALYST", "7566", "13-7-1987", "3000", "0", "20" },
                { "7839", "KING", "PRESIDENT", "NULL", "17-11-1981", "5000", "0", "10" },
                { "7844", "TURNER", "SALESMAN", "7698", "8-9-1981", "1500", "0", "30" },
                { "7876", "ADAMS", "CLERK", "7788", "13-7-1987", "1100", "0", "20" },
                { "7900", "JAMES", "CLERK", "7698", "3-12-1981", "950", "0", "30" },
                { "7902", "FORD", "ANALYST", "7566", "3-12-1981", "3000", "0", "20" },
                { "7934", "MILLER", "CLERK", "7782", "23-1-1982", "1300", "0", "10" }
        };



        // 문제) # "DALLAS"에서 근무하는 사원의 이름,직급,부서번호,부서명을 조회하시오.
        String departMentNumber = "";
        for(int i = 0; i < departmentData.length; i++) {
            if(departmentData[i][2].equals("DALLAS")) {
                departMentNumber = departmentData[i][0];
            }
        }
        System.out.println(departMentNumber);
        for(int i = 0; i  < employeeData.length; i++) {
            if(departMentNumber.equals(employeeData[i][7])) {
                System.out.println(Arrays.toString(employeeData[i]));
            }
        }

        // 문제) # ALLEN과 같은 부서에 근무하는 사원의 이름, 부서번호를 조회하시오.
        String depNum = "";
        for(int i=0; i<employeeData.length; i++) {
            if(employeeData[i][1].equals("ALLEN")) {
                depNum = employeeData[i][7];
            }
        }

        for(int i=0; i<employeeData.length; i++) {
            if(depNum.equals(employeeData[i][7])) {
                System.out.println(employeeData[i][1] + " : " + employeeData[i][7]);
            }
        }
		/*
			# 부서별 최대 급여와 최소 급여를 구하시오.

			#부서별로 급여 평균 (단, 부서별 급여 평균이 2000 이상만)

			#부서번호가 30번인 사원들의 이름, 직급, 부서번호, 부서위치를 조회하시오.

			# 이름에 A 가 들어가는 사원의 이름,부서명을 조회하시오.

			# 사원명 'JONES'가 속한 부서명을 조회하시오.

			# 10번 부서에서 근무하는 사원의 이름과 10번 부서의 부서명을 조회하시오.

		*/
    }
}
