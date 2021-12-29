package jang7;

import java.util.Iterator;

//	Collection 인터페이스 : 객체를 담기 위한 인터페이스
//
//	List : 정렬(o), 중복(o) : vector, set, linkedList... 
//	Set : 정렬(x), 중복(x) : 키에 값을 저장
//	Map : 키, 값의 쌍으로 저장, 검색이 가장 빠름
//
//	<?> 				: 모든 자료형이 제너릭 타입으로 들어 올 수 있다.
//	<? super 하위 클래스> 	: 하위 클래스가 상속 받고 있는 상위(부모)클래스 자료형으로 제한
//	<? extends 부모 클래스>	: 부모를 상속 받은 객체만을 자료형으로 받겠다.
//	
//	Vector : 스레드 동기화, 다수의 스레드가 동시에 Vector에 접근가능(thread safe)
//	list를 구현한 클래스로서 가변개수의 배열이 필요할 때 적합.
//	벡터에 삽입되는 요소의 수가 많아지면 자동으로 크기 조절됨. 요소가 마지막에 추가, 중간에 삽입
//	모두 가능. 삭제하면 요소들이 앞으로 하나씩 이동됨.


import java.util.Vector;

public class VecorEx {

	public static void main(String[] args) {

		// 정수 값만 다루는 제너릭 벡터 생성
		Vector<Integer> v = new Vector<Integer>();	// 기본 용량은 10
		v.add(5);	// 5 삽입
		v.add(4);	// 4 삽입
		v.add(-1);	// -1 삽입

		// 벡터 중간에 삽입하기	// 5 4 100 -1
		v.add(2, 100);	// 4와 -1사이에 정수 100 삽입
		System.out.println("벡터 내의 요소 객체 수 : " + v.size());	// 크기 4
		System.out.println("벡터의 현재 용량 : " + v.capacity());	// 벡터의 디폴트 용량 10
		// 기본 용량 = 10

		// 모든 요소 정수 출력하기
		for (int i = 0; i < v.size(); i++) {
			int n = v.get(i);	// == v.elementAt(i);
			System.out.println(n);	// 5 4 100 -1
		}

		// 벡터 속의 모든 정수 더하기
		int sum = 0;
		for (int i = 0; i < v.size(); i++) {
			int n = v.elementAt(i);	// == v.get(i);
			sum += n;
		}
		System.out.println("벡터에 있는 정수 합 : " + sum);	// 108
		System.out.println();
		System.out.println("====Iterator(반복자) 이용하기================");
		System.out.println();
		
//		Iterator를 통해 전체 출력
//		hasNext() : 다음 데이터요소가 있는지 여부를 반환
//		next() : 다음 데이터 요소 수를 직접적으로 반환
//		Vector, ArrayList, linkedList, Set과 같은 컬렉션에서 요소를 순차적으로
//		검색할 때 편리하게 사용하는 Interator<E>인터페이스이다.
		
		Iterator<Integer> it = v.iterator();	// 반복자
		int str;
		while(it.hasNext()) {
			str = it.next();
			System.out.println(str + " ");	// 5 4 100 -1
		}
		System.out.println("..." + it.next());	// 재사용 불가, exception 발생
		
	}

}

