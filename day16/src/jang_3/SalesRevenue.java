package jang_3;

public class SalesRevenue {

	public static void main(String[] args) {

		int intArray[][] = {
				{90, 90, 110, 110},
				{120, 110, 100, 110},
				{120, 140, 130, 150}
		};

		double sum = 0;

		for(int i = 0; i < intArray.length; i++) {
			for(int j = 0; j < intArray[i].length; j++) {
				sum += intArray[i][j];
			}
		}

		System.out.println("���� 3�Ⱓ ���� �Ѿ���" + sum + "�̸� ����� �������" 
				+ sum / intArray.length + "�Դϴ�.");

		System.out.println("3�� 4�� ����ϱ�---------------");

		for(int i = 0; i < intArray.length; i++) {
			for(int j = 0; j < intArray[i].length; j++) {
				System.out.printf("[%d][%d] = %3d ", i, j, intArray[i][j]);
			}
			System.out.println();
		}

	}

}
