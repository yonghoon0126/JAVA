package Test;

public class test01_static {

	int n;
	int m;
	static int s;

	public test01_static() {
		n = 1000;
		m = 3000;
		System.out.println("디폴트 생성자...");
	}

	// 인스턴스 초기화 블럭
	{
		s = 200;	// 모두(정적/동적 : 메소드, 필드)허용
		n = 500;
		m = 300;
		System.out.println("인스턴스 초기화...");
		write();	// 동적 (인스턴스)메소드
//		write2();	// 정적(static)메소드
		this.n = 3;	// this(o)
	}
	
	// 정적 초기화 블럭
	static{
		s = 200;
//		n = 500;	// error 정적 필드만 와야함
//		m = 300;	// error 정적 필드만 와야함
		System.out.println("정적 초기화...");
//		write();	// 동적(인스턴스) 메소드(x)
//		write2();	// 정적(static) 메소드(o)
		//this.s = 3; this(x)
	}

	public test01_static(int n, int m){
		this.n = n;	
		this.m = m;	
	}
	
	void write() {
		System.out.println("n : " + n + ", m : " + m + ", s : " + s);
	}

	public static void main(String[] args) {
		
		test01_static ob1 = new test01_static();
		System.out.println("ob1.m = " + ob1.m);
		System.out.println("ob1.n = " + ob1.n);
		ob1.write();

		test01_static ob2 = new test01_static();
		System.out.println("ob2.m = " + ob1.m);
		System.out.println("ob2.n = " + ob1.n);
		ob2.write();
	}
}

//		정적 초기화...
//		인스턴스 초기화...
//		디폴트 생성자...
//		ob1.m = 3000
//		ob1.n = 1000
//		n : 1000, m : 3000, s : 200
//		인스턴스 초기화...
//		디폴트 생성자...
//		ob2.m = 3000
//		ob2.n = 1000
//		n : 1000, m : 3000, s : 200
