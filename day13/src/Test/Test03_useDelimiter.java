package Test;

import java.util.Scanner;

//문제1] 키보드로 이름,국어,영어,수학을 입력 받아 아래와 같이 출력하시오
//조건 : [, 구분], Scanner, useDelimite()를 이용하시오.

//출력)
//이름 국어 영어 수학 입력 [, 구분] : 홍길동,90,80,70
//
//이름 : 홍길동
//총점 : 240

public class Test03_useDelimiter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int kor, eng, mat, tot;
		String name = " ";

		System.out.print("이름 국어 영어 수학 입력 [, ]로 구분 : ");
//		sc = new Scanner(System.in).useDelimiter("\\s|,"); // <==,나 스페이스바를 구분
		sc = new Scanner(sc.next()).useDelimiter("\\s*,");


		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		tot = (kor + eng + mat);

		System.out.println("이름 : " + name);
		System.out.println("총점 : " + tot);

		sc.close();

	}

}
