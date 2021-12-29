package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//사용자로부터 반지름을 입력받아
//원의 둘레와 넓이를 구하는 프로그램을 작성한다.

//실행 예)
// 원의 반지름 : 10
// 넓이 : xxx.xxx
// 둘레 : xxx.xxx
public class Test02 {
	public static void main(String[] args) 
			throws NumberFormatException, IOException {

		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		int r; // 지름
		double a, b; // 넓이, 둘레
		final double PI = 3.141592; // 원주율

		System.out.print("원의 반지름 입력 : ");
		r = Integer.parseInt(br.readLine());	//엔터 전까지 문장으로 읽어오겠다
		// parsh ==> 기본형으로 바꿀 때 ex) int -> parseint
		// 넓이
		a = r * r * PI;
		// 둘레
		b = r * 2 * PI;
		System.out.printf("넓이 : %.2\n", a);
		System.out.printf("둘레 : %.2\n", b);

	}

}
