package Test;

//���)
//1 2 3
//4 5 6 
//7 8 9

//1 2 3
//4 5 6 
//7 8 9
//�� = 45

public class test05 {

	public static void main(String[] args) {

		int[][] arr = new int[3][3]; // ����, �޸� Ȯ��, ����Ʈ �ʱ�ȭ

		// �ʱⰪ �����ϱ�
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3; // ----------------------------0��

		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6; // ----------------------------1��

		arr[2][0] = 7;
		arr[2][1] = 8;
		arr[2][2] = 9; // ----------------------------2��

		// ����, �޸� Ȯ��, �ʱ�ȭ

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
//==========================================================================		
		
		// ����, �޸� Ȯ��, �ʱ�ȭ

		int[][] arr2 = { 
				{ 1, 2, 3 }, 
				{ 4, 5, 6 }, 
				{ 7, 8, 9 } 
				};
		int sum = 0;
		
		for (int m[] : arr2) {
			for (int j : m) {
				System.out.printf("%2d ", j);
				sum += j;
			}
			System.out.println();
		}
		System.out.println("�� => " + sum);

	}

}
