package arrangement;

import java.util.Random;
import java.util.Scanner;

public class IfDiceExample {
	public static void main(String[] args) {

		// int num = (int)(Math.random()*6) + 1;
		//
		// if(num == 1) {
		// System.out.println("1���� ���Խ��ϴ�.");
		// }else if(num == 2 ){
		// System.out.println("2���� ���Խ��ϴ�.");
		// }else if(num == 3 ){
		// System.out.println("3���� ���Խ��ϴ�.");
		// }else if(num == 4 ){
		// System.out.println("4���� ���Խ��ϴ�.");
		// }else if(num == 5 ){
		// System.out.println("5���� ���Խ��ϴ�.");
		// }else
		// System.out.println("6���� ���Խ��ϴ�.");

		int num = 0;
		Random r = new Random();
		int str = 0;
		// num = (int)(Math.random()*6) + 1;
		// num = r.nextInt(6)+1;
		
		while (num != 1) {
			System.out.println("�ֻ����� ��������.");
			num = r.nextInt(6) + 1;

			if (num == 1) {
				str = num;
				System.out.println(num + "���� ���Խ��ϴ�.");
				System.out.println("�������ϴ�.");
				break;

			} else if (num == 2) {
				System.out.println(num + "���� ���Խ��ϴ�.");

			} else if (num == 3) {
				str = num;
				System.out.println(num + "���� ���Խ��ϴ�.");

			} else if (num == 4) {
				str = num;
				System.out.println(num + "���� ���Խ��ϴ�.");

			} else if (num == 5) {
				str = num;
				System.out.println(num + "���� ���Խ��ϴ�.");
				
			} else {
				str = num;
				System.out.println(num + "���� ���Խ��ϴ�.");
			}
		}
		System.out.println();
	}
}

