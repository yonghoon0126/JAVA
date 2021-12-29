package Ex2;

import java.util.Scanner;

public class Ex02_02 {
	public static void main(String[] args) {
		int a, b;

		// ^~o import
		Scanner scan = new Scanner(System.in);

		System.out.print("첫번째 계산할 값을 입력하세요==>");
		a = scan.nextInt();

		System.out.print("두번째 계산할 값을 입력하세요==>");
		b = scan.nextInt();

		System.out.println(a + "+" + b + "=" + (a + b));
	}

}
