package Test;

//����5)
//2�� 3���� ����� ���� a, b����� ���ؼ� ������ �� 
//�Ʒ��� ���� ����Ͻÿ�
//
//���)
//���a
//	1	2	3
//	4	5	6
//
//���b
//	6	3	4	
//	5	1	2
//
//���c
//	7	5	7
//	9	6	8

public class test05 {

	public static void main(String[] args) {

		int i,j ;

		//	int a[][] = new int [2][3];
		int a[][] = { { 1, 2, 3 },{ 4, 5, 6 } };
		int b[][] = { { 6, 3, 4,},{	5, 1, 2 } };
		int c[][] = new int [2][3];

		System.out.println("��� a");
		for(i = 0; i < a.length; i++) {
			for(j = 0; j < a[i].length; j++) {
				System.out.printf("%3d",a[i][j]);
			}
			System.out.println();
		}

		System.out.println("��� b");
		for(i = 0; i < b.length; i++) {
			for(j = 0; j < b[i].length; j++) {
				System.out.printf("%3d",b[i][j]);
			}
			System.out.println();
		}
		System.out.println("��� c");
		for(i = 0; i < c.length; i++) {
			for(j = 0; j < c[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.printf("%3d",c[i][j]);
			}
			System.out.println();
		}		
	}
}