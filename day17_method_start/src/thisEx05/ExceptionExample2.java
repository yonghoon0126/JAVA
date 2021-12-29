package thisEx05;

import java.util.Scanner;

public class ExceptionExample2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int divisor = 0;
		int dividend = 0;

		System.out.print("나누어지는 수를 입력하시오.");
		dividend = sc.nextInt();
		System.out.print("나누는 수를 입력하시오.");
		divisor = sc.nextInt();

		try {	// 실행 에러 검사
			System.out.print(dividend + "를" + divisor + "로 나누면 몫은 " + 
								dividend / divisor + "입니다.");
		
		} catch (ArithmeticException e) {	// 정수를 0으로 나눌 때 발생하는 에러
			System.out.println(e.getMessage());

		} catch (Exception e) {	// 에러 처리
			System.out.println("0으로 나눌 수 없습니다.");
		
		
		} finally {	// 주로 자원을 반환할 목적으로 사용
			System.out.println("여기는 무조건 해요.");
		}
	}
}
