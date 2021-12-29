package day04;

public class Test02 {
	// 멤버변수
	int a;// 동적멤버변수:객체생성후 사용
	static int b;// 정적멤버변수:객체생성유무와 관계없다.

	public static void main(String[] args) {
		// 지역변수 선언, 블럭을 벗어나면 자동 소멸된다.
		int su1;// 접근지정자 지정자 자료타입 변수명=초기화/ 선언만
		// System.out.println(su1);//사용전에 반드시 초기화 해야 함.
		su1 = 20; // 메모리 확보, 값 초기화=값 할당

		int su2 = 20;// 자료타입선언, 메모리 확보, 초기값 설정
		// non-static 변수 사용할때
		Test02 t1 = new Test02();// 객체생성
		System.out.println(t1.a);// 사용

		// static 변수 사용할때
		System.out.println(t1.b);// 사용
		System.out.println(b);// 사용
		System.out.println(Test02.b);// 사용
		//	 지역변수를 사용해 보기
		// 변수 = 상수;
		// 변수: 임시기억장소, 새로운 값이 입력되면 원래값을 지우고 새로운값으로 대체=그릇
			// 상수: 항상 변하지 않는 수를 말함(변수타입에 따라서 정수, 실수,논리,객체, 배열)
			// 상수에는 일반 상수, 고정 상수 / 고정 상수 사용할 땐 앞에다가 final
		
	}

}
