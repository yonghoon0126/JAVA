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
		// Ű����� ���� �Է� �޾Ƽ� 2�� ���
		// Ű����� �Է¹޾Ƽ� 2�ܺ��� 3�ܱ��� ���
/*
		Scanner sc = new Scanner(System.in);
		System.out.print("�� : ");
		int a = sc.nextInt();

		for (i = 1; i <= 9; i++) {
			System.out.println(a+ " x" + i + "=" +a*i);
		}
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("�� : ");
		int a = sc.nextInt();

		for ( i = 2; i <= a; i++) {
			System.out.println(i+"��");
			for ( j = 1; j <= 9; j++) {
				System.out.println(i + "x" + j + "=" + i * j);
			}
		}
	}
}
