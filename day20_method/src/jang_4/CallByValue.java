package jang_4;

public class CallByValue {

	public static void main(String[] args) {
		Person3 aPerson3 = new Person3("홍길동");
		int a = 33;
		
		// 실매개변수 값, 실인수, 실인자
		aPerson3.setAge(a);	// 33, call by value, 값 변경 없음, 기본타입
		
		System.out.println(a);

	}

};

class Person3 {
	public String name;	// 홍길동
	public int age;	// 33
	public Person3(String s) {	// 홍길동
		name = s;	// 홍길동
	}

	// 형실매개변수, 형식인수, 형식인자
	public void setAge(int n) {	// 33
		age = n;
		n++;
	}
}
