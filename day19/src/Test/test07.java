package Test;

import java.util.Scanner;

//臾몄젣7)
//int 임의의 두 정수를 받아 아래와 같이 출력
//
//a : 5
//b : 6
//
//a           = 00000000000000000000000000000000
//b           = 00000000000000000000000000000010
//a & b       = 00000000000000000000000000000000
//a | b       = 00000000000000000000000000000010
//a ^ b       = 00000000000000000000000000000010
//~a          = 10000000000000000000000000000010
//~b          = 10000000000000000000000000000000

public class test07 {

	static void printBits(int x) {
		
		for(int i = 31; i >= 0; i--) {
		System.out.print( ((x >>> i & i) == 1) ? '1' : '0');
		}
	};

		public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수를 입력헤 주십시오.");
		System.out.print("a : ");
		int a = sc.nextInt();
		System.out.print("b : ");
		int b = sc.nextInt();
		
		System.out.print("a           = ");
		printBits(a);

		System.out.print("\nb           = ");
		printBits(b);
		
		System.out.print("\na & b       = ");
		printBits(a & b);
		
		System.out.print("\na | b       = ");
		printBits(a | b);
		
		System.out.print("\na ^ b       = ");
		printBits(a ^ b);
		
		System.out.print("\n~a          = ");
		printBits(~a);
		
		System.out.print("\n~b          = ");
		printBits(~b);
	
	}
}
