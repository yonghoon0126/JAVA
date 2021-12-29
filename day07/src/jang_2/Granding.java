package jang_2;

import java.util.Scanner;

public class Granding {
	public static void main(String []args) {
		char grade;
		Scanner a = new Scanner(System.in);
		System.out.print("점수 : ");
		while(a.hasNext()) {

			int score = a.nextInt();

			if(score >= 90.0 ) //score가 90.0 이상인 경우
				grade = 'A';
			else if(score >= 80.0)	 //score가 80.0 이상인 경우
				grade = 'B';
			else if(score >= 70.0)	 //score가 70.0 이상인 경우
				grade = 'C';
			else if(score >= 60.0)	//score가 60.0 이상인 경우
				grade = 'D';
			else
				grade = 'F';
			System.out.println("학점은 " +grade+ "입니다");
			System.out.print("점수 : ");

		}

	}

}
