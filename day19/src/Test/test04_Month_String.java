package Test;

import java.util.Random;
import java.util.Scanner;

//����4)
//0~11�� ������ �����ϰ� �̹��ڿ��� ǥ���Ͻÿ�
//7�̸� monthString[7]-->August

//���)
//���� : October(����)
//����ΰ���? 8(�Է�)
//�ƴմϴ�.

//����ΰ���? 10
//�����Դϴ�.
public class test04_Month_String {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		String monthString[] = {"January", "February", "March",
				"April", "May", "June","July" , "August", 
				"September", "October", "November", "December"};
		A : while(true) {
			int month = r.nextInt(12);
			System.out.println("���� : " + monthString[month]);

			while(true) {
				System.out.print("�� ���Դϱ�? : ");
				int m = sc.nextInt();
				if(m == -1) {
					System.out.println("��.");
					break A;
				}
				if(m == month +1) 
					break;

				System.out.println("�ƴմϴ�.");
				System.out.println();
			}
			System.out.println("�����Դϴ�.");
			System.out.println();
		}
	}
}



