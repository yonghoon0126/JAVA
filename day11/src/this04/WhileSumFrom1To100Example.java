package this04;

public class WhileSumFrom1To100Example {
	public static void main(String[] args) {

		int sum = 0;
		int i = 1;

//		while (i <= 10) {
//			sum += i;
//			if (i% 5 == 0) {
//				System.out.println();
//			}
//			i++;
//			System.out.print(i + " ");
//		}
//		System.out.println();
//		System.out.print("1 ~ " + (i - 1) + "гу = " + sum);

		// ---------------------------------------------------------------

		for (i = 1; i <= 10; i++) {
			if (i < 10) {
				System.out.print(i + ",");
			} else {
				System.out.println(i);
				sum += i;
			}
		}
		System.out.println("1 ~ " + (i - 1) + "гу = " + sum);
	}
}
