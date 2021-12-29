package Test;

//문제5)
//2행 3열인 행렬의 덧셈 a, b행렬을 더해서 저장한 후 
//아래와 같이 출력하시오
//
//출력)
//행렬a
//	1	2	3
//	4	5	6
//
//행렬b
//	6	3	4	
//	5	1	2
//
//행렬c
//	7	5	7
//	9	6	8

public class test05 {

	public static void main(String[] args) {

		int i,j ;

		//	int a[][] = new int [2][3];
		int a[][] = { { 1, 2, 3 },{ 4, 5, 6 } };
		int b[][] = { { 6, 3, 4,},{	5, 1, 2 } };
		int c[][] = new int [2][3];

		System.out.println("행렬 a");
		for(i = 0; i < a.length; i++) {
			for(j = 0; j < a[i].length; j++) {
				System.out.printf("%3d",a[i][j]);
			}
			System.out.println();
		}

		System.out.println("행렬 b");
		for(i = 0; i < b.length; i++) {
			for(j = 0; j < b[i].length; j++) {
				System.out.printf("%3d",b[i][j]);
			}
			System.out.println();
		}
		System.out.println("행렬 c");
		for(i = 0; i < c.length; i++) {
			for(j = 0; j < c[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.printf("%3d",c[i][j]);
			}
			System.out.println();
		}		
	}
}