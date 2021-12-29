package Homework;

public class September {
	public static void main(String[] args) {

		System.out.println("2021년 9월\t\t\t\t∧\t∨" + "\n");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.print("\t\t\t");

		int i;

		for (i = 1; i < 31; i++) {
			System.out.print(i + "\t");
			if (i % 7 == 4) {
				System.out.print("\n");
			}
		}
	}
}
