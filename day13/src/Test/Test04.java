package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//문제4) 키보드로 두 수를 입력 받아 아래와 같이 출력하시오.
//조건 : BufferedReader 사용
//출력)
//첫 번째 정수 입력 : 10
//두 번째 정수 입력 : 2
//
//====[연산 결과]====
//10 + 2 = 12
//10 - 2 = 8
//10 * 2 = 20
//10 / 2 = 5
//10 % 2 = 0

public class Test04 {
	public static void main(String[]args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a,b;

		System.out.println("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.println("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.println("====[연산 결과]====");
		System.out.println(a + " + " + b + " = " + (a + b));
		System.out.println(a + " - " + b + " = " + (a - b));
		System.out.println(a + " * " + b + " = " + (a * b));
		System.out.println(a + " / " + b + " = " + (a / b));
		System.out.println(a + " % " + b + " = " + (a % b));
		
		
	}

}
