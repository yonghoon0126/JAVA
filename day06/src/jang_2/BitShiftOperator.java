package jang_2;

public class BitShiftOperator {
	public static void main(String[] args) {
		short a = (short) 0x55ff;
		short b = 0x00ff;

		// 비트 연산
		// printf("서식지정문자", 변수)
		// %c:문자, %s:문자열, %3d:숫자, %x:16진수, %o:8진수, %f:실수
		// %b:b00lean
		// %위치$,서식지정문자 : %1$3d(위치1, 3숫자형으로 출력)
		System.out.printf("%x\n", a & b);	// ff
		System.out.printf("%x\n", a | b);	// 55ff
		System.out.printf("%x\n", a ^ b);	// 5500
		System.out.printf("%x\n", ~a);		// ffffaa00
		byte c = 20; // 0x14
		byte d = -8; // 0xf8

		// 시프트 연산
		System.out.println(c << 2); // c를 2비트 왼쪽 시프트
		System.out.println(c >> 2); // c를 2비트 오른쪽 시프트. 0 삽입
		System.out.println(d >> 2); // d를 2비트 왼쪽 시프트. 1 삽입
		System.out.printf("%x\n", d >>> 2); // d를 2비트 오른쪽 시프트. 0 삽입

	}

}
