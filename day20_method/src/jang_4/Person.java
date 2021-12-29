package jang_4;

public class Person {

	// 필드 = 데이터 = 멤버변수 = 전역변수 = 클래스 변수(static이 있으면 클래스 변수)
	public static String name;	// 클래스 변수
	public int age;	// 클래스 인스턴스 변수

	// 생성자 : 리턴형이 없는 메소드이며, 기본이 public, 목적 : 객체 생성, 멤버변수 초기화
	// 디폴트 생성자 : person 객체명 = new person(); // 했을 떄 자동 호출됨
	// jvm이 자동으로 넣어줌
	public Person() {
		System.out.println("디폴트 생성자...");
	}

	// 매개변수가 있는 생성자 / person 객체명 = new person(값);
	public Person(String name) {
		this.name = name;	// 현재 객체 자신이 갖고 있는 필드에 name저장
		System.out.println("매개변수가 있는 생성자");
	}

	// getter()값을 인출하는 메소드
	// 메인에서 반환타입 변수 = 객체명.getName();
	public String getName() {
		return name;
	}

	// setter() : 값 저장
	// 메인에서 객체명.setName("김미남");
	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Person aperson;	// 객체 선언
		aperson = new Person("김미남");	// 객체 생성, 힙 영역에 생성
		aperson = new Person();	// 디폴트 생성자 호출
		
		aperson.age = 30;	// 필드값(직접접근) 초기화 = 설정 = 저장
		int i = aperson.age;	// 필드값(직접접근) 얻어오기 = 인출
		String s = aperson.getName();	// 필드값 메소드(간접접근)를 이용해 얻어오기 = 인출
		aperson.setName("홍길동");// 필드값 메소드(긴접접근)를 이용해 저장하기
		
		System.out.println("이름 : " + s);	// 김미남
		System.out.println("나이 : " + i);	// 30
		System.out.println("이름 : " + aperson.getName());	// 홍길동
		System.out.println("나이 : " + aperson.age);	// 30
		
	}

}
