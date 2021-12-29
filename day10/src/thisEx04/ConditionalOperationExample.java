package thisEx04;

import java.util.Scanner;

class ConditionalOperationExample {

	public static void main(String[] args) {
		//		int score = 85;
		//		char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C');
		//		System.out.println(score + "점은 " + grade + "등급입니다.");


		// while문으로 -1이 들어 올 때 까지 반복하세요.(hasNext(),또는 조건 이용

		Scanner sc = new Scanner(System.in);
		int score = 0;
		char grade = ' ' ;

		while(true) {	// score != -1 	{ -1 들어오면 끝
			System.out.println("0 ~ 100 사이 정수를 입력하세요. ");

			score = sc.nextInt();
		 // if (score == -1) break;
			if (score == -1) {
				System.out.println("이제 그만.");
				break;
			}
			// if문
			if(score > 90) {
				grade = 'A';
			} else if(score > 80) {
				grade = 'B';
			} else
				grade = 'C';

			System.out.println(score + "점은 " + grade + "등급입니다.");
		}
	}

}
