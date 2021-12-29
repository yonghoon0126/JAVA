package test;

//월을 나타내는 영어단어의 학습 프로그램을 작성하시오.
//0~11의 난수로 생성하고 이 문자열을 표시하시오. (Scanner 사용하시오)
//조건) 1월~12월(영문자)까지 배열에 저장한 후, 
//while문 사용, 비상구(종료) 만들어 주세요.
//
//예)7이면 월[7]--->August

import java.util.Random;
import java.util.Scanner;

public class Ex2_Random {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Random r = new Random();
		
		String monthString[] = {"January", "February", "March",
				"April", "May", "June", "July" , "August", 
				"September", "October", "November", "December"};
		
		Q : while(true) {
			int month = r.nextInt(12)+1;
			System.out.println("<<문제" + monthString[month] + ">>");

			while(true) {
				System.out.print("몇 월인가요? [1~12월, 0:종료]");
				int m = sc.nextInt();
				if(m == 0) {
					System.out.println("프로그램 종료.");
					break Q;
				}
				if(m == month +1) 
					break;

				System.out.println("아닙니다.");
			}
			System.out.println("정답입니다.");
		}
	}
}