package jang_5;

class Person2{
	String name;
	String id;

	public Person2(String name) {
		this.name = name;
	}
}

class Student2 extends Person2{

	String grade;
	String department;

	public Student2(String name) {
		super(name);
	}

}

public class UpCastingEx {

	public static void main(String[] args) {

		Person2 p;	// 부모
		Student2 s = new Student2("이재문");	// 자식
		p = s;	// 업캐스팅 발생(자동 캐스팅)	// 부모타입 = 자식타입
		
		System.out.println(p.name);	// 오류 없음
	
// 		부모타입을 하면 자식의 멤버들을 사용할 수 없음
//		다형성을 지원 하기 위해 업캐스팅
//		p.grade = "A";	// 컴파일 오류
//		p.department = "com";	// 컴파일 오류
		s = (Student2)p;	// downcasting 강제 캐스팅 // 자식타입 = (자식타입)부모타입
		
		s.grade = "1학년";
		s.department = "컴퓨터학과";
		System.out.println("학년 : " + s.grade);
		System.out.println("과 : " + s.department);
		
	}

}
