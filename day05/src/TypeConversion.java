
public class TypeConversion {

	public static void main(String[] args) {

		byte b = 127;
		int i = 100;

		System.out.println(b + i);
		System.out.println(10 / 4);
		// 정수/정수 = 정수값
		System.out.println(10.0 / 4);
		// 실수/정수 = 실수값
		System.out.println((char) 0x12340041);
		// char이기 때문에 아스키코드로 출력
		System.out.println((byte) (b + i));
		//
		System.out.println((int) 2.9 + 1.8);
		// int이기 때문에 앞에 정수빼고 버림 2+1.8 --> 3.8
		System.out.println((int) (2.9 + 1.8));
		// int이기 때문에 앞에 정수빼고 버림 4.7 --> 4
		System.out.println((int) 2.9 + (int) 1.8);
		// int이기 때문에 앞에 정수 빼고 버림 2+1 --> 3

	}
}
