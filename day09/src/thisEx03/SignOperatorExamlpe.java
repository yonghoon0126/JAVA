package thisEx03;

public class SignOperatorExamlpe {
	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);

		short s = 100, d = 50;
		//short c = s + d; ==> short�� int�� �ٲ���� 
		// ~����, -����, ����+���� ==> int�� �ν�
		// short result3 = -s; // ��ȣ�����ڴ� int Ÿ������ ��ȯ�ȴ�/
		int result3 = -s;
		System.out.println("result3 = " + result3); // -100

	}
}
