package thisEx03;

public class SignOperatorExamlpe {
	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);

		short s = 100, d = 50;
		//short c = s + d; ==> short를 int로 바꿔야함 
		// ~변수, -변수, 변수+변수 ==> int로 인식
		// short result3 = -s; // 부호연산자는 int 타입으로 변환된다/
		int result3 = -s;
		System.out.println("result3 = " + result3); // -100

	}
}
