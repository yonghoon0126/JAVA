package thisEx02;

public class OperationsPromotionExample {
	public static void main(String[] args) {

		byte byteValue1 = 10;
		byte byteValue2 = 20;
		// byte byteValue3 = byteValue1 + byteValue2; //������ ����
		// byte byteValue3 = (byte) (byteValue1 + byteValue2);
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1); // 30

		char charValue1 = 'A';
		char charValue2 = 1;
		// char charValue3 = charValue1 + charValue2; //������ ����
		// char charValue3 = (char) (charValue1 + charValue2);
		int intValue2 = charValue1 + charValue2;
		System.out.println("A = " + intValue1);
		System.out.println("charValue2 = " + intValue2);
		System.out.println("�����ڵ� = " + intValue2); // �����ڵ� = 66
		System.out.println("��¹��� = " + (char) intValue2); // ��¹��� = B

		// �� ���ϱ� : ����(��) = ����/����, �Ǽ� = ����/�Ǽ�, �Ǽ� = �Ǽ�/����
		// ������ ���ϱ� : ����(��) = ���� % ����
		int intValue3 = 10;
		double intValue4 = intValue3 / 4;
		System.out.println("��" + intValue4); // 2

		int i = intValue3 % 4;
		System.out.println("������ = " + i);

		int intValue5 = 10;
		// int intValue6 = intValue5 / 4.0; // ������ ����
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue); // 2.5

	}

}
