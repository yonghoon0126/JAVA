package day18;

public class AdvancedForExample2 {

	public static void main(String[] args) {

		int scores[] = { 95, 71, 84, 93, 87 };

//		int sum = 0;
//		for (int score : scores) {
//			sum = sum + score;
//		}
		
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum = sum + scores[i];
		}
//		System.out.println("���� ���� : " + sum);
//		
//		double avg = (double)sum / scores.length;
//		System.out.println("���� ��� : " + avg);

		// �޼ҵ� ȣ��, �ܺο��� ����ϰ� ���ƿ���
		disp(sum, scores.length); // �� ���� : call by value : ���� ����

	}

	public static void disp(int sum, int length) {

		System.out.println("���� ���� : " + sum);

		double avg = (double) sum / length;
		System.out.println("���� ��� : " + avg);

	}

}
