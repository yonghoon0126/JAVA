package jang_2;

import java.util.Scanner;

public class SuccessOrFail {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �Է��ϼ���.");

		int score = sc.nextInt();
		String str = "";	//null
		if(score >= 80)
			str="�� �����մϴ� ! �հ��Դϴ�.";
		//System.out.println(score+ "���� �����մϴ�! �հ��Դϴ�.");
		else 
			str="�� ���հ��Դϴ�.";
		//System.out.println(score+ "���� ���հ��Դϴ�.");

		// 3�� ������

		System.out.println(score+str);
		System.out.println((score >= 80)?
				score+"�� �����մϴ� ! �հ��Դϴ�." :score+"�� ���հ��Դϴ�.");


	}
}
