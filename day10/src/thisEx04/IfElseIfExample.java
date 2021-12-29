package thisEx04;

import java.util.Scanner;

public class IfElseIfExample {
	public static void main(String[] args) {

		// int score = 75;
		//
		// if(score >= 90) {
		// System.out.println("점수가 100 ~ 90 입니다.");
		// System.out.println("등급은 A 입니다.");
		//
		// } else if(score >= 80) {
		// System.out.println("점수가 89 ~ 80 입니다.");
		// System.out.println("등급은 B 입니다.");
		//
		// } else if(score >= 80) {
		// System.out.println("점수가 79 ~ 70 입니다.");
		// System.out.println("등급은 C 입니다.");
		//
		// } else {
		// System.out.println("점수가 70 미만 입니다.");
		// System.out.println("등급은 D 입니다.");
		// }

		// switch
		Scanner sc = new Scanner(System.in);
		int score = 0;

		while (score != -1) {
			System.out.println(" 0 ~ 100까지 숫자를 입력하세요.");
			score = sc.nextInt();

			if (score == -1)
				break;

			switch (score / 10) {

			case 10:
			case 9:
				System.out.println("점수가 100 ~ 90 입니다.");
				System.out.println("등급은 A 입니다.");
				break;
			case 8:
				System.out.println("점수가 89 ~ 80 입니다.");
				System.out.println("등급은 B 입니다.");
				break;
			case 7:
				System.out.println("점수가 79 ~ 70 입니다.");
				System.out.println("등급은 C 입니다.");
				break;

			default:
				System.out.println("점수가 70 미만 입니다.");
				System.out.println("등급은 D 입니다.");
				break;
			}

			System.out.println();
		}
	}
}
