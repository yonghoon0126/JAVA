package jang_5;

public class MemberAccessExample {

	public static void main(String[] args) {
		
		A a=new A();
		B b=new B();

	//	b.m=5;
		b.setM(5);
		b.setN(10);
		
		System.out.println(b.getN());
		System.out.println(a);
		System.out.println(b);
		System.out.println(b.toString());
		
		a.p=5;//public
		//a.n=5;//private
		a.setN(5);
		
		b.p=5;//부모public 
		//b.n=5;//부모private
		b.setN(10);
		int i=b.getN();
		
		//b.m=20;//private
		b.setM(20);
		
		System.out.println(b.toString());
		

	}

}
