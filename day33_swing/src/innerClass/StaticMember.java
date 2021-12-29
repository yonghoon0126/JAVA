package innerClass;

//	2. static Memberclass

public class StaticMember {
	
//==========================================================================	

	int a = 10; // 접근불가
	private int b = 10; // 객체만들기 전에 접근 불가
	static int c = 200;

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

//===========================================================================	

	static class Inner {	// static inner class 선언
		// 모든 종류의 필드와 메소드 선언 가능.
		// 외부클래스의 멤버인스턴스를 접근하기 위해 객체 생성
		StaticMember s = new StaticMember();
		static int a = 20;
		int d = 100;

		public void printData() {
			
			// non static error
			// 객체생성 후에 접근 가능, 기본접근시 불가(a)
			System.out.println("int a = " + s.a + "," + a);
			System.out.println("private int b = " + s.b); // 또는 s.getB();
			System.out.println("static int c = " + c);
			System.out.println("int d = " + d);
			sMethode(); // 외부클래스에 static 메소드
			s.Methode(); // 객체생성 후에 접근 가능
		} // printData()
	}; // Inner

//===========================================================================	

	static void sMethode() {
		System.out.println("static 메소드...");
	}

	public void Methode() {
		System.out.println("non-static 메소드...");
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
