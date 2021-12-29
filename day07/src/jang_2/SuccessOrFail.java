package jang_2;

import java.util.Scanner;

public class SuccessOrFail {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("점수를 입력하세요.");

		int score = sc.nextInt();
		String str = "";	//null
		if(score >= 80)
			str="는 축하합니다 ! 합격입니다.";
		//System.out.println(score+ "점은 축하합니다! 합격입니다.");
		else 
			str="는 불합격입니다.";
		//System.out.println(score+ "점은 불합격입니다.");

		// 3항 연산자

		System.out.println(score+str);
		System.out.println((score >= 80)?
				score+"는 축하합니다 ! 합격입니다." :score+"는 불합격입니다.");


	}
}
