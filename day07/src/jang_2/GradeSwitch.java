package jang_2;

import java.util.Scanner;

public class GradeSwitch {
	public static void main(String [] args) {
		//char grade = 'D';
		Scanner scan = new Scanner(System.in);
		System.out.println("학점을 입력[A~F] : ");

		while(scan.hasNext()) {
			String grade = scan.next();	
			//switch문 : 다양한 처리문을 두고 조건값에 의해 하나의 처리문이나 여러개의
			//처리문을 한번에 수행하는데 유용한 분기(비교)문
			
			//정수형(byte, short, char, int), jdk1.7부터 string형을 허용한다
			//long,float,double,boolean은 사용불가
			//수식 올 수 없고, 구간 올 수 없다.
			//byte, short, char, int만 비교만 비교 가능
		
			switch(grade.toUpperCase().charAt(0)) { 	//문자열을 대문자로 바꿈
				case'A':
				case'B':
					System.out.println("참 잘하였습니다.\n");
					break;
	
				case'C':
				case'D':
					System.out.println("좀 더 노력하세요.\n");
					break;
	
				case'F':
					System.out.println("다음 학기에 다시 수강하세요.\n");
					break;
	
				default:
					System.out.println("잘못된 학점입니다.\n");
			}
					System.out.println("학점을 입력[A~F] : ");
		}
	}
}
