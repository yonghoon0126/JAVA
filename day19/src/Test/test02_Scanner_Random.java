package Test;

import java.util.Random;
import java.util.Scanner;

//문제2)
//임의의 수를 입력 받아 배열의 크기를 지정,
//배열의 모든 요소에 난수를 대입해서 가로 방향의 막대그래프로 표시,
//배열의 모든 요소에 1~10의 난수를 대입해서 표시하는 프로그램
//출력)
//요소 수 : 5
//a[0] : ***********
//a[1] : ******
//a[2] : **
//~
//a[9] : *******
//a[10] : *********

//추가 : 요소수가 짝수이면 ☆, 홀수이면 *

//1. 키보드 입력
//2. 키보드 입력 값 랜덤, 배열에 저장
//3. 배열 출력
//4. 출력값에 랜덤값 저장

public class test02_Scanner_Random {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Random ran = new Random();

		System.out.println("요소 수  : ");
		int n = sc.nextInt();
		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
//			System.out.print("\na[" + i + "] = ");
			System.out.printf("\na[%d] = ",i);
			a[i] = 1 + (int) (Math.random() * 10);
			
			
			for (int j = 0; j < a[i]; j++) {
				if (n % 2 == 0) {	// 짝수이면
					System.out.print('☆');
				} else {	// 홀수이면
					System.out.print('*');
				}
			}
		}
	}
}
