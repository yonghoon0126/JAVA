package thisEx04;

public class ForPrintFrom1To10Example {
	public static void main(String[] args) {

		int i = 0;
		int sum = 0;

		// 출력)
		// 합변수 선언
		// 1,2,3,4,5,6,7,8,9,10
		// 1~10의 합 = 55

		for (i = 1; i <= 10; i++) {
			sum += i;

			if (i < 10)
				System.out.print(i + ",");
			else
				System.out.println(i);

		}
		System.out.print("\n1~" + (--i) + "의 합 = " + sum);
	}
}
