package Test;

import java.util.Scanner;

//����5) ����ڷκ��� ������ �������� �Է¹޾� ���� �� ���� ū �������� ���� ���Ͽ�
//����� ����ϴ� ���α׷��� �����Ѵ�.
//
//���)
//ù ��° ���� �Է� : 10
//�� ��° ���� �Է� : 20
//ù��° ���� ~ �ι�° ���������� �� : 
//
//swap�ϸ�-----
//ù ��° : 20
//�� ��° : 10

public class test05_swap {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n1, n2, sum = 0;

		System.out.println("ù ��° ���� �Է� : ");
		n1 = sc.nextInt();

		System.out.println("�� ��° ���� �Է� : ");
		n2 = sc.nextInt();

		if (n1 < n2) {
			for (int i = n1; i <= n2; i++) {
				sum = sum + i;

			}
		}else {
			for(int i = n2; i<=n1; i++) {
				sum = sum + i;
			}
		}
		System.out.printf("%d ~ %d ������ �� : %d\n", n1, n2, sum);
		System.out.println("swap�ϸ�----");

		n1 = n1 ^ n2;
		n2 = n2 ^ n1;
		n1 = n1 ^ n2;

		System.out.println("ù ��° : " + n1);
		System.out.println("�� ��° : " + n2);
	}
}
