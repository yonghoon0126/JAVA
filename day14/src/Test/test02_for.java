package Test;

import java.util.Scanner;

//����2) Ű����� ���� �Է� �޾� if������ �Ʒ��� ���� ��� �ǰ� �Ͻÿ�
//����) 2~9�� ���̿� ���� �Է¹޴´�
//2~9�̿��� ���� ������ "2~9������ ������ �Է� �����մϴ�" ���
//���)
//���ϴ� ��(������)�Է� : 4
//4 * 1 = 4
//4 * 2 = 8

public class test02_for {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i, j, n;

		while (true) {

			System.out.println("���ϴ� ��(������) �Է� : ");
			n = sc.nextInt();

			for (i = n; i <= n; i++) {
				for (j = 1; j <= 9; j++) {

					if (i >= 2 & i <= 9) {
						System.out.println(i + " * " + j + " = " + (i * j));

					} else {
						System.out.println("2~9������ ������ �Է� �����մϴ�.");
						break;
					}
				}
			}
		}
	}
}
