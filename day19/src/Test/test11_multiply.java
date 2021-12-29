package Test;

import java.util.Scanner;

//문제11)
//a의 b승을 계산하시오
//입력과 출력은 메인에서 작성하고 계산만 메소드 이용하시오.
//출력)
//실수 a : 3
//정수 b : 2
//3.0의 2승은 9.0입니다.

public class test11_multiply {
	
	static double result(double a, int b) {
		double sum = 1.0;
		for(int i = 0; i < b; i++)
			sum *= a;
		
		return sum;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("a의 b승을 계산합니다.");
		
		System.out.print("실수 a : ");
		double a = sc.nextDouble();
		
		System.out.print("정수 b : ");
		int b = sc.nextInt();
		
		System.out.printf("%.1f의 %d승은 %.1f입니다.", a, b, result(a,b));
	}
	

}
