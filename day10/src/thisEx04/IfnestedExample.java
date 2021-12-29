package thisEx04;

public class IfnestedExample {
	public static void main(String[] args) {

		int score = (int) (Math.random() * 20) + 81; // 100 - 81 + 1
		System.out.println("점수 : " + score);

		byte b = 127;
		b++;
		System.out.println(b);
		String grade;

		if (score >= 90) {
			if (score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else {
			if (score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}

		}

		System.out.println("학점 : " + grade);
	}
}
