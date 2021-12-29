package jang_5;

class A2 {

	int x;

	public A2() {
		System.out.println("디폴트 생성자A");
	}

	public A2(int x) {
		this();
		this.x = x;
		System.out.println("매개변수 있는 생성자A");
	}
}

class B2 extends A2 {
	public B2() {
		super(2);
		System.out.println("디폴트 생성자B");
	}
}

class C2 extends B2 {
	public C2() {
		System.out.println("디폴트 생성자C");
	}

	public C2(int i) {
		this.x = i;
		System.out.println("매개변수 있는 생성자C");
	}
}


public class ConstructorEx {

	public static void main(String[] args) {
		C2 c;
		c = new C2();
		c = new C2(3);
	}
}
