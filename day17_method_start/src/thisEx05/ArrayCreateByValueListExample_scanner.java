package thisEx05;

import java.util.Scanner;

public class ArrayCreateByValueListExample_scanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = 0;	// �л� �� 
		int sum = 0;
		double avg = 0;

		System.out.print("�л� ���� �Է��ϼ��� : ");
		n = sc.nextInt();

		int score[] = new int[n]; // �л� �� ��ŭ ������ �迭�� ����

		for (int i = 0; i < score.length; i++) {
			System.out.println("������ �Է��ϼ��� : ");
			score[i] = sc.nextInt();
			sum += score[i];
			avg = sum / n;	// n(�л���) �Ǵ� score.length(���� ����)�� ����
		}
		System.out.print("�հ� : " + sum);
		System.out.println();
		System.out.print("��� : " + avg);
	}
}

//1. �л� �� Ű����� �Է¹ޱ�
//2. �Է°� �迭�� ����
//3. for�� �ȿ��� �迭�� ���� �Է¹ޱ�
