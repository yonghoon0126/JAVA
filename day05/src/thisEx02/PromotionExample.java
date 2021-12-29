package thisEx02;

public class PromotionExample {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue; // 자동캐스팅
		System.out.println(intValue); // 10

		// ------------------------------------------------
		char ch2;
		// Ch2 = byteValue; //(x) 자동캐스팅(x)
		ch2 = (char) byteValue; // (o) 강제캐스팅(o)
		System.out.println("ch2 = " + ch2);
		// ------------------------------------------------
		
		char charValue = '가';
		intValue = charValue; // 자동캐스팅
		// 가의 유니코드 = 44032
		System.out.println("가의 유니코드 = " + intValue);

		intValue = 500;
		long longValue = intValue;
		System.out.println(longValue);

		intValue = 200;
		double doubleValue = intValue;
		System.out.print(doubleValue);

	}

}
