package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//����4) Ű����� �� ���� �Է� �޾� �Ʒ��� ���� ����Ͻÿ�.
//���� : BufferedReader ���
//���)
//ù ��° ���� �Է� : 10
//�� ��° ���� �Է� : 2
//
//====[���� ���]====
//10 + 2 = 12
//10 - 2 = 8
//10 * 2 = 20
//10 / 2 = 5
//10 % 2 = 0

public class Test04 {
	public static void main(String[]args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a,b;

		System.out.println("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.println("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.println("====[���� ���]====");
		System.out.println(a + " + " + b + " = " + (a + b));
		System.out.println(a + " - " + b + " = " + (a - b));
		System.out.println(a + " * " + b + " = " + (a * b));
		System.out.println(a + " / " + b + " = " + (a / b));
		System.out.println(a + " % " + b + " = " + (a % b));
		
		
	}

}
