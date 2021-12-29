package test;

//월을 나타내는 영어단어의 학습 프로그램을 작성하시오.
//0~11의 난수로 생성하고 이 문자열을 표시하시오. (Scanner 사용하시오)
//조건) 1월~12월(영문자)까지 배열에 저장한 후, 
//while문 사용, 비상구(종료) 만들어 주세요.
//
//예)7이면 월[7]--->August

//import java.util.Random;
import java.util.Scanner;

public class Ex2_mathRandom {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		Random r = new Random();
		
		String monthString[] = {"January", "February", "March",
				"April", "May", "June","July" , "August", 
				"September", "October", "November", "December"};
		
		
		Q : while(true) {	// 문제내기
			int month = (int)(Math.random()*12) + 1;
			System.out.println("<<문제" + monthString[month] + ">>");

			while(true) {	// 문제 반복
				System.out.print("몇 월인가요? [1~12월, 0:종료]");
				int m = sc.nextInt();
				if(m == 0) {	// 종료를 눌렀을 경우
					System.out.println("프로그램 종료.");
					break Q;
				}	// 종료
				if(m == month +1) {	// 정답일 경우
					break;
				}	
				System.out.println("아닙니다.");
			}	// 정답이 아닐 때
			System.out.println("정답입니다.");
		}	// 문제 반복 while	
	
	}
}

//1. 스캐너, 랜덤 만들기
//2. 문자 배열에 월 입력
//3. 문제내기(월)
//4. while로 문제 반복
//5. 문제/종료 반복
//6. 입력칸 입력
//7. 종료일 경우 if만들기
//8. 정답일경우 if