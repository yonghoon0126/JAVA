//1. 패키지 package  패키지명;
//2. import 패키지명.사용할클래스명 ex)import java.util.Scanner;
// import java.lang; //디폴트 패키지/생략가능
// import java.*; <-- java 패키지 내에 있는 클래스 모두를 메모리에 올림
//3. 클래스
public class HelloJava2 {
	// 4.필드
	// 5.메소드
	// 실행가능한 클래스가 되려면 main()있어야함//시작단이다
	// main()이 있으면 클래스는 꼭 public 이어야 함
	public static void main(String[] a) {
		System.out.println("이름 : 김용훈");
		System.out.println("주소 : 서울");
		System.out.println("전화 : 010-2673-0609");
		// -----------변수사용시---------------------
		System.out.println("----------------");

		String name = "홍길동";
		String addr = "서울";
		String tel = "010-2673-0609";

		System.out.println("이름 : " + name);
		System.out.println("주소 : " + addr);
		System.out.println("전화 : " + tel);
	}

}
// //한줄주석 지정/해제: ^~c
// /* */ 여러줄 주석 : 블럭설정하고 ~^/, 해제 : 블럭설정하고 ~^/
// 간결하게 문장 맞출때 ^A 전체블럭설정후 ^~F 또는 ^I
// 한줄 삭제 ^D