package test;

//���� ��Ÿ���� ����ܾ��� �н� ���α׷��� �ۼ��Ͻÿ�.
//0~11�� ������ �����ϰ� �� ���ڿ��� ǥ���Ͻÿ�. (Scanner ����Ͻÿ�)
//����) 1��~12��(������)���� �迭�� ������ ��, 
//while�� ���, ���(����) ����� �ּ���.
//
//��)7�̸� ��[7]--->August

import java.util.Random;
import java.util.Scanner;

public class Ex2_Random {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Random r = new Random();
		
		String monthString[] = {"January", "February", "March",
				"April", "May", "June", "July" , "August", 
				"September", "October", "November", "December"};
		
		Q : while(true) {
			int month = r.nextInt(12)+1;
			System.out.println("<<����" + monthString[month] + ">>");

			while(true) {
				System.out.print("�� ���ΰ���? [1~12��, 0:����]");
				int m = sc.nextInt();
				if(m == 0) {
					System.out.println("���α׷� ����.");
					break Q;
				}
				if(m == month +1) 
					break;

				System.out.println("�ƴմϴ�.");
			}
			System.out.println("�����Դϴ�.");
		}
	}
}