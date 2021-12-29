package arrangement;

import java.util.Random;
import java.util.Scanner;

public class IfDiceExample {
	public static void main(String[] args) {

		// int num = (int)(Math.random()*6) + 1;
		//
		// if(num == 1) {
		// System.out.println("1번이 나왔습니다.");
		// }else if(num == 2 ){
		// System.out.println("2번이 나왔습니다.");
		// }else if(num == 3 ){
		// System.out.println("3번이 나왔습니다.");
		// }else if(num == 4 ){
		// System.out.println("4번이 나왔습니다.");
		// }else if(num == 5 ){
		// System.out.println("5번이 나왔습니다.");
		// }else
		// System.out.println("6번이 나왔습니다.");

		int num = 0;
		Random r = new Random();
		int str = 0;
		// num = (int)(Math.random()*6) + 1;
		// num = r.nextInt(6)+1;
		
		while (num != 1) {
			System.out.println("주사위를 던지세요.");
			num = r.nextInt(6) + 1;

			if (num == 1) {
				str = num;
				System.out.println(num + "번이 나왔습니다.");
				System.out.println("끝났습니다.");
				break;

			} else if (num == 2) {
				System.out.println(num + "번이 나왔습니다.");

			} else if (num == 3) {
				str = num;
				System.out.println(num + "번이 나왔습니다.");

			} else if (num == 4) {
				str = num;
				System.out.println(num + "번이 나왔습니다.");

			} else if (num == 5) {
				str = num;
				System.out.println(num + "번이 나왔습니다.");
				
			} else {
				str = num;
				System.out.println(num + "번이 나왔습니다.");
			}
		}
		System.out.println();
	}
}

