package jang_4;

public class Samp {

	int id;

	public Samp(int x) {

		this.id = x;
//**************************************************************
//		this 			: 현재 객체 자신
//		this() 			: 디폴트 생성자를 호출, 생성자 내에 첫 줄에 위치해야 함
//		this(인자,인자)	: 인자값이 있는 생성자를 호출, 생성자내에 첫줄에 위치해야 함
//		this.필드			: 현재 객체의 필드 호출
//		this.메소드()		: 현재 객체의 메소드 호출
//**************************************************************
	}
	
	// this생성자는 첫 줄에
	public Samp() {
		this(30);
		System.out.println("디폴트 생성자");
	}
	
	// set
	public void set(int x) {
		this.id = x; // this.필드 = 값
	}

	// get
	public int get() {
		return this.id;
	}

	public static void main(String[] args) {

		// 객체 생성
		Samp ob = new Samp();
		
		Samp ob1 = new Samp(3);
		Samp ob2 = new Samp(3);
		Samp ob3 = new Samp(3);
		
		// set값 입력
		ob1.set(5);
		ob2.set(6);
		ob3.set(7);

		System.out.println("ob1 = " + ob1.id);
		System.out.println("ob2 = " + ob2.id);
		System.out.println("ob3 = " + ob3.id);

		System.out.println("ob1 = " + ob1.get());
		System.out.println("ob2 = " + ob2.get());
		System.out.println("ob3 = " + ob3.get());

	}

}
