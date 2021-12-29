package innerClass;

//	2. static Memberclass

public class StaticMember {
	
//==========================================================================	

	int a = 10; // ���ٺҰ�
	private int b = 10; // ��ü����� ���� ���� �Ұ�
	static int c = 200;

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

//===========================================================================	

	static class Inner {	// static inner class ����
		// ��� ������ �ʵ�� �޼ҵ� ���� ����.
		// �ܺ�Ŭ������ ����ν��Ͻ��� �����ϱ� ���� ��ü ����
		StaticMember s = new StaticMember();
		static int a = 20;
		int d = 100;

		public void printData() {
			
			// non static error
			// ��ü���� �Ŀ� ���� ����, �⺻���ٽ� �Ұ�(a)
			System.out.println("int a = " + s.a + "," + a);
			System.out.println("private int b = " + s.b); // �Ǵ� s.getB();
			System.out.println("static int c = " + c);
			System.out.println("int d = " + d);
			sMethode(); // �ܺ�Ŭ������ static �޼ҵ�
			s.Methode(); // ��ü���� �Ŀ� ���� ����
		} // printData()
	}; // Inner

//===========================================================================	

	static void sMethode() {
		System.out.println("static �޼ҵ�...");
	}

	public void Methode() {
		System.out.println("non-static �޼ҵ�...");
	}

//===========================================================================	

	public static void main(String[] arg) {
		
		StaticMember.Inner inner = new StaticMember.Inner();
		inner.printData();

		System.out.println("-------------------------");
		Inner in = new Inner();
		in.printData();
	}

}
