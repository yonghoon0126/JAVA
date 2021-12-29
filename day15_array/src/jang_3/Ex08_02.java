package jang_3;

import java.util.Scanner;

public class Ex08_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b, c, d;
		int sum = 0;

		System.out.print("1번째 숫자를 입력하세요 : ");
		a = sc.nextInt();

		System.out.print("2번째 숫자를 입력하세요 : ");
		b = sc.nextInt();

		System.out.print("3번째 숫자를 입력하세요 : ");
		c = sc.nextInt();

		System.out.print("4번째 숫자를 입력하세요 : ");
		d = sc.nextInt();

		sum = a + b + c + d;
		System.out.print("합계 : " + sum);

	}

}
