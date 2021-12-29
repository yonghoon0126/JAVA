package day18;

public class AdvancedForExample {

	public static void main(String[] args) {

		int scores[] = {95, 71, 84, 93, 87};

//		int sum = 0;
//
//		for(int score : scores) {
//			sum = sum + score;
//		}
//		System.out.println("Á¡¼ö ÃÑÇÕ : " + sum);
//		
//		double avg = (double)sum / scores.length;
//		System.out.println("Á¡¼ö Æò±Õ : " + avg);

		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum = sum + scores[i];
		}
		System.out.println("Á¡¼ö ÃÑÇÕ : " + sum);
		
		double avg = (double)sum / scores.length;
		System.out.println("Á¡¼ö Æò±Õ : " + avg);
		
	}

}
