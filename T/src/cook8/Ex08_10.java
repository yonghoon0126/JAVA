package cook8;

import java.util.Scanner;

public class Ex08_10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int row, col;
		
		System.out.print("행 개수를 입력 : ");
		row = s.nextInt();
		System.out.print("열 개수를 입력 : ");
		col = s.nextInt();
		
		int [][] aa = new int[row][col]; 
		int i, k;
		int val = 1;
		
//		for (i = 0; i < row; i++) {
//			for (k = 0; k < col; k++) {
//				aa[i][k] = val;
//			//	System.out.printf("%3d", aa[i][k]);
//				val++;
//			}
//			//System.out.println();
//		}
		
		row=0;col=0;
		val=1;
		
		for (int m[]:aa) {
			col=0;
			for (int j:m) {
				aa[row][col]=val++;
				col++;
			}
			row++;
		}
		
		System.out.printf("aa[0][0]부터 aa[%d][%d]까지 출력 \n",row,col);
		
//		for (i = 0; i < row; i++) {
//			for (k = 0; k < col; k++) {
//				System.out.printf("%3d", aa[i][k]);
//			}
//			System.out.printf("\n");
//		}
		for (int m[]:aa) {
			for (int j:m) {
				System.out.printf("%2d  ",j);
			}
			System.out.println();
		}
	}
}
