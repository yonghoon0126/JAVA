package Test;

import java.util.Scanner;

//����6) ����ڷκ��� ������ ������ �Է� �޾�
//�Է¹��� ������ �Ҽ����� �ƴ����� �Ǻ��Ͽ�
//����� ����ϼ���
//
//���)
//�����Է� : 11
//11 ==> �Ҽ�

public class test06_flag {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num, i=2;
		boolean flag = true;	// �Ҽ�

		System.out.print("���� �Է� : ");
		num = sc.nextInt();

		while (i < num) {

			if(num % i ==0)
				flag = false;	//�Ҽ� �ƴ�
			i++;
		}
		if(flag && num!=1)
			System.out.println(num + " ==> �Ҽ�");
		else
			System.out.println(num + " ==> �Ҽ��ƴ�");

	}
}
