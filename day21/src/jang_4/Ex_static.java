package jang_4;

class staticSample {
	public int n;

	public void g() {
		m = 20;
	}
	public void h() {
		m = 30;
	}
	public static int m;
	public static void f() {
		m = 5;
	}
}

public class Ex_static {

	public static void main(String[] args) {
		
		staticSample s1, s2;
		
		s1 = new staticSample();
		System.out.println("s1.n = " + s1.n);	// 0
		System.out.println("s1.m = " + s1.m);	// 0
		
		s1.n = 5;
		s1.g();
		s1.m = 50; // static
		System.out.println("\n\ns1.n = " + s1.n );	// 5
		System.out.println("s1.m = " + s1.m);	// 50			

		s2 = new staticSample();
		System.out.println("s2.n = " + s2.n);	// 0
		System.out.println("s2.m = " + s2.m);	// 50

		s2.n = 8;
		s2.h();
		s2.f(); // static
		System.out.println("\ns2.n = " + s2.n);	// 8
		System.out.println("s1.n = " + s1.n);	// 5
		
		System.out.println("s2.m = " + s2.m);	// 5
		System.out.println("s1.m = " + s1.m);	// 5

		System.out.println(s1.m);	// 5

	}

}
