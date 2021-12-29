package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//문제7)
//조건) BufferedReader, 삼항연산자(조건연산자)이용
//출력)
//임의의 정수 입력 : 15
//
//===[판별 결과]===
//15 ==> 홀수

public class Test07 {

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = 0;
		String str;

		System.out.print("임의의 정수 입력 : ");
		a = Integer.parseInt(br.readLine());


		
//		if (a % 2 == 1){
		
//			str = "홀수";
//		} else {
//			str = "짝수";
//		}
		str = (a%2==0) ?  "짝수" : "홀수";

		System.out.println();
		System.out.println("===[판별 결과]===");
		System.out.println(a + " ==> " + str);
	
	}
}
