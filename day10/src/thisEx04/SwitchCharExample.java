package thisEx04;

import java.util.Scanner;

public class SwitchCharExample {
	public static void main(String[] args) {

		// char��
//		char grade = ' ';
//		Scanner sc = new Scanner(System.in);
//
//		// '��' ���ڰ� ���� �� ���� �ݺ�
//		while (true) {
//
//			System.out.println("[A/a, B/b]�߿� �ϳ��� �Է��ϼ���.");
//			grade = sc.next().charAt(0);	// charAt(0); <-- �ѱ��� �ִ� �޼ҵ�
//
//			if (grade == '��') {		// char(�⺻��)�̱� ������ ==��밡��
//				System.out.println("����Ǿ����ϴ�.");
//				break;
//			}
//			switch (grade) {
//
//			case 'A':
//			case 'a':
//				System.out.println("��� ȸ���Դϴ�.");
//				break;
//			case 'B':
//			case 'b':
//				System.out.println("�Ϲ� ȸ���Դϴ�.");
//				break;
//
//			default:
//				System.out.println("�մ� �Դϴ�.");
//				break;

			// String����
				String grade = " ";
				Scanner sc = new Scanner(System.in);

				while (true) {

					System.out.println("[A/a, B/b]�߿� �ϳ��� �Է��ϼ���.");
					grade = sc.next();	

				//  if (grade == "��") { <== �̷��� �ϸ� �ּҷ� ��, equals���
					if (grade.equals("��")) {
						System.out.println("����Ǿ����ϴ�.");
						break;
					}
					switch (grade) {

					case "A":
					case "a":
						System.out.println("��� ȸ���Դϴ�.");
						break;
						
					case "B":
					case "b":
						System.out.println("�Ϲ� ȸ���Դϴ�.");
						break;

					default:
						System.out.println("�մ� �Դϴ�.");
						break;

			}
			System.out.println();
		}
	}
}
