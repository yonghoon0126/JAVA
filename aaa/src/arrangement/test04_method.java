package arrangement;

public class test04_method {

	static int num1 = 300;
	static int num2 = 100;
	
	// �޼ҵ� ���� == ������Ÿ�� == �޼ҵ� ����
	// {}�� ������ ����, ������ ����

	//	====================================================================

	// ��ȯx, �Ű�����==�μ�x
	static void add() {	// ��ȯx, �Ű�����==�μ�x
		int result = num1 + num2;
		System.out.printf("%d + %d = %d %n", num1, num2, result);
	}
	
	static void sub() {	// ��ȯx, �Ű�����==�μ�x
		int result = num1 - num2;
		System.out.printf("%d - %d = %d %n", num1, num2, result);
	}
	
	static void multi() {	// ��ȯx, �Ű�����==�μ�x
		int result = num1 * num2;
		System.out.printf("%d * %d = %d %n", num1, num2, result);
	}
	
	static void divide() {	// ��ȯx, �Ű�����==�μ�x
		int result = num1 / num2;
		System.out.printf("%d / %d = %d %n", num1, num2, result);
	};
	
//	====================================================================
	
	// ��ȯx, �Ű�����==�μ�o
	
	static void add_1(int a, int b) {
		int result = a + b;
		System.out.printf("%d + %d = %d %n", a, b, result);
	}
	
	static void sub_1(int a, int b) {
		int result = a - b;
		System.out.printf("%d - %d = %d %n", a, b, result);
	}
	
	static void multi_1(int a, int b) {
		int result = a * b;
		System.out.printf("%d * %d = %d %n", a, b, result);
	}
	
	static void divide_1(int a, int b) {
		int result = a / b;
		System.out.printf("%d / %d = %d %n", a, b, result);
	};
	
//	====================================================================

	// ��ȯo, �Ű�����==�μ�o
	
	static int add_2(int a, int b) {
		int result = a + b;
		return result;
	}

	static int sub_2(int a, int b) {
		int result = a - b;
		return result;
	}
	
	static int multi_2(int a, int b) {
		int result = a * b;
		return result;
	}
	
	static int divide_2(int a, int b) {
		int result = a / b;
		return result;
	};
	
//	====================================================================
	
	// main
	public static void main(String[] args) {
		int a = 200;
		int b = 100;
		int result = 0;

		System.out.println(">>>>>>>>>>��ȯ��x,�Ű�������x<<<<<<<<<<<<");
		// �޼ҵ� ȣ�� : ��ȯ��x, �Ű�������x
		add();
		sub();
		multi();
		divide();
		
		System.out.println(">>>>>>>>>>��ȯ��x,�Ű�������o<<<<<<<<<<<<");
		// �޼ҵ� ȣ�� : ��ȯ��x, �Ű�������o
		add_1(a,b);
		sub_1(a,b);
		multi_1(a,b);
		divide_1(a,b);

		System.out.println(">>>>>>>>>>��ȯ��o,�Ű�������o<<<<<<<<<<<<");
		// �޼ҵ� ȣ�� : ��ȯ��o, �Ű�������o
		result = add_2(a,b);
		System.out.printf("%d + %d = %d %n", a, b, result);
		
		result = sub_2(a,b);
		System.out.printf("%d - %d = %d %n", a, b, result);
		
		result = multi_2(a,b);
		System.out.printf("%d * %d = %d %n", a, b, result);
		
		result = divide_2(a,b);
		System.out.printf("%d / %d = %d %n", a, b, result);
		
		
		
//		result = a + b;
//		System.out.printf("%d + %d = %d %n", a, b, result);
//
//		result = a - b;
//		System.out.printf("%d - %d = %d %n", a, b, result);
//
//		result = a * b;
//		System.out.printf("%d * %d = %d %n", a, b, result);
//
//		result = a / b;
//		System.out.printf("%d / %d = %d %n", a, b, result);

	}
}
