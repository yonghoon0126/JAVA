package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//문제9) 사용자로부터 임으의 두 정수와 연산자를 입력받아
//해당 연산자의 처리 결과를 출력하는 프로그램을 작성한다.
//단, BufferedReader / if, Scanner/if/switch
//(조건문을 활용하여 구현할 수 있도록 하며, 연산결과는 편의상 정수형으로 처리되도록 한다.)

//출력)
//첫 번째 정수 입력 : 4
//두 번째 정수 입력 : 5
//연산자 입력[+ - * /] : +
//4 + 5 = 9

public class Test09_1_Calculating {

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = 
				new BufferedReader (new InputStreamReader(System.in) ) ;

		int a, b;
		String s;

		while (true) {
			
			System.out.print("첫 번재 정수 입력 : ");
			a = Integer.parseInt(br.readLine());

			System.out.print("두 번재 정수 입력 : ");
			b = Integer.parseInt(br.readLine());
			
			System.out.print("연산자 입력[+ - * /] : ");
			s = br.readLine();
			

			if (s == "+") {
				System.out.println(a + " + " + b + " = " + (a + b));
			} else if (s == "-") {
				System.out.println(a + " - " + b + " = " + (a - b));
			} else if (s == "*") {
				System.out.println(a + " * " + b + " = " + (a * b));
			} else if (s == "/") {
				System.out.println(a + " / " + b + " = " + (a / b));
			}
			


		}
	}
}
