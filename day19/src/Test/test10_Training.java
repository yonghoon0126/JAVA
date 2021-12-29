package Test;

//문제6] 암산 트레이닝!! 랜덤(x,y,z)를 1~10까지 난수를 구해 아래와 같이 출력하시오.
//출력)
//1 + 8 + 10 = 1
//틀렸습니다!!
//1 + 8 + 10 = 19
//잘 했어요.
//
//다시 한번? <Yes-1/No-0> : 1
//1 + 3 + 3 = 7
//잘 했어요.
//
//다시 한번? <Yes-1/No-0> : 0
//그만~~ 

import java.util.Random;
import java.util.Scanner;

public class test10_Training {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Random r = new Random();

		System.out.println("암산 트레이닝");

		do {

			int x = r.nextInt(10);
			int y = r.nextInt(10);
			int z = r.nextInt(10);

			while(true) {
				System.out.printf("%d + %d + %d = ", x, y, z);
				int n = sc.nextInt();	// 사용자 답 입력

				if(n == x + y + z) {
					System.out.println("잘 했어요.\n");
					break;
				}	// 오답 후 반복
				System.out.println("틀렸습니다.\n");
			}	// while

		}while(confirmRetry( ));	// 1
		System.out.println("그만.");
	}

	static boolean confirmRetry() {
		int count;
		do {
			System.out.print("다시 한번? <Yes-1 / NO-0> : ");
			count = sc.nextInt();
		}while(count != 0 && count != 1);	// 1, 0 아니면 반복
		
		return count == 1;
	}

}
