package Test;

import java.util.Scanner;

//����2) Ű����� ���� �Է� �޾� if������ �Ʒ��� ���� ��� �ǰ� �Ͻÿ�
//����) 2~9�� ���̿� ���� �Է¹޴´�
//2~9�̿��� ���� ������ "2~9������ ������ �Է� �����մϴ�" ���
//���)
//���ϴ� ��(������)�Է� : 4
//4 * 1 = 4
//4 * 2 = 8

public class test02_while {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i=1;
		int	n=1;

		while (true) {

			System.out.println("���ϴ� ��(������) �Է� : ");
			n = sc.nextInt();

			if(n>=2 && n<=9) {
				while(i<=9) {
					System.out.println(i + " * " + n + " = " + (i * n));
					i++;
				}
			}else {
				if(n==-1) break;
				System.out.println("2~9������ ������ �Է� �����մϴ�.");
			}
			i=1;
		}
		System.out.println("����.");
	}
}