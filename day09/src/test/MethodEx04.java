package test;
// 반환형이 있고 매개변수가 있을 때 메소드 선언
public class MethodEx04 {

	public static void main(String[] args) {
		int num1 = 10, num2 = 20;
		
		// 메소드 호출 sum()
		int result = sum(num1 , num2);
		System.out.println("합 = " + result);
		
		
	}
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	
}
