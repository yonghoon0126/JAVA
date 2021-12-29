package thisEx02;

public class OperationsPromotionExample {
	public static void main(String[] args) {

		byte byteValue1 = 10;
		byte byteValue2 = 20;
		// byte byteValue3 = byteValue1 + byteValue2; //컴파일 에러
		// byte byteValue3 = (byte) (byteValue1 + byteValue2);
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1); // 30

		char charValue1 = 'A';
		char charValue2 = 1;
		// char charValue3 = charValue1 + charValue2; //컴파일 에러
		// char charValue3 = (char) (charValue1 + charValue2);
		int intValue2 = charValue1 + charValue2;
		System.out.println("A = " + intValue1);
		System.out.println("charValue2 = " + intValue2);
		System.out.println("유니코드 = " + intValue2); // 유니코드 = 66
		System.out.println("출력문자 = " + (char) intValue2); // 출력문자 = B

		// 몫 구하기 : 정수(몫) = 정수/정수, 실수 = 정수/실수, 실수 = 실수/정수
		// 나머지 구하기 : 정수(몫) = 정수 % 정수
		int intValue3 = 10;
		double intValue4 = intValue3 / 4;
		System.out.println("몫" + intValue4); // 2

		int i = intValue3 % 4;
		System.out.println("나머지 = " + i);

		int intValue5 = 10;
		// int intValue6 = intValue5 / 4.0; // 컴파일 에러
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue); // 2.5

	}

}
