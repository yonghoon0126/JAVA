package test;

import java.util.Random;

//[요구사항-3] 1~10까지(1과 10 포함)의 숫자 중 랜덤으로 5개의 숫자를 
//만들어 크기가 5인 배열numbers에 담고, 합계를 구하시오.
//
//출력형식)
//numbers[0] = ?
//...
//numbers[4] = ?
//
//numbers[0]~numbers[4] 의 합 = ?

public class Ex3_Random {

	public static void main(String[] args) {

		Random r = new Random();

		int num[] = new int[5];

		int sum = 0;
		int n = 0;

		for (int i = 0; i < num.length; i++) {
			n = r.nextInt(10) + 1 ;
			System.out.printf("numbers[%d] = %d%n", i, n);
			sum += n;
		}
		System.out.println("numbers[0] ~ numbers[4] 의 합? = " + sum);
	}
}
