package Cook05;

import java.util.Scanner;

public class Ex05_07 {

	public static void main(String[] args) {

		System.out.println("숫자를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		while (true) {

			int a = 0;
			a = sc.nextInt();

			if (a > 50) {
				if (a < 100) {
					System.out.println("50보다 크고 100보다 작군요..");
				} else {
					System.out.println("와~100보다 크군요..");
				}
			} else {
				System.out.println("애개~ 50보다 작군요..");
			} 
			if(a == -1)
				System.out.println("종료 되었습니다.");
				break;
		}
	}

}
