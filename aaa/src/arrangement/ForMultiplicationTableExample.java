package arrangement;

import java.util.Scanner;

public class ForMultiplicationTableExample {
	public static void main(String []args) {

		//		int i,j;
		//		
		//		for (i = 2; i <= 9; i++) {
		//			System.out.println("***" + i + "���� �����մϴ�." + "***");
		//			System.out.println(" ");
		//			for(j = 1; j<=9; j++) {
		//				System.out.println(i + " x " + j + " = "  + (i*j));
		//			}
		//			System.out.println(" ");
		//			
//======================================================================		
		
		// Ű����� ���� �Է¹޾� 2~���� �ܱ��� ����Ͻÿ�
		// ���)
		// �� �Է� : 
		
		Scanner sc = new Scanner(System.in);
		System.out.print(" �� �Է� : ");
		
		int i,j;

		while(true) {
			
			int s = sc.nextInt();
			for (i = 2; i <= s; i++) {
				System.out.println("***" + i + "���� �����մϴ�." + "***");
				System.out.println(" ");
				for(j = 1; j<=9; j++) {
					System.out.println(i + " x " + j + " = "  + (i*j));
				}
				System.out.println(" ");
				if (s == 1) {
					System.out.println("����Ǿ����ϴ�.");
					break;
				}
			}
			System.out.print(" �� �Է� : ");
		}
	}
}