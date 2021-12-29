package thisEx03;

import java.util.Scanner;

public class InputDataCheckNaNExample2 {
	public static void main(String[] args) {
		String userInput = "NaN";
		double val = Double.valueOf(userInput);

		double currentBalance = 10000.0;
		// String : ��ü
		// ==, != : �⺻�� �����϶��� ��, ���ó��
		// ��ü.equals("���� ��ü") : ��ü�� �� �񱳿���
		if (Double.isNaN(val)) {
			System.out.println("NaN�� �ԷµǾ� ó���� �� ����");
			val = 0.0;
		}
		currentBalance += val;
		System.out.println(currentBalance);
		System.out.println("-----------------------------------");

		InputDataCheckNaNExample2 i1 = new InputDataCheckNaNExample2();
		InputDataCheckNaNExample2 i2 = new InputDataCheckNaNExample2();

		// ���� �ּ�, ������ �ּ�(=���� �ּ�)
		System.out.println("i1 = " + i1.hashCode()); // ���� �ּҰ� �ٸ�
		System.out.println("i2 = " + i2.hashCode()); // ���� �ּҰ� �ٸ�
		// ��ü���� ��(equals)�� �� �ּ� ��
		// object�� �� ==, equals �ּ�
		if (i1.equals(i2)) {
			System.out.println("i1�� i2�� �ּҰ� ����");
		} else
			System.out.println("i1�� i2�� �ּҰ� �ٸ���");

		// String �� �� == : �ּ� ��, equals() : �� ��(Overriding)
		String str1 = "��", str2 = "��"; // equals()�� ������(Overriding) ���񱳷�
		// new ������� �Ȱ��� ���� �־��ָ� ���� �ּҸ� ����Ų��.
		// new �����ڰ� ������ ������ ���ο� �ּҸ� ����
		// new �����ڷ� ��ü�� ������ �� ���� ���� �־��ָ�
		// ���� �ּҴ� �ٸ����� hashCode()�� �������ؼ� ���� �ּҰ� ���� ����.
		String str3 = new String("��");
		String str4 = new String("��");

		if (str1.equals(str2)) {
			System.out.println("str1�� str2�� ���� ����");
		} else
			System.out.println("str1�� str2�� ���� �ٸ���");

		if (str1 == str2) {
			System.out.println("str1�� str2�� �ּҰ� ����");
		} else
			System.out.println("str1�� str2�� �ּҰ� �ٸ���");

		System.out.println("str1 = " + str1.hashCode()); // ���� �ּҰ� �ٸ�
		System.out.println("str2 = " + str2.hashCode()); // ���� �ּҰ� �ٸ�
		System.out.println("str3 = " + str3.hashCode()); // ���� �ּҰ� �ٸ�
		System.out.println("str4 = " + str4.hashCode()); // ���� �ּҰ� �ٸ�
		System.out.println("String�� �� = " + str4);
		System.out.println("String�� �� = " + str4.toString());
		System.out.println("��ü = " + str4);
		System.out.println("��ü = " + str4.toString());

		System.out.println("-----------------------------------");

//========================================================================

		// Ű����� ������ �Է� �޾�
		// �Է� ���� ���� "����" �Ǵ� "����"���� �����Ͽ� �Ʒ�ó�� ����Ͻÿ�.
		// ���� / ���� �̿��� ���� �Է��ϸ� "�߸� �Է��߽��ϴ�"�� ����Ͻÿ�.
		// ���)
		// ����� ���� / ���� �Դϱ�? : ����
		// �����̱���.
		// ����� ���� / ���� �Դϱ�? : ����
		// �����̱���.

		// ��ĳ�� �̿��ؼ� Ű���带 �����ϼ���.
		Scanner s = new Scanner(System.in);

		System.out.println("����� ���� / �����Դϱ�?");
		// Ű���� ������ �̿��ؼ� ������ �Է��ϰ� ������ �����ϼ���.
		String str = s.next();

		// if�� ����ؼ� ������ �� "����� �����̱���."
		// ���࿡ str�� �����̸� �������
		// ������ �ƴϸ� str�� �����̸� �������
		// ������ ������ �ƴϸ� �߸� �Է��߽��ϴ�.
		if (str.equals("����")) {
			System.out.println("����� ���� �̱���.");

		} else if (str.equals("����")) {
			System.out.println("����� ���� �̱���.");

		} else {
			System.out.println("�߸� �Է��߽��ϴ�.");

		}

	}

}
