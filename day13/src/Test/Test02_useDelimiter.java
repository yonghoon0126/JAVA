package Test;

import java.util.Scanner;

//����2) Ű����� �Է� ���� �ֹι�ȣ���� ���ڿ��� '-'���� �и��Ͽ�
//�ֹι�ȣ ���ڸ��� ����Ͻÿ�
//
//����)
//-�� ������ �ֹι�ȣ�� �Է��Ͻÿ�
//�ֹι�ȣ �� �ڸ��� 210929 �Դϴ�.
//�ֹι�ȣ �� �ڸ��� 1234567 �Դϴ�.

public class Test02_useDelimiter {

	public static void main(String[] args) {
		// ���� ���� �Ǵ� '-'�� ����
		Scanner sc = new Scanner(System.in).useDelimiter("\\s|-");
		System.out.println("-�� ������ �ֹι�ȣ�� �Է��Ͻÿ�.");
		System.out.println("�ֹι�ȣ �� �ڸ��� " + sc.next() + "�Դϴ�.");
		System.out.println("�ֹι�ȣ �� �ڸ��� " + sc.next() + "�Դϴ�.");
		
		sc.close();
		
		
	}

}
