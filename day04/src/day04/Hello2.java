package day04;

public class Hello2 {
	//메소드 정의
//접근지정자 지정자 반환형 메소드명(인수타입 변수명)
	public static int sum(int n, int m) {//전달 받을 자료타입
		return n+m;
	}
	public static void main(String[] args) {
		System.out.println(args[0]+args[1]);
		int i=20;
		int s;
		char a;
		s=sum(i,10);//자료타입 맞는 값을 전달해야 함
		a='?';
		System.out.println((int)a);
		System.out.println("Hello2");
		System.out.println(s);

	}

}
