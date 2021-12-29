package Test;

import java.util.Scanner;

//문제2) 키보드로 단을 입력 받아 if문으로 아래와 같이 출력 되게 하시오
//조건) 2~9단 사이에 수를 입력받는다
//2~9이외의 수가 나오면 "2~9까지의 정수만 입력 가능합니다" 출력
//출력)
//원하는 단(구구단)입력 : 4
//4 * 1 = 4
//4 * 2 = 8

public class test02_while {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i=1;
		int	n=1;

		while (true) {

			System.out.println("원하는 단(구구단) 입력 : ");
			n = sc.nextInt();

			if(n>=2 && n<=9) {
				while(i<=9) {
					System.out.println(i + " * " + n + " = " + (i * n));
					i++;
				}
			}else {
				if(n==-1) break;
				System.out.println("2~9까지의 정수만 입력 가능합니다.");
			}
			i=1;
		}
		System.out.println("종료.");
	}
}