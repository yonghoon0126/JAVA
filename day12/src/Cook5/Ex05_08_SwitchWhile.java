package Cook5;

import java.util.Scanner;

public class Ex05_08_SwitchWhile {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a = 0;
		while (a != -1) {

			System.out.print("������ �Է��ϼ��� : ");
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

			System.out.println(" ���� �Դϴ�.");
		} // while
		System.out.println("�����մϴ�.");
	}
}
