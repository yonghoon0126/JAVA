package arrangement;

import java.util.Scanner;

public class Ex05_08_If {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a = 0;

		System.out.print("������ �Է��ϼ��� : ");
		a = s.nextInt();
		
		if(a >= 90) 
			System.out.print("A");
		else if(a >=80) 
			System.out.print("B");
		else if(a >= 70) 
			System.out.print("C");
		else if(a >= 60) 
			System.out.print("D");
		else   
			System.out.print("F");

		System.out.println(" ���� �Դϴ�.");
	}

}
