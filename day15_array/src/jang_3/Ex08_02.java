package jang_3;

import java.util.Scanner;

public class Ex08_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b, c, d;
		int sum = 0;

		System.out.print("1��° ���ڸ� �Է��ϼ��� : ");
		a = sc.nextInt();

		System.out.print("2��° ���ڸ� �Է��ϼ��� : ");
		b = sc.nextInt();

		System.out.print("3��° ���ڸ� �Է��ϼ��� : ");
		c = sc.nextInt();

		System.out.print("4��° ���ڸ� �Է��ϼ��� : ");
		d = sc.nextInt();

		sum = a + b + c + d;
		System.out.print("�հ� : " + sum);

	}

}
