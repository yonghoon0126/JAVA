package jang_2;

import java.util.Scanner;

public class HakJum_switch {

	public static void main(String[] args) {

//switch��������
//���� = 100 , ������ A�Դϴ�, ���� :
	
//		char = grade;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� : ");
		
		while(sc.hasNext()) {
			int s = sc.nextInt();	

		switch(s/10) { 	
		
		case 10:
		case 9:
			System.out.println("������ A�Դϴ�.");
			break;
		case 8:
			System.out.println("������ B�Դϴ�.");
			break;
		case 7:
			System.out.println("������ C�Դϴ�.");
			break;
		case 6:
			System.out.println("������ D�Դϴ�.");
			break;
	
		default :
//			System.out.println("������ "+grade+"�Դϴ�.\n");
			System.out.println("s\n");
		}
		System.out.println("���� : ");

		}		

	}

}
