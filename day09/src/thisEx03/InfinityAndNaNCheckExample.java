package thisEx03;

public class InfinityAndNaNCheckExample {
	public static void main(String[] args) {

		int x = 5;
		double y = 0.0;
		// 값/0 / 값%0 -- 컴파일에러 없고 실행 시 ArithmeticException 발생
		// 값/0.0 또는 0.0f : 예외 없고, Infinite 값을 가짐 / 값%0.0 : 예외 없고, NaN 값을 가짐
		// 정확한 값을 위해 isInfinite, isNaN로 비교해야 한다.
		double z = x / y;	// 5/0.0 무한대, isInfinite()
		double z1 = x % y;	// 5%0.0 NaN, isNaN()
		
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z1));

		System.out.println(z + 2); // 잘못된 코드

	}
}
