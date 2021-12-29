package Test;

public class test03_forforfor {

	public static void main(String[] args) {

		int i, j;

		for (i = 1; i <= 9; i++) {
			for (j = 2; j <= 5; j++) {
				System.out.print(j + " * " + i + " = " + (i * j) + "\t");

				if (j == 5) {
					System.out.println();
				}
			}
		}
		System.out.println();
		
		for (i = 1; i <= 9; i++) {
			for (j = 6; j <= 9; j++) {
				System.out.print(j + " * " + i + " = " + (i * j) + "\t");

				if (j == 9) {
					System.out.println();

				}
			}
		}
	}
}
