package jang_3;

import java.util.Scanner;

//키보드값 구해서 몇개, 평균
public class WhileSample {
	public static void main(String [] args) {

		Scanner sc = new Scanner(System.in);
		int n = 0; //입력 갯수
		double sum = 0;	//합
		int i = 0;	
/*		while((i = sc.nextInt()) !=0){
			sum += i;
			n++;
		}
		System.out.println("입력된 개수는"+n+"개 이며 평균은 " +sum/n+"입니다.");
*/
		System.out.println("----do~while----");
		do {
			sum += i;
			n++;
		}while ((i = sc.nextInt()) !=0);
		System.out.println("입력된 개수는"+n+"개 이며 평균은 " +sum/n+"입니다.");
	}
}
