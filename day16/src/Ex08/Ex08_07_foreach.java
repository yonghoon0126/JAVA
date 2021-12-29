package Ex08;

public class Ex08_07_foreach {

	public static void main(String[] args) {

		int[][] aa = new int[3][4];

		// 배열 나열 후 수기출력
//		aa[0][0] = 1; aa[0][1] = 2; aa[0][2] = 3; aa[0][3] = 4;
//		aa[1][0] = 5; aa[1][1] = 6; aa[1][2] = 7; aa[1][3] = 8;
//		aa[2][0] = 9; aa[2][1] = 10; aa[2][2] = 11; aa[2][3] = 12;
		
//		System.out.printf("aa[0][0]부터 aa[2][3]까지 출력 \n");
//		
//		System.out.printf("%3d %3d %3d %3d\n", aa[0][0],aa[0][1], aa[0][2],aa[0][3]);
//		System.out.printf("%3d %3d %3d %3d\n", aa[1][0],aa[1][1], aa[1][2],aa[1][3]);
//		System.out.printf("%3d %3d %3d %3d\n", aa[2][0],aa[2][1], aa[2][2],aa[2][3]);

		int cnt = 1; // 초기값

		System.out.printf("aa[0][0]부터 aa[2][3]까지 출력 \n");

		// 초기값 입력해서 자동출력
		for (int i = 0; i < aa.length; i++) {
			for (int j = 0; j < aa[i].length; j++) {
				aa[i][j] = cnt++; // 초기값 = 1

				System.out.printf("%3d", aa[i][j]);
//				System.out.print(aa[i][j] + " ");
//				  1  2  3  4
//				  5  6  7  8
//				  9 10 11 12

			}
			System.out.println();
		}
		
		// for ~ each문으로

		int row= 0, col = 0;
		cnt = 1;
		
			for(int i[] : aa) {
				col = 0;
				for(int j : i) {
					aa[row][col] = cnt++;
					col++;
					System.out.print(j + " ");
//					1 2 3 4 
//					5 6 7 8 
//					9 10 11 12 
				}
				row++;
				System.out.println();
		}

//===================================================================

			for (int i = 0; i < aa.length; i++) {
				for (int j = 0; j < aa[i].length; j++) {
					System.out.printf("%3d", aa[i][j]);
//					System.out.printf("aa[%d][%d] = %3d", i, j, aa[i][j]);
//					System.out.printf("[%d][%d] = %d ", i, j, aa[i][j]);
				}
					System.out.println();
			}

			// for ~ each문으로

			for (int i[] : aa) { // 1, 2, 3, 4
				for (int j : i) {
					System.out.printf("%3d ", j);
				}
				System.out.println();
//				  1   2   3   4 
//				  5   6   7   8 
//				  9  10  11  12 

			}

	}
}