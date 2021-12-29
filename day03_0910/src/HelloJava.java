//클래스=속성(데이터=필드=멤버변수=특징:명사), 기능(함수,메소드):동사
//c:\>javac		HelloJava  -->컴파일(Hellojava.class)
//c:\>java	HelloJava  -->실행 --> 컴파일 된 이진코드(바이트코드)를 인터프리터

// 접근지정자 class 클래스명{
//	필드;
//	메소드(){처리할 명령;	}
// }
public class HelloJava {
	// 필드가 생략됨
	// main 메소드() : 프로그램의 시작 지점(클래스 호출 시 main 자동호출됨)
	// 일반메소드() 생략됨
	// 메소드(인수 = parameter = 매개변수)
	// 접근지정자 지정자 반환형 메소드이름(매개변수타입 변수명)
	public static void main(String[] args) {
		System.out.println("오늘은 1번째 자바 수업시간입니다.");
//		disp(); //호출 = 실제사용
//		HelloJava hello = new HelloJava(); // 객체생성
//		hello.disp();

		// 일반메소드 정의(프로토타입 prototype:메소드원형)
//		public static void disp() {
//		System.out.print("나는 일반메소드야!!!");
		
//	}
//		public static void disp() {
			System.out.print("나는 일반메소드야!!!");
	}
}
