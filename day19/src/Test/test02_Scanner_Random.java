package Test;

import java.util.Random;
import java.util.Scanner;

//����2)
//������ ���� �Է� �޾� �迭�� ũ�⸦ ����,
//�迭�� ��� ��ҿ� ������ �����ؼ� ���� ������ ����׷����� ǥ��,
//�迭�� ��� ��ҿ� 1~10�� ������ �����ؼ� ǥ���ϴ� ���α׷�
//���)
//��� �� : 5
//a[0] : ***********
//a[1] : ******
//a[2] : **
//~
//a[9] : *******
//a[10] : *********

//�߰� : ��Ҽ��� ¦���̸� ��, Ȧ���̸� *

//1. Ű���� �Է�
//2. Ű���� �Է� �� ����, �迭�� ����
//3. �迭 ���
//4. ��°��� ������ ����

public class test02_Scanner_Random {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Random ran = new Random();

		System.out.println("��� ��  : ");
		int n = sc.nextInt();
		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
//			System.out.print("\na[" + i + "] = ");
			System.out.printf("\na[%d] = ",i);
			a[i] = 1 + (int) (Math.random() * 10);
			
			
			for (int j = 0; j < a[i]; j++) {
				if (n % 2 == 0) {	// ¦���̸�
					System.out.print('��');
				} else {	// Ȧ���̸�
					System.out.print('*');
				}
			}
		}
	}
}
