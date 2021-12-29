package Test;

import java.util.Scanner;

public class Test06_scanner {

//	문제5) 키보드로 이름과, 국어/영어/수학점수를 입력받아
//	총점을 구하여 아래처럼 출력하시오.(BufferedReader사용)
//	
//	이름을 입력하세요 : 오민경
//	국어 : 100
//	영어 : 90
//	수학 : 80
//	
//	=====[결과]=====
//	이름 : 오민경
//	국어점수 : 100
//	영어점수 : 90
//	수학점수 : 80
//	총점 : 270
	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);
		
		String s = "";
		
		int k = 0;
		int e = 0;
		int m = 0;
		
		System.out.print("이름을 입력하세요 : ");
		s = sc.next();
		
		System.out.print("국어 : ");
		k = sc.nextInt();
		
		System.out.print("영어 : ");
		e = sc.nextInt();
		
		System.out.print("수학 : ");
		m = sc.nextInt();
		
		System.out.println("===[결과===");
		System.out.println("국어점수 : " + k);
		System.out.println("영어점수 : " + e);
		System.out.println("수학점수 : " + m);
		System.out.println("총점 : "+(k+e+m));
		
	}

}
