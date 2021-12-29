package thisEx02;

import java.util.Scanner;

public class BooleanExample {

	public static void main(String[] args) {
		boolean stop = true;

		Scanner scan = new Scanner(System.in);
		System.out.println("중지/시작[true/false] ");
		stop = scan.nextBoolean();
		
		if (stop) { // if의 개수 <= 조건의 개수 - 1
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");

		}

	}

}
