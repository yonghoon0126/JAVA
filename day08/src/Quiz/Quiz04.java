package Quiz;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] arg) {

		int i;
		int j;
		/*		
		for (i = 1; i <=9 ; i++) {
			System.out.println("2 x "+ i + " = " + 2 * i);


		}
		// 키보드로 단을 입력 받아서 2단 출력
		// 키보드로 입력받아서 2단부터 3단까지 출력
/*
		Scanner sc = new Scanner(System.in);
		System.out.print("단 : ");
		int a = sc.nextInt();

		for (i = 1; i <= 9; i++) {
			System.out.println(a+ " x" + i + "=" +a*i);
		}
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("단 : ");
		int a = sc.nextInt();

		for ( i = 2; i <= a; i++) {
			System.out.println(i+"단");
			for ( j = 1; j <= 9; j++) {
				System.out.println(i + "x" + j + "=" + i * j);
			}
		}
	}
}
