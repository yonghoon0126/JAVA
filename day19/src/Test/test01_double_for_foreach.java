package Test;

//����1) 2���� �迭�� ��� ����� ���� ǥ��(Ȯ��for��)
//���)
//1.0 2.0
//3.0 4.0 5.0
//6.0 7.0

public class test01_double_for_foreach {

	public static void main(String[] args) {

		double n = 1;
		double a[][] = new double[3][];

		a[0] = new double[2];
		a[1] = new double[3];
		a[2] = new double[2];

		// for��
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = n++;
				System.out.printf("%.1f ", a[i][j]);
			}
			System.out.println();
		}
		
		// for each��
		System.out.println();
		for (double[] i : a) {
			for (double j : i) {
				System.out.printf("%.1f ", j);
			}
			System.out.println();
		}
		
		
		int r = 0, c = 0;
		for(double[] i : a) {
			c = 0;
			for(double j : i) {
				a[r][c++] = n++;
				System.out.printf("%.1f ", j);
			}
			r++;
			System.out.println();
		}
		
	}

}