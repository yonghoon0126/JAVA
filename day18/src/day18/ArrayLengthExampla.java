package day18;

// javac ArrayLengthExample.java --> ArrayLengthExample.class
// javac ArrayLengthExample
public class ArrayLengthExampla {

	public static void main(String[] args) {

		int[] scores = { 83, 90, 87 };	//3 --> 0 ~ 2
		int sum = 0;

		try {	// 0 ~ 3

			for (int i = 0; i <= scores.length; i++) {
				sum += scores[i];
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
		}
		System.out.println("ÃÑÇÕ : " + sum);

		double avg = (double) sum / scores.length;
		System.out.println("Æò±Õ : " + avg);

	}

}
