package arrangement;

import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		�⺻�� �迭�� �����ϸ� �ʵ尪�� �ʱⰪ�� ���� ������ �ʱ�ȭ��
//		��ü�� �迭�� �����ϸ� null�� �ʱ�ȭ ��
		
//		 1)����, �޸��Ҵ�, ����Ʈ�ʱ�ȭ
//		 int intArray[] = new int[5];
//		 int intArray[0] = 20;	// �ʱ�ȭ
//		
//		 2)
//		 int intArray[];	// ����
//		 intArray = new int[5];	// �޸��Ҵ�, ����Ʈ�ʱ�ȭ
//		 intArray[0] = 20;	// �ʱ�ȭ
//		
//		 3) ����, �޸��Ҵ�, �ʱ�ȭ
//		 int intArray[] = {10, 20, 30, 40, 50};
//		
//		 4) ����, �޸��Ҵ�� �ʱ�ȭ
		 int intArray[];
		 intArray = new int[] {10, 20, 30, 40, 50};
		
		double sum = 0;

		// �ִ밪, �ּҰ� ���ϱ�
		int max = 0; // ���� ���� ������ �ʱ�ȭ max < �񱳴�� ==> max
		// max �ʱⰪ�� ���� �۰� �ؾ� �Է°����� max������ ��
		// �񱳴���� max�� ���� Ŀ�� max
		int min = 999; // ���� ū ������ �ʱ�ȭ min > �񱳴�� ==> min
		// min �ʱⰪ�� ���� ũ�� �ؾ� �Է°����� min������ ��
		// �񱳴���� min�� ���� �۾ƾ� min

		for (int i = 0; i < intArray.length; i++) {
			System.out.println("intArray[" + i + "] = " + intArray[i]); // �ʱⰪ ���
		}

		System.out.println("���� 5���� �Է��ϼ���.");
		System.out.println();

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = sc.nextInt();
			sum += intArray[i];
		}

		for (int i = 0; i < intArray.length; i++) {
			System.out.println("intArray[" + i + "] = " + intArray[i]); // �Է°� ���

			if (intArray[i] > max)
				// �ִ밪 =
				max = intArray[i];

			if (intArray[i] < min)
				// �ּҰ� =
				min = intArray[i];
		}
		System.out.println("�ִ밪 = " + max);
		System.out.println("�ּҰ� = " + min);
		System.out.println("�迭 ������ �����" + sum / intArray.length + "�Դϴ�.");

	}

}
