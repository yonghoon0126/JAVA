package day18;

public class AdvancedForExample3 {

	public static void main(String[] args) {

		int scores[] = { 95, 71, 84, 93, 87 };

		int sum = 0;
		sum = calc(scores); // �ּ� �ѱ�� : call by address
		System.out.println("���� ���� : " + sum);
		System.out.println("���� ��� : " + ((double) sum / scores.length));
	}

	public static int calc(int[] scores) {

//		int sum = 0;
//		for (int score : scores) {
//			sum = sum + score;
//		}
//		return sum;
		
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum = sum + scores[i];
		}
		return sum;
	}

}

