package Ex03;

public class Ex03_08 {

	public static void main(String[] args) {
		int a, b;// 4바이트
		float c, d;// 4바이트(부호,지수,가수부,소수점)

		a = 100;
		b = a;// a값을 대입

		c = 111.1f;// 11.d==11.1
		// 변수(f큰변수)=작은변수//자동 캐스팅=자동 형 변환 = 묵시적인 형 변환
		// 변수(i작은변수)=(작은 변수타입)f큰변수//강제 캐스팅
		d = c;// c값을 대입
		// a=(int)c;////강제 형 변환, 강제 캐스팅, 명시적인 형 변환
		System.out.printf("a,b의 값 ==> %d, %d \n", a, b);
		System.out.printf("c,d의 값 ==> %f, %-5.3f \n", c, d);

		//위에 int a,b로 선언된게 자동으로 double로 변환
		//float c,d로 선언된거에 맞게 f로 형 변환
	}
}
