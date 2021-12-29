package Test;

import java.util.Random;

public class Ex3 {

	public static void main(String[] args) {

		Random r = new Random();

		int num[] = new int[5];

		int sum = 0;
		int n = 0;

		for (int i = 0; i < num.length; i++) {
			n = r.nextInt(10) + 1 ;
			System.out.printf("numbers[%d] = %d%n", i, n);
			sum += n;
		}
		System.out.println("numbers[0] ~ numbers[4] ÀÇ ÇÕ? = " + sum);
	}
}
