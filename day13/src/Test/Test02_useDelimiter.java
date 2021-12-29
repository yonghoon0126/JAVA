package Test;

import java.util.Scanner;

//문제2) 키보드로 입력 받은 주민번호에서 문자열을 '-'으로 분리하여
//주민번호 앞자리만 출력하시오
//
//형식)
//-을 포함한 주민번호를 입력하시오
//주민번호 앞 자리는 210929 입니다.
//주민번호 뒷 자리는 1234567 입니다.

public class Test02_useDelimiter {

	public static void main(String[] args) {
		// 공백 문자 또는 '-'로 구분
		Scanner sc = new Scanner(System.in).useDelimiter("\\s|-");
		System.out.println("-을 포함한 주민번호를 입력하시오.");
		System.out.println("주민번호 앞 자리는 " + sc.next() + "입니다.");
		System.out.println("주민번호 뒷 자리는 " + sc.next() + "입니다.");
		
		sc.close();
		
		
	}

}
