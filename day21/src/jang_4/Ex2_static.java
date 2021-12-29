package jang_4;

class staticSample2 {
	public int n;

	// non-static 메소드 내에서는 static/non-static 멤버필드 모두 접근 할 수 있다. 
	public void g() {
		m = 20;	n = 6;
	}

	public void h() {
		m = 30;
	}

	public static int m;
	// static 메소드 내에서는 static 멤버필드만 접근해야함. non-static멤버 필드 접근 불가
	public static void f() {
		m = 5;
	}

}

public class Ex2_static {

	public static void main(String[] args) {
		
		staticSample2.m = 10;
		staticSample2 s1;
		s1 = new staticSample2();
		System.out.println("호출전 : " + s1.m);	// 10
		
		s1.f();
		staticSample2.f();
		System.out.println("호출후 : " + s1.m);	// 5
	}
	
}
