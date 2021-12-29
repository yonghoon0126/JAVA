package Test;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		//	문제2) 키보드로 년도를 입력받아서 윤년인지, 평년인지를 구분하시오.(if문 사용)
		//	윤년의 조건)	(년도 % 4 == 0 & 년도 % 100 != 0) || 년도 % 400 == 0

		//	출력)
		//	연도를 입력 : 2020
		//	2020년도는 윤년입니다.
		//	
		//	연도를 입력 : 2021
		//	2021년도는 평년입니다.

		Scanner s = new Scanner(System.in);
		int year = 0;
		int n = 0;	// 횟수

		while(true) {
			System.out.print("연도를 입력 : ");
			year = s.nextInt();



			if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				System.out.println(year + "년도는 윤년 입니다.");
			}else { 
				System.out.println(year + "년도는 평년 입니다.");

			}
		}
	}

}
