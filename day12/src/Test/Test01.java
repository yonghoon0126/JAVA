package Test;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {

//	��1) Ű����� �Է� ���� �ݾ��� �ܵ� 500, 100, 50, 10������ ���� ���Ͽ� �Ʒ��� ���� ����Ͻÿ�
//	��Ʈ) / , %�� �̿��ϼ���.
//	���)
//	##��ȯ �� ����?555
//			
//	�����¥��		==> 1��
//	���¥��		==> 0��
//	���ʿ�¥��		==> 1��
//	�ʿ�¥��		==> 0��
//	�ٲ��� ���� �ܵ� ==> 5��

		Scanner s = new Scanner(System.in);
		int money, c500, c100, c50, c10, c;

		System.out.println("## ��ȯ�� ���� ? ");
		
		money = s.nextInt(); // 555

		c500 = money / 500; // 1
		money = money % 500; // 55

		c100 = money / 100; // 1
		money = money % 100; // 0

		c50 = money / 50; // 1
		money = money % 50; // 5

		c10 = money / 10; // 0
		money = money % 10; // 0

		c = money / 1; // 5
		money = money % 1; // 0

		System.out.println("");
		System.out.println("�����¥�� \t\t ==> " + c500 + "��");
		System.out.println("���¥�� \t\t ==> " + c100 + "��");
		System.out.println("���ʿ�¥�� \t\t ==> " + c50 + "��");
		System.out.println("�ʿ�¥�� \t\t ==> " + c10 + "��");
		System.out.println("�ٲ��� ���� �ܵ� \t ==> " + c + "��");

	}

}
