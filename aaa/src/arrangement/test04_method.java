package arrangement;

public class test04_method {

	static int num1 = 300;
	static int num2 = 100;
	
	// 메소드 정의 == 프로토타입 == 메소드 원형
	// {}가 있으면 정의, 없으면 선언

	//	====================================================================

	// 반환x, 매개변수==인수x
	static void add() {	// 반환x, 매개변수==인수x
		int result = num1 + num2;
		System.out.printf("%d + %d = %d %n", num1, num2, result);
	}
	
	static void sub() {	// 반환x, 매개변수==인수x
		int result = num1 - num2;
		System.out.printf("%d - %d = %d %n", num1, num2, result);
	}
	
	static void multi() {	// 반환x, 매개변수==인수x
		int result = num1 * num2;
		System.out.printf("%d * %d = %d %n", num1, num2, result);
	}
	
	static void divide() {	// 반환x, 매개변수==인수x
		int result = num1 / num2;
		System.out.printf("%d / %d = %d %n", num1, num2, result);
	};
	
//	====================================================================
	
	// 반환x, 매개변수==인수o
	
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

	// 반환o, 매개변수==인수o
	
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

		System.out.println(">>>>>>>>>>반환값x,매개변수값x<<<<<<<<<<<<");
		// 메소드 호출 : 반환값x, 매개변수값x
		add();
		sub();
		multi();
		divide();
		
		System.out.println(">>>>>>>>>>반환값x,매개변수값o<<<<<<<<<<<<");
		// 메소드 호출 : 반환값x, 매개변수값o
		add_1(a,b);
		sub_1(a,b);
		multi_1(a,b);
		divide_1(a,b);

		System.out.println(">>>>>>>>>>반환값o,매개변수값o<<<<<<<<<<<<");
		// 메소드 호출 : 반환값o, 매개변수값o
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
