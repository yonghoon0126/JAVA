package test;

import java.util.Scanner;

/*
문제2] 임의의 수를 입력 받아 배열의 크기를 지정,
      배열의 모든 요소에 난수를 대입해서 가로 방향의 막대그래프로 표시,
	  배열의 모든 요소에 1~10의 난수를 대입해서 표시하는 프로그램
출력) 
요소 수 : 5
a[0] : *********
a[1] : ****
a[2] : *
a[3] : *******
a[4] : ****

추가: 요소 수가: 짝수이면 ♬ , 홀수이면 *
* */
public class Test02 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("요소 수 : ");
		int n = stdIn.nextInt( );
		int[ ] a = new int[n];//3
	
	/*	for (int i = 0; i < n; i++) {
			a[i]=1+ (int)( Math.random()*10);//2 3 3
		}*/
		for (int i = 0; i < n; i++) {
			System.out.print("\na[" + i + "] : ");
			a[i]=1+ (int)( Math.random()*10);
			for (int j = 0; j < a[i]; j++) {
				if(n % 2==0) {
					System.out.print('♬');
				}else {
					System.out.print('*');
				}
			}
		}

	}

}
