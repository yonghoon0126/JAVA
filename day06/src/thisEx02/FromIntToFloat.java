package thisEx02;

public class FromIntToFloat {

	public static void main(String[] args) {

		int num1 = 123456780;
		int num2 = 123456780;
		// int�� float�� ��ȯ �� �� �ս� = �����Ⱚ ���
		/*
		 * float num3 = num2; //~.0000 num2 = (int) num3; //~ // 123456780- num2 = (int)
		 * num3; // ~ // 123456780- int result = num1 - num2;
		 */
		
		// double������ ��ȯ �� �� ����
		double num3 = num2; // ~.0000
		num2 = (int) num3; // ~
		// 				123456780-
		int result = num1 - num2;
		System.out.println(result);

		// �� �� 4byte���� int�� float�� ���������� �ٸ��� ������ ���� 0�� �ȳ��´�.
	}
}
