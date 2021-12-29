package jang_3;

import java.util.Scanner;

public class BreakSample {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = 0;

		while (true) {
			if (in.nextInt() == -1)
				break;
			num++;
		}
		System.out.println("입력된 숫자 개수는" + num);
	}
}
