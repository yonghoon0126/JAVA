package Cook5;

import java.util.Scanner;

public class Ex05_09_while {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a = 0;
		int n = 0;

		while(n < 5) {

			System.out.println("1 ~ 4 �� �����ϼ���.");
			a = s.nextInt();
			n++;
			
			if (a==1) {
				System.out.println("1�� �����߽��ϴ�.");
			}else if(a==2) {
				System.out.println("2�� �����߽��ϴ�.");
			}else if(a==3) {
				System.out.println("3�� �����߽��ϴ�.");
			}else if(a==4) {
				System.out.println("4�� �����߽��ϴ�.");
			}else			
				System.out.println("�߸� �����߽��ϴ�.");
			System.out.println(" ");
		}
		System.out.println("���� �Ǿ����ϴ�.");

	}

}
