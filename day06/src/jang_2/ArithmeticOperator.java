package jang_2;

import java.util.Scanner;

public class ArithmeticOperator {
	public static void main(String[] args) {
		int time;
		int second;
		int minute;
		int hour;
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : "); // ��,��,�ʷ� ��ȯ�� ���� �Է�

		time = sc.nextInt();
		second = time % 60;		//60���� ���� �������� �ʸ� �ǹ�
		minute = (time / 60) % 60;	//60���� ���� ���� �ٽ� 60���� ���� �������� ���� �ǹ�
		hour = (time / 60) / 60;	//60���� ���� ���� �ٽ� 60���� ���� ���� �ð��� �ǹ�

		System.out.print(time + "�ʴ� ");
		System.out.print(hour + "�ð�, ");
		System.out.print(minute + "��, ");
		System.out.print(second + "���Դϴ�.");

	}

}
