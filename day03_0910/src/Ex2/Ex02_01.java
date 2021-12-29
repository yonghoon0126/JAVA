package Ex2;

public class Ex02_01 {
//필드=date=속성=전역변수=멤버변수 : 타입에 맞는 각각에 디폴트값이 있다 
//클래스 시작~끝날 때 까지 필드값이 존재함
	
	//메소드
	public static void main(String[] args) {
		//메소드내에 선언된 변수들은 모두 지역변수
		//꼭 사용전에 초기화(초기값) 해줘야 함
		//메소드(){변수선언; }내에서만 변수값이 존재함
		//메소드(){변수선언; }외에서는 변수를 몰라
		//메모리에 스택영역에 잡힘
		int a, b;
		int result;
		
		a = 100;
		b = 50;
		
		result = a + b;
		System.out.println(a + "+" + b + "=" + result);
		
		result = a - b;
		System.out.println(a + "-" + b + "=" + result);
		
		result = a * b;
		System.out.println(a + "*" + b + "=" + result);
		
		result = a / b;
		System.out.println(a + "/" + b + "=" + result);
	}
}
