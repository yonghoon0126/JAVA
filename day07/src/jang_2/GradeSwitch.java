package jang_2;

import java.util.Scanner;

public class GradeSwitch {
	public static void main(String [] args) {
		//char grade = 'D';
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է�[A~F] : ");

		while(scan.hasNext()) {
			String grade = scan.next();	
			//switch�� : �پ��� ó������ �ΰ� ���ǰ��� ���� �ϳ��� ó�����̳� ��������
			//ó������ �ѹ��� �����ϴµ� ������ �б�(��)��
			
			//������(byte, short, char, int), jdk1.7���� string���� ����Ѵ�
			//long,float,double,boolean�� ���Ұ�
			//���� �� �� ����, ���� �� �� ����.
			//byte, short, char, int�� �񱳸� �� ����
		
			switch(grade.toUpperCase().charAt(0)) { 	//���ڿ��� �빮�ڷ� �ٲ�
				case'A':
				case'B':
					System.out.println("�� ���Ͽ����ϴ�.\n");
					break;
	
				case'C':
				case'D':
					System.out.println("�� �� ����ϼ���.\n");
					break;
	
				case'F':
					System.out.println("���� �б⿡ �ٽ� �����ϼ���.\n");
					break;
	
				default:
					System.out.println("�߸��� �����Դϴ�.\n");
			}
					System.out.println("������ �Է�[A~F] : ");
		}
	}
}
