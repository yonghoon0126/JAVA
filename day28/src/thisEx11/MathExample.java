package thisEx11;

public class MathExample {

	public static void main(String[] args) {

		// 절대값
		int v1 = Math.abs(-5);
		double v2 = Math.abs(3.14);
		System.out.println("v1 = " + v1);	// 5
		System.out.println("v2 = " + v2);	// 3.14

		// 올림
		double v3 = Math.ceil(5.3);
		double v4 = Math.ceil(-5.3);
		System.out.println("v3 = " + v3);	// 6.0
		System.out.println("v4 = " + v4);	// -5.0

		// 버림
		double v5 = Math.floor(5.3);
		double v6 = Math.floor(-5.3);
		System.out.println("v5 = " + v5);	// 5.0
		System.out.println("v6 = " + v6);	// -6.0

		// 최대값
		int v7 = Math.max(5, 9);
		double v8 = Math.max(5.3, 2.5);
		System.out.println("v7 = " + v7);	// 9
		System.out.println("v8 = " + v8);	// 5.3

		// 최소값
		int v9 = Math.min(5, 9);
		double v10 = Math.min(5.3, 2.5);
		System.out.println("v9 = " + v9);	// 5
		System.out.println("v10 = " + v10);	// 2.5

		// 랜덤
		double v11 = Math.random();
		System.out.println("v11 = " + v11);	// 0.5883242094167148

		// 가까운 정수형 실수
		double v12 = Math.rint(5.3);
		double v13 = Math.rint(5.7);
		System.out.println("v12= " + v12);	// 5.0
		System.out.println("v13 = " + v13);	// 6.0

		// 반올림
		long v14 = Math.round(5.3);
		long v15 = Math.round(5.7);
		System.out.println("v14= " + v14);	// 5
		System.out.println("v15 = " + v15);	// 6

		double value = 12.3456;
		double temp1 = value * 100;			// 1234.56
		long temp2 = Math.round(temp1);		// 1235
		double v16 = temp2 / 100.0;			// 12.35
		System.out.println("v16 = " + v16);	// 12.35
		
	}

}
