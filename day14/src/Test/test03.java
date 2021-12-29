package Test;

public class test03 {

	public static void main(String[] args) {

		int dan, i, k, j, g;
		for (i = 0; i < 2; i++) {	// (0~1) 문단
			for (j = 1; j <= 9; j++) {	// 열, 곱해지는 수(1~9)
				for (k = 2; k <= 5; k++) {	// 문단에 따른 처리 2, 3, 4, 5
											//	6, 7, 8, 9
					
					dan = i * 4 + k;	// 단구성 0*4+2, 0*4+3 0*4+5
					g = dan * j;	// 2*1 3*1 4*1 5*1
										// 2*1=2 3*1=3 4*1=4 5*1=5
					
					System.out.printf("%4d * %2d = %2d", dan, j, g);
				}
				System.out.println();
			}
			System.out.println();
		}

	}
}
