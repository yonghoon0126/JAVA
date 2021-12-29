package cook8;

import java.util.Scanner;

public class Ex08_12_Car {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char[] stack = new char[5];
		int top = 0;

		char carName = 'A';
		int select = 9;

		while (select != 3) {
			System.out.printf("<1> 자동차 넣기 <2> 자동차 빼기 <3> 끝 : ");
			select = sc.nextInt();

			switch (select) {

			case 1:
				
				if (top >= 5) {
					System.out.printf("터널이 꽉 차서 차가 못 들어감.\n");
				} else {
					stack[top] = carName++;	// B
					System.out.printf("%c 자동차가 터널에 들어감.\n", stack[top]);
					top++;
				}
				break;

			case 2:
				
				if (top <= 0) {
					System.out.printf("빠져나갈 자동차가 없음.\n");
				} else {
					top--;
					System.out.printf("%c 자동차가 터널에서 빠짐.\n", stack[top]);
					stack[top] = ' ';
				}
				break;

			case 3:
				
				System.out.printf("현재 터널에 %d대가 있음.\n", top);
				System.out.printf("프로그램을 종료합니다.\n");
				break;

			default:
				System.out.printf("잘못 입력했습니다. 다시 입력하세요.\n");
			}
		}

	}

}
