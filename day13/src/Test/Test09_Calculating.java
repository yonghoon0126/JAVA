package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//문제9) 사용자로부터 임으의 두 정수와 연산자를 입력받아
//해당 연산자의 처리 결과를 출력하는 프로그램을 작성한다.
//단, BufferedReader / if, Scanner/if/switch
//(조건문을 활용하여 구현할 수 있도록 하며, 연산결과는 편의상 정수형으로 처리되도록 한다.)

//출력)
//첫 번째 정수 입력 : 4
//두 번째 정수 입력 : 5
//연산자 입력[+ - * /] : +
//4 + 5 = 9

public class Test09_Calculating {

	public static void main(String[] args) throws NumberFormatException, IOException {

		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Scanner br=new Scanner(System.in);

		int n1,n2, result=0;
		char op;

		System.out.print("첫 번째 정수 입력 : ");
		n1 = br.nextInt();

		System.out.print("두 번째 정수 입력 : ");
		n2 = br.nextInt();

		System.out.print("연산자 입력[+ - * /] : ");
		op = br.next().charAt(0);

//		if(op == '+') {
//			result = n1 + n2;
//		}
//
//		else if(op == '-'){
//			result = n1 - n2;
//		}
//
//		else if(op == '*'){
//			result = n1 * n2;
//		}
//
//		else if(op == '/'){
//			result = n1 / n2;
//		}
//
//		else
//			System.out.println("연산자를 잘못 입력하셨습니다.");
//		
//		System.out.println(n1 + " "+ op + " " + n2 + " = " + result );


		// switch

//		switch (op) {
//
//		case '+':
//		result = n1 + n2;
//		break;
//
//		case '-':
//		result = n1 - n2;
//		break;
//
//		case '*':
//		result = n1 * n2;
//		break;
//
//		case '/':
//		result = n1 / n2;
//		break;
//
//		default:
//		System.out.println("연산자를 잘못 입력하셨습니다.");
//		break;
//		}
//
//		System.out.println(n1 + " " + op + " " + n2 + " = " + result );

		// ----------------------------반복

		System.out.println("999가 입력되면 끝내세요.");

		while(true) {

			System.out.print("첫 번째 정수 입력 : ");
			n1 = br.nextInt();

			System.out.print("두 번째 정수 입력 : ");
			n2 = br.nextInt();

			if(n1 == 999 & n2 == 999){ break; }
			System.out.print("연산자 입력[+ - * /] : ");
			op = br.next().charAt(0);

			switch (op) {
			case '+': result = n1 + n2; break;
			case '-': result = n1 - n2; break;
			case '*': result = n1 * n2; break;
			case '/': result = n1 / n2; break;

			default: System.out.println("연산자를 잘못 입력하셨습니다.");
			break;
			}

			System.out.println(n1 + " " + op + " " + n2 + " = "+ result + "\n" );

		}//while

	}

}