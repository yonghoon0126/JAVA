package this04;

import java.util.Random;

public class BreakExample {
	public static void main(String[] args) {

		while (true) {
//			int num = (int)(Math.random()*6) + 1;
//			System.out.println(num);

			Random r = new Random();
			int num = r.nextInt(6) + 1; //

			if (num == 6) {
				break;
			}

		}
		System.out.println("프로그램 종료.");
	}
}
