package jang_4;

public class Samp {

	int id;

	public Samp(int x) {

		this.id = x;
//**************************************************************
//		this 			: ���� ��ü �ڽ�
//		this() 			: ����Ʈ �����ڸ� ȣ��, ������ ���� ù �ٿ� ��ġ�ؾ� ��
//		this(����,����)	: ���ڰ��� �ִ� �����ڸ� ȣ��, �����ڳ��� ù�ٿ� ��ġ�ؾ� ��
//		this.�ʵ�			: ���� ��ü�� �ʵ� ȣ��
//		this.�޼ҵ�()		: ���� ��ü�� �޼ҵ� ȣ��
//**************************************************************
	}
	
	// this�����ڴ� ù �ٿ�
	public Samp() {
		this(30);
		System.out.println("����Ʈ ������");
	}
	
	// set
	public void set(int x) {
		this.id = x; // this.�ʵ� = ��
	}

	// get
	public int get() {
		return this.id;
	}

	public static void main(String[] args) {

		// ��ü ����
		Samp ob = new Samp();
		
		Samp ob1 = new Samp(3);
		Samp ob2 = new Samp(3);
		Samp ob3 = new Samp(3);
		
		// set�� �Է�
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
