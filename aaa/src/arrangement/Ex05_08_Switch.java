package arrangement;

import java.util.Scanner;

public class Ex05_08_Switch {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a = 0;

		System.out.print("������ �Է��ϼ��� : ");
		a = s.nextInt();

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

		}
		System.out.println(" ���� �Դϴ�.");
		System.out.println("�����մϴ�.");
	}
}
