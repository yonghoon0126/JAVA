package Cook05;

import java.util.Scanner;

public class Ex05_06 {

	public static void main(String[] args) {

		// while문으로 몇번 돌렸는지, 10번 돌렸을 때 break
		Scanner sc = new Scanner(System.in);

		int a = 0;
		int n = 0; // 횟수

		while (n < 5) {

			System.out.println("정수를 입력하세요.");
			a = sc.nextInt();
			n++;
			System.out.println(n + "번째");

			if (a % 2 == 0) {
				System.out.println("짝수를 입력하셨군요.");
			} else {
				System.out.println("홀수를 입력하셨군요.");
			}
			
		}
		System.out.println("종료 되었습니다.");

	}

}
