package Test;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		while(true) {
			String c = "ö��";
			String y = "����";
			
			
		System.out.print(c + " >> ");
		c = s.next();

		System.out.print(y + " >> ");
		y = s.next();

		if (c.equals("����")) {
			if(y.equals("����")) {
				System.out.println("�����ϴ�.");
			}else if(c.equals("����")){
				System.out.println("ö���� ����ϴ�.");
			}else{
					System.out.println("ö���� �̰���ϴ�.");
				}
		}else if (c.equals("����")) {
			if(y.equals("����")) {
				System.out.println("ö���� �����ϴ�.");

			}else if(y.equals("����")){
				System.out.println("�����ϴ�.");

			}else{
					System.out.println("ö���� �̰���ϴ�.");
			}

		}else if (c.equals("��")) {
			if(y.equals("����")) {
				System.out.println("ö���� �����ϴ�.");

			}else if(y.equals("����")){
				System.out.println("ö���� �̰���ϴ�.");

			}else{
					System.out.println("�����ϴ�.");
				}

		}//if
		
		}
	}//main

}
