package Test;

import java.util.Scanner;

//문제1] 키보드로 아래와 같이 '이름/국어/영어/수학'을 입력 받아 아래와 같이 출력하시오
//(Scanner사용)
//출력)
//이름 국어 영어 수학 입력 [공백구분] : 홍길동 90 80 70
//
//이름 : 홍길동
//총점 : 240

public class Test01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int kor, eng, mat, tot;
		String name =" ";
		
		System.out.println("이름 국어 영어 수학 입력 : " + "\t");
		name = sc.next();
		kor = sc.nextInt();	
		eng = sc.nextInt();
		mat = sc.nextInt();
		tot = kor + eng + mat;
		System.out.println(" ");
		System.out.println("이름 : " + name);
		System.out.println("총점 : "+ tot);
		
	}

}
