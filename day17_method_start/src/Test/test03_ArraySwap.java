package Test;

import java.util.Random;
import java.util.Scanner;

//����3) �迭 ����� ������ �������� �ٲ㼭 ǥ��
//��� �� : 3(1~100������ �������� ���ؼ� �迭�� ������ �� ������ ���)
//a[0] = 77
//a[1] = 50
//a[2] = 91
//
//����� ������ �ݴ�� �ٲپ����ϴ�
//a[0] = 91
//a[1] = 50
//a[2] = 77

public class test03_ArraySwap {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		System.out.print("��� �� : ");
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100) + 1;
			System.out.printf("a[%d] = %3d\n", i, arr[i]);
		}

		// �迭 ���� �ٲٱ�
		int tmp = 0;

		for (int i = 0; i < (n - 1) - i; i++) {
			tmp = arr[i];
			arr[i] = arr[n - 1 - i];
			arr[n - 1 - i] = tmp;
		}
		System.out.println();
		System.out.println("����� ������ �ݴ�� �ٲپ����ϴ�.");

		for (int i = 0; i < n; i++) {
			System.out.printf("a[%d] = %3d\n", i, arr[i]);
		}

	}

}
