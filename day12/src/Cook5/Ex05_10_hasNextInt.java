package Cook5;

import java.util.Scanner;

public class Ex05_10_hasNextInt {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a = 0;

		System.out.print("����⵵�� �Է��ϼ��� : ");
		while (s.hasNextInt()) {	// hasNextInt = ctrl + z�� ����
			
			a = s.nextInt();

//			if(a == -1) {
//				break;
//			}
			switch (a%12) {

			case 0 :
				System.out.println("������ ��"); break;
			case 1 :
				System.out.println("�� ��"); break;
			case 2 :
				System.out.println("�� ��"); break;
			case 3 :
				System.out.println("���� ��"); break;
			case 4 :
				System.out.println("�� ��"); break;
			case 5 :
				System.out.println("�� ��"); break;
			case 6 :
				System.out.println("ȣ���� ��"); break;
			case 7 :
				System.out.println("�䳢 ��"); break;
			case 8 :
				System.out.println("�� ��"); break;
			case 9 :
				System.out.println("�� ��"); break;
			case 10 :
				System.out.println("�� ��"); break;
			case 11 :
				System.out.println("�� ��"); break;

			}	// switch
			System.out.print("����⵵�� �Է��ϼ��� : ");
		}	// while
		System.out.println("���� �ϰڽ��ϴ�.");
	}
}
