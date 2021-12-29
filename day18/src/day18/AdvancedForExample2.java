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
//		System.out.println("점수 총합 : " + sum);
//		
//		double avg = (double)sum / scores.length;
//		System.out.println("점수 평균 : " + avg);

		// 메소드 호출, 외부에서 출력하고 돌아오기
		disp(sum, scores.length); // 값 전달 : call by value : 값만 복사

	}

	public static void disp(int sum, int length) {

		System.out.println("점수 총합 : " + sum);

		double avg = (double) sum / length;
		System.out.println("점수 평균 : " + avg);

	}

}
