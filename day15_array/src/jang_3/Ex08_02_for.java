package jang_3;

import java.util.Scanner;

public class Ex08_02_for {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int aa[] = new int[4];
		int sum = 0;

		for(int i = 0; i < aa.length; i++) {
			System.out.println(i + "번째 숫자를 입력하세요 : ");
			aa[i] = sc.nextInt();

			sum += aa[i];
		}
		System.out.println("합계 ==> " + sum);


	}

}
