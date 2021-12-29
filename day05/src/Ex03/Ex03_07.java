package Ex03;

public class Ex03_07 {

	public static void main(String[] args) {
		int a;
		float b;

		a = (int) 123.45f;//강제 캐스팅 =강제 형 변환=명시적인 형 변환, 값 보존x
		b = 200;//자동 캐스팅 = 묵시적인 형 변환 = 자동 형 변환, 값 보존ㅇ

		System.out.printf("a의 값 ==> %d \n", a);
		System.out.printf("b의 값 ==> %f \n", b);
	}
}
