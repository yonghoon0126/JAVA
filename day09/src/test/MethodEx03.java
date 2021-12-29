package test;
// 반환형 있고 매개변수 없을 때 메소드 선언
public class MethodEx03 {

	public static void main(String[] args) {
		// 변수 선언
		// 메소드 호출 disp()
		int tot = disp();	// 3 1~3자료 타입이 맞아야 함
		System.out.println("합 = " + tot);
		
	}
	// 메소드 정의
	public static int disp() {	// 2
		int num1 = 10;
		int num2 = 20;
		return num1 + num2;	// 1
		
	}
	
	
}
