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
			System.out.println("<<����" + monthString[month] + ">>");

			while (true) {
				System.out.print("�� ���ΰ���? [1~12��, 0:����]");
				int m = sc.nextInt();

				if (m == 0) {
					System.out.println("���α׷� ����.");
					break Q;
				}
				if (m == month + 1)
					break;

				System.out.println("�ƴմϴ�.");
				System.out.println();
			}
			System.out.println("�����Դϴ�.");
			System.out.println();
		}
	}
}