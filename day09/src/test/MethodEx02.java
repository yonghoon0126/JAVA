package test;
// 반환형이 없고 매개변수가 있을때 메소드 선언
public class MethodEx02 {
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;

		// 객체생성
		MethodEx02 m1 = new MethodEx02();
		// 메소드 호출
		m1.sum(num1, num2);	// 메소드 정의되어 있는대로 호출
		sum(num1, num2);	// 같은 클래스 내 이면 static메소드()이기 때문에 생략가능
		MethodEx02.sum(num1, num2);	// 타클래스에서는 클래스명.메소드명()

		// non-static 메소드 호출 할 때 sum1()
		MethodEx02 m2 = new MethodEx02();
		// 메소드 호출
		m2.sum1(num1, num2);	// 객체명.메소드명();

	}
	// 메소드 정의
	public static void sum(int num1, int num2) {	// int num1 = num1
		int tot = num1 + num2;
		System.out.println("합 = " + tot);
		return;	// 생략가능 } == return을 의미함
	}
	public void sum1(int num1, int num2) {
		int tot = num1 + num2 + 100;
		System.out.println("합 = " + tot);

	}
}
