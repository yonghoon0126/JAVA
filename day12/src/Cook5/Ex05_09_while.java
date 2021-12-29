package Cook5;

import java.util.Scanner;

public class Ex05_09_while {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a = 0;
		int n = 0;

		while(n < 5) {

			System.out.println("1 ~ 4 중 선택하세요.");
			a = s.nextInt();
			n++;
			
			if (a==1) {
				System.out.println("1을 선택했습니다.");
			}else if(a==2) {
				System.out.println("2를 선택했습니다.");
			}else if(a==3) {
				System.out.println("3을 선택했습니다.");
			}else if(a==4) {
				System.out.println("4를 선택했습니다.");
			}else			
				System.out.println("잘못 선택했습니다.");
			System.out.println(" ");
		}
		System.out.println("종료 되었습니다.");

	}

}
