package Test;

import java.util.Scanner;

//문제5) 사용자로부터 임의의 두정수를 입력받아 작은 수 부터 큰 수까지의 합을 구하여
//결과를 출력하는 프로그램을 구현한다.
//
//출력)
//첫 번째 정수 입력 : 10
//두 번째 정수 입력 : 20
//첫번째 정수 ~ 두번째 정수까지의 합 : 
//
//swap하면-----
//첫 번째 : 20
//두 번째 : 10

public class test05_swap {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n1, n2, sum = 0;

		System.out.println("첫 번째 정수 입력 : ");
		n1 = sc.nextInt();

		System.out.println("두 번째 정수 입력 : ");
		n2 = sc.nextInt();

		if (n1 < n2) {
			for (int i = n1; i <= n2; i++) {
				sum = sum + i;

			}
		}else {
			for(int i = n2; i<=n1; i++) {
				sum = sum + i;
			}
		}
		System.out.printf("%d ~ %d 까지의 합 : %d\n", n1, n2, sum);
		System.out.println("swap하면----");

		n1 = n1 ^ n2;
		n2 = n2 ^ n1;
		n1 = n1 ^ n2;

		System.out.println("첫 번째 : " + n1);
		System.out.println("두 번째 : " + n2);
	}
}
