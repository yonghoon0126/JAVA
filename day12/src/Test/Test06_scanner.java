package Test;

import java.util.Scanner;

public class Test06_scanner {

//	����5) Ű����� �̸���, ����/����/���������� �Է¹޾�
//	������ ���Ͽ� �Ʒ�ó�� ����Ͻÿ�.(BufferedReader���)
//	
//	�̸��� �Է��ϼ��� : ���ΰ�
//	���� : 100
//	���� : 90
//	���� : 80
//	
//	=====[���]=====
//	�̸� : ���ΰ�
//	�������� : 100
//	�������� : 90
//	�������� : 80
//	���� : 270
	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);
		
		String s = "";
		
		int k = 0;
		int e = 0;
		int m = 0;
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		s = sc.next();
		
		System.out.print("���� : ");
		k = sc.nextInt();
		
		System.out.print("���� : ");
		e = sc.nextInt();
		
		System.out.print("���� : ");
		m = sc.nextInt();
		
		System.out.println("===[���===");
		System.out.println("�������� : " + k);
		System.out.println("�������� : " + e);
		System.out.println("�������� : " + m);
		System.out.println("���� : "+(k+e+m));
		
	}

}
