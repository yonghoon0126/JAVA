package this04;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {

		System.out.println("�޽����� �Է��ϼ���.");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���.");

		Scanner sc = new Scanner(System.in);
		String inputString = "";


		//		do {
		//			System.out.println(">");
		//			inputString = sc.nextLine();
		//			System.out.println(inputString);
		//		} while (!inputString.equals("q"));
		//		System.out.println();
		//		System.out.println("���α׷� ����");

		while (!inputString.equals("q")) {	// q�� �ƴϸ� ��� ����
//			if(!inputString.equals("q")) {
//				break;
//			}
			System.out.println(">");
			inputString = sc.nextLine();	// ���Ͱ� ���� �� ����, �� ������ ����
			System.out.println(inputString);
		}
		
		System.out.println();
		System.out.println("���α׷� ����");

	}
}
