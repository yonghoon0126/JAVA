package jang6;

public class WrapperClassEx {

	public static void main(String[] args) {

		Integer i = new Integer(10);	// 기본값을 객체로
		char c = '4';
		Double d = new Double(3.1234566);	// 기본값을 객체로
		System.out.println(Character.toLowerCase('A'));	// a

		if (Character.isDigit(c))
			System.out.println(Character.getNumericValue(c));	// 4

		System.out.println(Integer.parseInt("-123"));	// -123
		System.out.println(Integer.toBinaryString(28));	// 11100
		System.out.println(Integer.toHexString(28));	// 1c
		System.out.println(i.doubleValue());	// 10.0
		System.out.println(d.toString());	// 3.1234566
		System.out.println(Double.parseDouble("44.13e-6"));	// 4.413e-5
	}
}

