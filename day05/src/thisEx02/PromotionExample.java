package thisEx02;

public class PromotionExample {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue; // �ڵ�ĳ����
		System.out.println(intValue); // 10

		// ------------------------------------------------
		char ch2;
		// Ch2 = byteValue; //(x) �ڵ�ĳ����(x)
		ch2 = (char) byteValue; // (o) ����ĳ����(o)
		System.out.println("ch2 = " + ch2);
		// ------------------------------------------------
		
		char charValue = '��';
		intValue = charValue; // �ڵ�ĳ����
		// ���� �����ڵ� = 44032
		System.out.println("���� �����ڵ� = " + intValue);

		intValue = 500;
		long longValue = intValue;
		System.out.println(longValue);

		intValue = 200;
		double doubleValue = intValue;
		System.out.print(doubleValue);

	}

}
