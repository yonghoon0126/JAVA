package jang7;

//	ArrayList는 가변크기의 배열을 구현 컬렉션 클래스로서 Vector와 거의 동일하다.
//	다른점 : ArrayList는 스레드간에 동기화를 지원하지 않기 때문에 다수의 스레드가 동시에
//	ArrayList에 요소를 삽입하거나 삭제할 때 충돌이 발생할 수 있다.
//	ArrayList를 사용하려면 멀티스레드의 동기화를 사용자가 구현해야 한다.
//	내부에 배열을 가지고 있으며, 이 배열을 가변적 크기로 관리한다.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class ArrayListEx {

	public static void main(String[] args) {

		// 문자열만 삽입 가능한 ArrayList 컬렉션 생성
		ArrayList<String> a = new ArrayList<String>();

		// 키보드로부터 4개의 이름 입력받아 ArrayList에 삽입
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요 >> ");
			String s = sc.next();
			a.add(s); // ArrayList컬렉션에 삽입
		}

		// ArrayList에 들어 있는 모든 이름 출력
//		for (int i = 0; i < a.size(); i++) {
//			// ArrayList의 i번째 문자열 얻어오기
//			String name = a.get(i);
//			System.out.print(name + " ");
//		}
		
		// Iterator 이용하기
		Iterator<String> it = a.iterator();	// 반복자
		String str;
		while(it.hasNext()) {
			str = it.next();
			System.out.print(str + " ");
		}

		// 가장 긴 이름 출력
		int longestIndex = 0;

		for (int i = 0; i < a.size(); i++) {

			if (a.get(longestIndex).length() < a.get(i).length()) 
				longestIndex = i;
		}	// for
		System.out.println("\n가장 긴 이름은 : " + a.get(longestIndex));

	}

}
