package Test;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		//	����2) Ű����� �⵵�� �Է¹޾Ƽ� ��������, ��������� �����Ͻÿ�.(if�� ���)
		//	������ ����)	(�⵵ % 4 == 0 & �⵵ % 100 != 0) || �⵵ % 400 == 0

		//	���)
		//	������ �Է� : 2020
		//	2020�⵵�� �����Դϴ�.
		//	
		//	������ �Է� : 2021
		//	2021�⵵�� ����Դϴ�.

		Scanner s = new Scanner(System.in);
		int year = 0;
		int n = 0;	// Ƚ��

		while(true) {
			System.out.print("������ �Է� : ");
			year = s.nextInt();



			if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				System.out.println(year + "�⵵�� ���� �Դϴ�.");
			}else { 
				System.out.println(year + "�⵵�� ��� �Դϴ�.");

			}
		}
	}

}
