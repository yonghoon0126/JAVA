package Test;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {

//	문1) 키보드로 입력 받은 금액을 잔돈 500, 100, 50, 10원으로 각각 구하여 아래와 같이 출력하시오
//	힌트) / , %를 이용하세요.
//	출력)
//	##교환 할 돈은?555
//			
//	오백원짜리		==> 1개
//	백원짜리		==> 0개
//	오십원짜리		==> 1개
//	십원짜리		==> 0개
//	바꾸지 못한 잔돈 ==> 5원

		Scanner s = new Scanner(System.in);
		int money, c500, c100, c50, c10, c;

		System.out.println("## 교환할 돈은 ? ");
		
		money = s.nextInt(); // 555

		c500 = money / 500; // 1
		money = money % 500; // 55

		c100 = money / 100; // 1
		money = money % 100; // 0

		c50 = money / 50; // 1
		money = money % 50; // 5

		c10 = money / 10; // 0
		money = money % 10; // 0

		c = money / 1; // 5
		money = money % 1; // 0

		System.out.println("");
		System.out.println("오백원짜리 \t\t ==> " + c500 + "개");
		System.out.println("백원짜리 \t\t ==> " + c100 + "개");
		System.out.println("오십원짜리 \t\t ==> " + c50 + "개");
		System.out.println("십원짜리 \t\t ==> " + c10 + "개");
		System.out.println("바꾸지 못한 잔돈 \t ==> " + c + "원");

	}

}
