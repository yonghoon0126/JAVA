package jang7;

//	컬렉션(Collection) 특징 정리
//	set				: 중복 불허, 무순	/ 인덱스 없음
//	List			: 중복 허용, 정렬	/ 인덱스 있음
//	Map(Key와 Value)	: 키 - 중복 불허  	/ 인덱스 없음, 무순
//					  값 - 중복 허용

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsEx {

	static void printList(LinkedList<String> l) {
		Iterator<String> iterator = l.iterator();

		while (iterator.hasNext())	{

			String e = iterator.next();
			String separator;
			if (iterator.hasNext())
				separator = "->";
			else
				separator = "\n";
			System.out.print(e + separator);
		}
	}

	public static void main(String[] args) {

		LinkedList<String> myList = new LinkedList<String>();
		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("매트릭스");
		myList.add(0, "터미네이터");
		myList.add(2, "아바타");

		System.out.println("정렬 전====================");
		printList(myList);
		// 터미네이터->트랜스포머->아바타->스타워즈->매트릭스

		System.out.println("\n정렬 후====================");
		Collections.sort(myList);
		printList(myList);
		// 매트릭스->스타워즈->아바타->터미네이터->트랜스포머
		
		System.out.println("\n이분검색====================");
		int index = Collections.binarySearch(myList, "아바타") + 1;
		System.out.println("아바타는 " + index + "번째 요소 입니다.");

		System.out.println("\n역순 출력====================");
		Collections.reverse(myList);	
		printList(myList);
		// 트랜스포머->터미네이터->아바타->스타워즈->매트릭스
	}

}



