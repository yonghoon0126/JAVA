package thisEx04;

import java.util.Scanner;

class ConditionalOperationExample {

	public static void main(String[] args) {
		//		int score = 85;
		//		char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C');
		//		System.out.println(score + "���� " + grade + "����Դϴ�.");


		// while������ -1�� ��� �� �� ���� �ݺ��ϼ���.(hasNext(),�Ǵ� ���� �̿�

		Scanner sc = new Scanner(System.in);
		int score = 0;
		char grade = ' ' ;

		while(true) {	// score != -1 	{ -1 ������ ��
			System.out.println("0 ~ 100 ���� ������ �Է��ϼ���. ");

			score = sc.nextInt();
		 // if (score == -1) break;
			if (score == -1) {
				System.out.println("���� �׸�.");
				break;
			}
			// if��
			if(score > 90) {
				grade = 'A';
			} else if(score > 80) {
				grade = 'B';
			} else
				grade = 'C';

			System.out.println(score + "���� " + grade + "����Դϴ�.");
		}
	}

}
