package Cook05;

import java.util.Scanner;

public class Ex05_07 {

	public static void main(String[] args) {

		System.out.println("���ڸ� �Է��ϼ���.");
		Scanner sc = new Scanner(System.in);
		while (true) {

			int a = 0;
			a = sc.nextInt();

			if (a > 50) {
				if (a < 100) {
					System.out.println("50���� ũ�� 100���� �۱���..");
				} else {
					System.out.println("��~100���� ũ����..");
				}
			} else {
				System.out.println("�ְ�~ 50���� �۱���..");
			} 
			if(a == -1)
				System.out.println("���� �Ǿ����ϴ�.");
				break;
		}
	}

}
