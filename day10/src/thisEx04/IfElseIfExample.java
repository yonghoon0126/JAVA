package thisEx04;

import java.util.Scanner;

public class IfElseIfExample {
	public static void main(String[] args) {

		// int score = 75;
		//
		// if(score >= 90) {
		// System.out.println("������ 100 ~ 90 �Դϴ�.");
		// System.out.println("����� A �Դϴ�.");
		//
		// } else if(score >= 80) {
		// System.out.println("������ 89 ~ 80 �Դϴ�.");
		// System.out.println("����� B �Դϴ�.");
		//
		// } else if(score >= 80) {
		// System.out.println("������ 79 ~ 70 �Դϴ�.");
		// System.out.println("����� C �Դϴ�.");
		//
		// } else {
		// System.out.println("������ 70 �̸� �Դϴ�.");
		// System.out.println("����� D �Դϴ�.");
		// }

		// switch
		Scanner sc = new Scanner(System.in);
		int score = 0;

		while (score != -1) {
			System.out.println(" 0 ~ 100���� ���ڸ� �Է��ϼ���.");
			score = sc.nextInt();

			if (score == -1)
				break;

			switch (score / 10) {

			case 10:
			case 9:
				System.out.println("������ 100 ~ 90 �Դϴ�.");
				System.out.println("����� A �Դϴ�.");
				break;
			case 8:
				System.out.println("������ 89 ~ 80 �Դϴ�.");
				System.out.println("����� B �Դϴ�.");
				break;
			case 7:
				System.out.println("������ 79 ~ 70 �Դϴ�.");
				System.out.println("����� C �Դϴ�.");
				break;

			default:
				System.out.println("������ 70 �̸� �Դϴ�.");
				System.out.println("����� D �Դϴ�.");
				break;
			}

			System.out.println();
		}
	}
}
