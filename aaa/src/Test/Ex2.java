package Test;

import java.util.Random;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String monthString[] = { "January", "February", "March", "April", 
				"May", "June", "July", "August", "September",
				"October", "November", "December" };

		Random r = new Random();

		Q: while (true) {
			int month = r.nextInt(12) + 1;
			System.out.println("<<문제" + monthString[month] + ">>");

			while (true) {
				System.out.print("몇 월인가요? [1~12월, 0:종료]");
				int m = sc.nextInt();

				if (m == 0) {
					System.out.println("프로그램 종료.");
					break Q;
				}
				if (m == month + 1)
					break;

				System.out.println("아닙니다.");
				System.out.println();
			}
			System.out.println("정답입니다.");
			System.out.println();
		}
	}
}