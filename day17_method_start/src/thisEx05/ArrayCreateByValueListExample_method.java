package thisEx05;

import java.util.Scanner;

public class ArrayCreateByValueListExample_method {

	static int add(int[] scores) {

		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		return sum;
	};

	static void disp(int sum) {
		System.out.println("총합 : " + sum);
	}
	
	// 총합 출력
	public static void main(String[] args) {
		int[] scores = new int[] {83, 90, 87};
		int sum1 = 0;
		for(int i = 0; i < scores.length; i++) {
			sum1 += scores[i];
		}
		disp(sum1);	// System.out.println("총합 : " + sum1);

		// 메소드 호출
		int sum2 = add(new int[] {83, 90, 87});
		disp(sum2);	// System.out.println("총합 : " + sum2);
		System.out.println();

		System.out.println("---메소드 호출해서 총합 출력 해 보기---");
		disp(sum1);
		disp(sum2);
	};
}

