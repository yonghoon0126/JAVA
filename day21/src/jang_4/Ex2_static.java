package jang_4;

class staticSample2 {
	public int n;

	// non-static �޼ҵ� �������� static/non-static ����ʵ� ��� ���� �� �� �ִ�. 
	public void g() {
		m = 20;	n = 6;
	}

	public void h() {
		m = 30;
	}

	public static int m;
	// static �޼ҵ� �������� static ����ʵ常 �����ؾ���. non-static��� �ʵ� ���� �Ұ�
	public static void f() {
		m = 5;
	}

}

public class Ex2_static {

	public static void main(String[] args) {
		
		staticSample2.m = 10;
		staticSample2 s1;
		s1 = new staticSample2();
		System.out.println("ȣ���� : " + s1.m);	// 10
		
		s1.f();
		staticSample2.f();
		System.out.println("ȣ���� : " + s1.m);	// 5
	}
	
}
