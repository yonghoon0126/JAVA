package Ex08;

import java.util.Scanner;

public class Ex08_10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int row, col;
		
		System.out.println("���� ������ �Է� : ");
		row = sc.nextInt();
		
		System.out.println("���� ������ �Է� : ");
		col = sc.nextInt();
		
		
		int aa[][] = new int[row][col];
		int i,j;
		int cnt = 1;
		
		//for��
//		for(i= 0; i < row; i++) {
//			for(j= 0; j < col; j++) {
//				aa[i][j] = cnt;
//				cnt++;
//				System.out.printf("%3d", aa[i][j]);
//			}
//		System.out.println();
//		}


		row=0; col=0;
		cnt=1;
		
		for (int x[]:aa) {
			col=0;
			for (int y : x) {
				aa[row][col]=cnt++;
				col++;
			}
			row++;
			System.out.println();
		}
		
		System.out.printf("aa[0][0]���� aa[%d][%d]���� ��� \n",row, col);
		
		//for �ʱⰪ
//		for (i = 0; i < row; i++) {
//		for (j = 0; j < col; j++) {
//			System.out.printf("%3d", aa[i][j]);
//		}
//		System.out.printf("\n");
//	}
	
//		 for each �ʱⰪ
//		for(int x[] : aa) {
//			for(int y : x) {
//				System.out.printf("%3d  ",y);
//			}
//			System.out.println();
//		}
		
	}

}
