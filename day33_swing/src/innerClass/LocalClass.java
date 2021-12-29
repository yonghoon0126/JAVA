package innerClass;

//	3. Local class

public class LocalClass {

	int a = 100;

//==========================================================================	

	public void innerTest(int k) {	// 메소드 정의

		// fianl 생략가능(JDK1.8부터 가능해짐, 이전 버전은 꼭 final를 써야 함)
		int b = 200; // == final int b = 200;
		final int c = k;

		
		class localInner {	// 내부 로컬 클래스 선언

			// 상수, 전역변수
			// 내부 클래스를 포함한 메소드내에 정의된 지역변수 접근
			public void getData() {
				System.out.println("int a = " + a);
				System.out.println("int b = " + b); // 1.8부터 가능
				System.out.println("final int c = " + c);

				// 지역변수 사용할 수 없음
				System.out.println("method() = " + method()); // 1.8부터

			} // getData()
		}
		; // localInner

		localInner i = new localInner(); // 로컬의 메소드 접근 위해 생성
		i.getData();
	} // innerTest 메소드 종료

//==========================================================================	
	
	public int method() {

		int m = 2;
		return m;
	}

//==========================================================================	

	public static void main(String[] args) {

		LocalClass outer = new LocalClass(); // 외부클래스 객체 생성
		outer.innerTest(1000); // 외부클래스 method 호출

	}

}
