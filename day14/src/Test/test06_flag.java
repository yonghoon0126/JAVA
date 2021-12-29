package Test;

import java.util.Scanner;

//문제6) 사용자로부터 임의의 정수를 입력 받아
//입력받은 정수가 소수인지 아닌지를 판별하여
//결과를 출력하세요
//
//출력)
//정수입력 : 11
//11 ==> 소수

public class test06_flag {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num, i=2;
		boolean flag = true;	// 소수

		System.out.print("정수 입력 : ");
		num = sc.nextInt();

		while (i < num) {

			if(num % i ==0)
				flag = false;	//소수 아님
			i++;
		}
		if(flag && num!=1)
			System.out.println(num + " ==> 소수");
		else
			System.out.println(num + " ==> 소수아님");

	}
}
