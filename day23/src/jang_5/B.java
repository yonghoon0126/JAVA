package jang_5;
class A{
	
	public int p;
	private int n;
	
	public void setN(int n) {
		this.n=n;
	}
	public int getN() {
		return n;
	}
	@Override
	public String toString() {
		
		return "n="+n;
	}
}


public class B extends A {
	
	private int m;//같은 클래스내에서는 접근 제한이 없다
	
	public void setM(int m) {
		this.m=m;
	}
	public int getM() {
		return m;
	}
	@Override
	public String toString() {
		String s=getN()+" "+getM();
		return s;
	}
	
	
//	public static void main(String[] args) {
//		A a=new A();
//		B b=new B();
//		b.m=5;
//		b.setN(10);
//		System.out.println(b.getN());
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(b.toString());
//
//	}
}
