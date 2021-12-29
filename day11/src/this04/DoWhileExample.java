package this04;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {

		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");

		Scanner sc = new Scanner(System.in);
		String inputString = "";


		//		do {
		//			System.out.println(">");
		//			inputString = sc.nextLine();
		//			System.out.println(inputString);
		//		} while (!inputString.equals("q"));
		//		System.out.println();
		//		System.out.println("프로그램 종료");

		while (!inputString.equals("q")) {	// q가 아니면 계속 수행
//			if(!inputString.equals("q")) {
//				break;
//			}
			System.out.println(">");
			inputString = sc.nextLine();	// 엔터가 들어올 때 까지, 한 문자을 읽음
			System.out.println(inputString);
		}
		
		System.out.println();
		System.out.println("프로그램 종료");

	}
}
