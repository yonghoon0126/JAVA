package Test;

import java.util.Random;
import java.util.Scanner;

//����3)
//�����˻� : �迭�� ��� �߿��� � ���� ���ԵǾ� �ִ��� ������
//���� ���ԵǾ� ������ �� ����� �ε����� �����ϴ� ���α׷�.
//� ���� ã�� ���� �˻�, �˻��� ���� Ű��� �Ѵ�.
//�˻��� ��ġ�� �Է¹޾� ��ġ�� ��� �Ͻÿ�.
//12����, 0~10�� �����߻�

//���)
//�迭 a�� ��� ����� ��
//{ 0 4 2 4 6 9 7 8 4 2 5 7 }
//�˻��� �� : 4
//�� ã�� �� ��� : 0 2 6 9 7 8 2 5 7
//�̰��� a[1]�� �ֽ��ϴ�.

public class test03_key {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		final int n = 12;

		int a[] = new int[n]; // �迭 ���� ����

		for (int j = 0; j < n; j++)
			a[j] = ran.nextInt(10); // �迭�� ������ ����
		// int r = (int)(Math.random()*10) + 1;
		// int r = (int)(ran.nextInt(10) + 1);

		System.out.println("�迭 a�� ��� ����� ��");
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + " "); // ����� �� ���
		}
		System.out.println();

		System.out.print("�˻��� �� : ");
		int key = sc.nextInt();

		int i,k = 0;
		System.out.print("�� ã�� �� ��� : ");
		for (i = 0; i < n; i++) {
			//for (int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				k = i;
				continue;
			} else {
				System.out.print(a[i] + " ");
			}

		}
		if (k == 0) {
			System.out.println("�� ã�ҽ��ϴ�");
		} else {
			System.out.println("\nã�°� a[" + i + "]�� �ֽ��ϴ�.");
		}
	}

}
