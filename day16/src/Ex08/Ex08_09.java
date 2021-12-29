package Ex08;

public class Ex08_09 {

	public static void main(String[] args) {

		int [][]aa = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12}
			};

		System.out.printf("aa[0][0]부터 aa[2][3] 까지 출력 \n");
		
		// for문
		
//		for(int i = 0; i < row; i++) {
//			for(int j = 0; j < col; j++) {
//			System.out.printf("%3d", aa[i][j]);
//			}
//			System.out.println();
//		}
		
		//=====================================================
		
		// for each문
		
		int row = 0, col = 0;
		int cnt = 1;
		
		for(int i[] : aa) {
			col = 0;
			for(int j : i) {
				aa[row][col] = cnt++;
				col++;
				System.out.print(j + ", ");
			}
			row++;
			System.out.println();
		}

		for(int i[] : aa) {
			for(int j : i) {
				System.out.printf("%3d", j);
			}
			System.out.println();
		}
	}

}
