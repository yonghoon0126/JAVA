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

		System.out.println("지난 3년간 매출 총액은" + sum + "이며 연평균 매출액은" 
				+ sum / intArray.length + "입니다.");

		System.out.println("3행 4열 출력하기---------------");

		for(int i = 0; i < intArray.length; i++) {
			for(int j = 0; j < intArray[i].length; j++) {
				System.out.printf("[%d][%d] = %3d ", i, j, intArray[i][j]);
			}
			System.out.println();
		}

	}

}
