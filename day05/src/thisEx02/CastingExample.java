package thisEx02;
//c:\>java CastingExample
public class CastingExample {

	public static void main(String[] args) {
		// ����� ���� �������� �޾� 200�� ���Ͽ� ����Ͻÿ�. �Է� �޾ƿ��� ���� String
		int su = Integer.parseInt(args[0]) + 200;
		System.out.println("su = " + su);

		int intValue = 44_032;
		char CharValue = (char) intValue; // ����ĳ����
		System.out.println(CharValue); // ��

		long longValue = 500;
		intValue = (int) longValue; // ����ĳ����
		System.out.println(intValue); // 500

		double doubleValue = 3.14;
		intValue = (int) doubleValue; // ����ĳ����
		System.out.println(intValue); // 3

	}

}
