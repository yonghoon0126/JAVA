package Cook5;

import java.util.Scanner;

public class Ex05_09_Switch {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a = 0;

		System.out.println("1 ~ 4 �� �����ϼ���.");
		a = s.nextInt();

		switch (a) {

		case 1:
			System.out.println("1�� �����߽��ϴ�.");
			break;
		case 2:
			System.out.println("2�� �����߽��ϴ�.");
			break;
		case 3:
			System.out.println("3�� �����߽��ϴ�.");
			break;
		case 4:
			System.out.println("4�� �����߽��ϴ�.");
			break;
		default:
			System.out.println("�߸� �����߽��ϴ�.");
			break;
		}
	}
}