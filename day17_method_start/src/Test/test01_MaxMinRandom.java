package Test;

import java.util.Random;
import java.util.Scanner;

//����1) ����ڷκ��� �Է¹��� ������ ������ŭ
//������ �߻����� �迭�� ��� �迭�� ����ִ� �����͵� ��
//���� ū ���� ���� ���� ����Ͻÿ�(1���� �迭)
//1~100������ ���� �߿��� ���ϼ���

//���)
//�߻��� ������ ���� : 3
//53 46 92
//���� ū �� : 92
//���� ���� �� : 46

public class test01_MaxMinRandom {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("�߻��� ������ ���� : ");
		int n = sc.nextInt();

		// �迭 ���� / �޸� �Ҵ� / ����Ʈ �ʱ�ȭ
		int arr[] = new int[n];

		// ���� �߻�(1~100) ���Ѽ� �迭�� �����ϱ�
		Random r = new Random();

		for(int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100)+1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		int max, min;
		max = min = arr[0];

		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}

		}
		System.out.print("���� ū �� : " + max);
		System.out.println();
		System.out.print("���� ū �� : " + min);



	}
}
