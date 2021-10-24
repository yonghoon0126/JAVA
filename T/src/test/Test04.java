package test;

import java.util.Scanner;

/*문제4] 학생수를 입력 받고, 그 수 만큼 점수를 입력 받아
 *      전체 학생의 점수의 합, 평균, 편차를 구하여
 *      결과를 출력하시오.
 *      단, 배열을 활용하여 처리하시오.
 *      출력)
 *      학생수 입력: 5
 *      1번 학생 점수 입력 :90
 *      2번 학생 점수 입력 :82
 *      3번 학생 점수 입력 :64
 *      4번 학생 점수 입력 :36
 *      5번 학생 점수 입력 :98
 *      
       합  : 370
       평균 : 74
       편차
       -------------  
		90 : 16
		82 : 8
		64 : -10
		36 : -38
		98 : 24
 * */
public class Test04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, sum=0;
		
		System.out.print("학생수 입력: ");
		n=sc.nextInt();
		int score[]=new int[n];
		for (int i = 0; i < score.length; i++) {
			System.out.print((i+1)+"번 학생 점수 입력 :");
			score[i]=sc.nextInt();
			sum +=score[i];
		}
		int avg=sum/score.length;

		System.out.println();		
		System.out.println("합  : "+ sum);
		System.out.println("평균 : "+ avg);
		System.out.println("편차");
		System.out.println("-----------------------");

		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]+"  :  "+(score[i]-avg));
		}

	}

}
