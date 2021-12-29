package thisEx02;
//c:\>java CastingExample
public class CastingExample {

	public static void main(String[] args) {
		// 실행시 임의 정수값을 받아 200을 더하여 출력하시오. 입력 받아오는 것은 String
		int su = Integer.parseInt(args[0]) + 200;
		System.out.println("su = " + su);

		int intValue = 44_032;
		char CharValue = (char) intValue; // 강제캐스팅
		System.out.println(CharValue); // 가

		long longValue = 500;
		intValue = (int) longValue; // 강제캐스팅
		System.out.println(intValue); // 500

		double doubleValue = 3.14;
		intValue = (int) doubleValue; // 강제캐스팅
		System.out.println(intValue); // 3

	}

}
