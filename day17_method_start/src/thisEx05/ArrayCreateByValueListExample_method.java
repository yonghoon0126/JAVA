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
		System.out.println("���� : " + sum);
	}
	
	// ���� ���
	public static void main(String[] args) {
		int[] scores = new int[] {83, 90, 87};
		int sum1 = 0;
		for(int i = 0; i < scores.length; i++) {
			sum1 += scores[i];
		}
		disp(sum1);	// System.out.println("���� : " + sum1);

		// �޼ҵ� ȣ��
		int sum2 = add(new int[] {83, 90, 87});
		disp(sum2);	// System.out.println("���� : " + sum2);
		System.out.println();

		System.out.println("---�޼ҵ� ȣ���ؼ� ���� ��� �� ����---");
		disp(sum1);
		disp(sum2);
	};
}

