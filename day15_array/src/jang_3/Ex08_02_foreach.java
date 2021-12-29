package jang_3;

import java.util.Scanner;

public class Ex08_02_foreach {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int aa[] = new int[4];
		int sum = 0;
		int n = 0;

		for(int i : aa) {
			System.out.print(n + "번째 숫자를 입력하세요 : ");
			aa[n] = sc.nextInt();

			sum = sum + aa[n];
			n++;
		}
		System.out.println("합계 ==> " + sum);
	}

}
