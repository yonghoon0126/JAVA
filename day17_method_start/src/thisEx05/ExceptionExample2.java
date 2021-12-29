package thisEx05;

import java.util.Scanner;

public class ExceptionExample2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int divisor = 0;
		int dividend = 0;

		System.out.print("���������� ���� �Է��Ͻÿ�.");
		dividend = sc.nextInt();
		System.out.print("������ ���� �Է��Ͻÿ�.");
		divisor = sc.nextInt();

		try {	// ���� ���� �˻�
			System.out.print(dividend + "��" + divisor + "�� ������ ���� " + 
								dividend / divisor + "�Դϴ�.");
		
		} catch (ArithmeticException e) {	// ������ 0���� ���� �� �߻��ϴ� ����
			System.out.println(e.getMessage());

		} catch (Exception e) {	// ���� ó��
			System.out.println("0���� ���� �� �����ϴ�.");
		
		
		} finally {	// �ַ� �ڿ��� ��ȯ�� �������� ���
			System.out.println("����� ������ �ؿ�.");
		}
	}
}
