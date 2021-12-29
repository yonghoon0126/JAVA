package test;

public class Test01 {
	public static void main(String[] args) {
		// 정수와 정수의 나눗셈
		double a = 1/2;
		System.out.println("double a : " + a);
		// -- double a : 0.0

		double b = 1/2 + 1/2;
		System.out.println("double b : " + b);
		// -- double b : 0.0

		double c = 1/2.0;
		System.out.println("double c : " + c);
		// -- double c : 0.5
		// 나눗셈 연산과 관련하여 피연산자 중 실수가
		// 포함되어 잇다면 결과값은 실수의 형태로 반환된다.

		double d = 3/2 + 1/2;
		System.out.println("double d : " + d);
		System.out.printf("double d : %f%n" ,d);

		// -- double d : 1.5

		double e = 3/2 + 1/2.0;
		System.out.println("double e : " + e);
		// -- double e : 1.5
		
	}

}
