package jang_3;

public class NestedLoop {
	public static void main(String[] args) {
		/*
		 * int i,j;
		 * 
		 * for(i = 1; i <10; i++, System.out.println()) { 
		 * for(j = 1; j <10; j++,
		 * System.out.print('\t')) 
		 * { 
		 * System.out.print(i+"*"+j+"="+i*j); } }
		 */
		// 1~10���� ����Ͻÿ�
		// 1 2 3 4 5 6 7 8 9 10
		// 1~10�� : 55

		int i; // 1~10
		int sum = 0; // ����

		for (i = 1, sum = 0; i <= 10; i++) {
			sum += i;
			System.out.print(i + " ");
		}
		System.out.print("\n1~10�� �� : " + sum);
	}

}
