package Cook5;

import java.util.Scanner;

public class Ex05_08_SwitchWhile {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a = 0;
		while (a != -1) {

			System.out.print("점수를 입력하세요 : ");
			a = s.nextInt();

			if (a == -1) {
				break;
			}
			switch (a / 10) {

			case 10:
			case 9:
				System.out.print("A");
				break;

			case 8:
				System.out.print("B");
				break;

			case 7:
				System.out.print("C");
				break;

			case 6:
				System.out.print("D");
				break;

			default:
				System.out.print("F");

			}	// switch

			System.out.println(" 학점 입니다.");
		} // while
		System.out.println("종료합니다.");
	}
}
