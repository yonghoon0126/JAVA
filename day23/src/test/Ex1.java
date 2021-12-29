package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//사용자로부터 임의의 정수를 두번 입력받아 사칙연산 및 나머지연산을 수행하여
//결과를 출력하시오. 
//(단, 입력은 BufferedReader, readLine(), printf() 사용하시오)
//
//출력형식)
//첫 번째 정수 입력 : 10
//두 번째 정수 입력 : 2
//==[연산 결과]====
//10 + 2 = 12
//10 - 2 = 8
//10 * 2 = 20
//10 / 2 = 5
//10 % 2 = 0

public class Ex1 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int num1, num2; 
//		int result = 0;
	
		System.out.print("첫 번째 정수 입력 : ");
		num1 = Integer.parseInt(br.readLine() );
		
		System.out.print("두 번째 정수 입력 : ");
		num2 = Integer.parseInt(br.readLine() );
		
		int result1 = num1 + num2;
		int result2 = num1 - num2;
		int result3 = num1 * num2;
		int result4 = num1 / num2;
		int result5 = num1 % num2;
		
		
		System.out.println("==[연산 결과]====");

		System.out.printf("%d + %d = %d%n", num1, num2, result1);
		System.out.printf("%d - %d = %d%n", num1, num2, result2);
		
		try {
			System.out.printf("%d * %d = %d%n", num1, num2, result3);
			System.out.printf("%d / %d = %d%n", num1, num2, result4);
			System.out.printf("%d %% %d = %d%n", num1, num2, result5);
			
		} catch (ArithmeticException e) {	
			System.out.println(e.getMessage());
			
		} catch (Exception e) {	
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}

}


//10 + 2 = 12
//
//10 - 2 = 8
//
//10 * 2 = 20
//
//10 / 2 = 5
//
//10 % 2 = 0
