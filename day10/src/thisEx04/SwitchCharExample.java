package thisEx04;

import java.util.Scanner;

public class SwitchCharExample {
	public static void main(String[] args) {

		// char로
//		char grade = ' ';
//		Scanner sc = new Scanner(System.in);
//
//		// '끝' 글자가 들어올 때 까지 반복
//		while (true) {
//
//			System.out.println("[A/a, B/b]중에 하나를 입력하세요.");
//			grade = sc.next().charAt(0);	// charAt(0); <-- 한글자 넣는 메소드
//
//			if (grade == '끝') {		// char(기본형)이기 때문에 ==사용가능
//				System.out.println("종료되었습니다.");
//				break;
//			}
//			switch (grade) {
//
//			case 'A':
//			case 'a':
//				System.out.println("우수 회원입니다.");
//				break;
//			case 'B':
//			case 'b':
//				System.out.println("일반 회원입니다.");
//				break;
//
//			default:
//				System.out.println("손님 입니다.");
//				break;

			// String으로
				String grade = " ";
				Scanner sc = new Scanner(System.in);

				while (true) {

					System.out.println("[A/a, B/b]중에 하나를 입력하세요.");
					grade = sc.next();	

				//  if (grade == "끝") { <== 이렇게 하면 주소로 됨, equals사용
					if (grade.equals("끝")) {
						System.out.println("종료되었습니다.");
						break;
					}
					switch (grade) {

					case "A":
					case "a":
						System.out.println("우수 회원입니다.");
						break;
						
					case "B":
					case "b":
						System.out.println("일반 회원입니다.");
						break;

					default:
						System.out.println("손님 입니다.");
						break;

			}
			System.out.println();
		}
	}
}
