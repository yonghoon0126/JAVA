package test;

import java.util.Random;

//[�䱸����-3] 1~10����(1�� 10 ����)�� ���� �� �������� 5���� ���ڸ� 
//����� ũ�Ⱑ 5�� �迭numbers�� ���, �հ踦 ���Ͻÿ�.
//
//�������)
//numbers[0] = ?
//...
//numbers[4] = ?
//
//numbers[0]~numbers[4] �� �� = ?

public class Ex3_Random {

	public static void main(String[] args) {

		Random r = new Random();

		int num[] = new int[5];

		int sum = 0;
		int n = 0;

		for (int i = 0; i < num.length; i++) {
			n = r.nextInt(10) + 1 ;
			System.out.printf("numbers[%d] = %d%n", i, n);
			sum += n;
		}
		System.out.println("numbers[0] ~ numbers[4] �� ��? = " + sum);
	}
}
