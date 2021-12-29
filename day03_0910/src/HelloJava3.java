//도스에서 실행하면
//javac HelloJava3.java
//java HelloJava3 "홍길동" "100" //키보드로 입력받는 것은 String형임
public class HelloJava3 {
	// 출력문, 수식에서 '+'연산자를(연결연산자) 알아보자
	// "문자열" + "문자열" = "문자열"
	// "문자열" + 숫자 = "문자열"
	// 숫자 + "문자열" = "문자열"
	// 숫자 + 숫자 	= 	숫자
	// String str=20+"20" --> 2020
	// int	  num=20+20 ---> 40
	public static void main(String[] args) {
		System.out.println("이름 : " + args[0]);
		System.out.println("나이 : " + args[1]);
		System.out.print(20+20);
	}
}
