package test;
// 반환형이 없고 매개변수가 없는 메소드 선언
public class MethodEx01 {
	static	int num1 = 10;
	static	int num2 = 20;

	public static void main(String[] args) {
		// 객체생성
		MethodEx01 m1 = new MethodEx01();
		// 메소드 호출
		m1.sum();
		sum();	// 같은 클래스 내 이면 static메소드()이기 때문에 생략가능
		MethodEx01.sum();	// 타클래스에서는 클래스명.메소드명()

		// non-static 메소드 호출 할 때 sum1()
		MethodEx01 m2 = new MethodEx01();
		// 메소드 호출
		m2.sum1();	// 객체명.메소드명();

	}
	// 메소드 정의
	public static void sum() {
		int tot = num1 + num2;
		System.out.println("합 = " + tot);
		return;	// 생략가능 } == return을 의미함
	}
	public void sum1() {
		int tot = num1 + num2;
		System.out.println("합 = " + tot);

	}
}

