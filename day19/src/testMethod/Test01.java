package testMethod;

import java.text.DecimalFormat;

/*
문제5] 2행 3열인 행렬의 덧셈 a,b행렬을 더해서 c행렬에 저장한후 아래와 같이 출력하시오
출력)
행렬 a
  1  2  3
  4  5  6
행렬 b
  6  3  4
  5  1  2
행렬 c
  7  5  7
  9  6  8
*/

public class Test01 {
	static void addMatrix(int[ ][ ] a, int[ ][ ] b, int[ ][ ] c) {
		for (int i = 0; i < 2; i++)
			for (int j = 0; j < 3; j++)
				c[i][j] = a[i][j] + b[i][j];
	}
	//출력
	static void printMatrix(int[ ][ ] a ){
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++)
				System.out.printf("%3d", a[i][j]);
			System.out.println( );
		}
	}
//---------------------- main --------------------------------
	public static void main(String[] args) {
		int[ ][ ] a = { {1, 2, 3}, {4, 5, 6} };
		int[ ][ ] b = { {6, 3, 4}, {5, 1, 2} };
		int[ ][ ] c = { {0, 0, 0}, {0, 0, 0} };

		addMatrix(a,b,c);//c배열 계산
		System.out.println("행렬 a");		printMatrix(a );
		System.out.println("행렬 b");		printMatrix(b );
		System.out.println("행렬 c");		printMatrix(c );	
		
		DecimalFormat d=new DecimalFormat("#,###.0");
		System.out.println(d.format(2222.0));
		
	};//main
}

		
