package jang_5;

class A2 {

	int x;

	public A2() {
		System.out.println("����Ʈ ������A");
	}

	public A2(int x) {
		this();
		this.x = x;
		System.out.println("�Ű����� �ִ� ������A");
	}
}

class B2 extends A2 {
	public B2() {
		super(2);
		System.out.println("����Ʈ ������B");
	}
}

class C2 extends B2 {
	public C2() {
		System.out.println("����Ʈ ������C");
	}

	public C2(int i) {
		this.x = i;
		System.out.println("�Ű����� �ִ� ������C");
	}
}


public class ConstructorEx {

	public static void main(String[] args) {
		C2 c;
		c = new C2();
		c = new C2(3);
	}
}
