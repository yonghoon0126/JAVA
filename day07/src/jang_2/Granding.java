package jang_2;

import java.util.Scanner;

public class Granding {
	public static void main(String []args) {
		char grade;
		Scanner a = new Scanner(System.in);
		System.out.print("���� : ");
		while(a.hasNext()) {

			int score = a.nextInt();

			if(score >= 90.0 ) //score�� 90.0 �̻��� ���
				grade = 'A';
			else if(score >= 80.0)	 //score�� 80.0 �̻��� ���
				grade = 'B';
			else if(score >= 70.0)	 //score�� 70.0 �̻��� ���
				grade = 'C';
			else if(score >= 60.0)	//score�� 60.0 �̻��� ���
				grade = 'D';
			else
				grade = 'F';
			System.out.println("������ " +grade+ "�Դϴ�");
			System.out.print("���� : ");

		}

	}

}
