package Cook05;

import java.util.Scanner;

public class Ex05_06 {

	public static void main(String[] args) {

		// while������ ��� ���ȴ���, 10�� ������ �� break
		Scanner sc = new Scanner(System.in);

		int a = 0;
		int n = 0; // Ƚ��

		while (n < 5) {

			System.out.println("������ �Է��ϼ���.");
			a = sc.nextInt();
			n++;
			System.out.println(n + "��°");

			if (a % 2 == 0) {
				System.out.println("¦���� �Է��ϼ̱���.");
			} else {
				System.out.println("Ȧ���� �Է��ϼ̱���.");
			}
			
		}
		System.out.println("���� �Ǿ����ϴ�.");

	}

}
