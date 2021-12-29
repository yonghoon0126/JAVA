package Test;

import java.util.Scanner;

public class calendar {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] mon_len = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int[] day = { 5, 1, 1, 4, 6, 2, 4, 0, 3, 5, 1, 3 };
		System.out.print("월>> ");
		int mon = scan.nextInt();

		System.out.println("-------------------2021년 " + mon + "월----------------" + "\n");
		System.out.println("일\t월\t화\t수\t목\t금\t토"); // 요일출력

		for (int i = 0; i < day[mon - 1]; i++) {
			System.out.print("\t");
		}
		for (int i = 1; i <= mon_len[mon - 1]; i++) {
			System.out.printf("%2d \t", i);
			if ((day[mon - 1] + i) % 7 == 0) {
				System.out.println();
			}

		}
		scan.close();
	}
}
