package thisEx05;

import java.util.Scanner;

public class ArrayCreateByValueListExample_scanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = 0;	// 학생 수 
		int sum = 0;
		double avg = 0;

		System.out.print("학생 수를 입력하세요 : ");
		n = sc.nextInt();

		int score[] = new int[n]; // 학생 수 만큼 점수를 배열에 저장

		for (int i = 0; i < score.length; i++) {
			System.out.println("점수를 입력하세요 : ");
			score[i] = sc.nextInt();
			sum += score[i];
			avg = sum / n;	// n(학생수) 또는 score.length(점수 갯수)도 가능
		}
		System.out.print("합계 : " + sum);
		System.out.println();
		System.out.print("평균 : " + avg);
	}
}

//1. 학생 수 키보드로 입력받기
//2. 입력값 배열에 저장
//3. for문 안에서 배열로 점수 입력받기
