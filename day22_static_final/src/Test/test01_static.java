package Test;

public class test01_static {

	int n;
	int m;
	static int s;

	public test01_static() {
		n = 1000;
		m = 3000;
		System.out.println("����Ʈ ������...");
	}

	// �ν��Ͻ� �ʱ�ȭ ��
	{
		s = 200;	// ���(����/���� : �޼ҵ�, �ʵ�)���
		n = 500;
		m = 300;
		System.out.println("�ν��Ͻ� �ʱ�ȭ...");
		write();	// ���� (�ν��Ͻ�)�޼ҵ�
//		write2();	// ����(static)�޼ҵ�
		this.n = 3;	// this(o)
	}
	
	// ���� �ʱ�ȭ ��
	static{
		s = 200;
//		n = 500;	// error ���� �ʵ常 �;���
//		m = 300;	// error ���� �ʵ常 �;���
		System.out.println("���� �ʱ�ȭ...");
//		write();	// ����(�ν��Ͻ�) �޼ҵ�(x)
//		write2();	// ����(static) �޼ҵ�(o)
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

//		���� �ʱ�ȭ...
//		�ν��Ͻ� �ʱ�ȭ...
//		����Ʈ ������...
//		ob1.m = 3000
//		ob1.n = 1000
//		n : 1000, m : 3000, s : 200
//		�ν��Ͻ� �ʱ�ȭ...
//		����Ʈ ������...
//		ob2.m = 3000
//		ob2.n = 1000
//		n : 1000, m : 3000, s : 200
