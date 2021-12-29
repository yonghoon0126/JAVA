package thisEx03;

public class CheckOverflowExample {
	public static void main(String[]args) throws ArithmeticException{
		// object -> Throwable -> Error, Exception
		try {	// 예외검사
			int result = safeAdd(2_000_000_000, 2_000_000_000);
			System.out.println(result);
		} catch(ArithmeticException e) {	// 예외검사 시 에러가 있으면 처리
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음");
			throw new ArithmeticException("오버플로우 발생");

		}finally{
			System.out.println("무조건 실행함");
		}
	}

	// 메소드 호출 --> safeAdd(값)
	// 메소드 정의 == 메소드 원형
	// 접근지정자 지정자 반환형 메소드명(자료타입 변수명...){처리할 구문; return
	public static int safeAdd(int left, int right) {
		if ((right > 0)) {
			if (left > (Integer.MAX_VALUE - right)) {
				// ArithmeticException으로 던짐
				throw new ArithmeticException("오버플로우 발생");
			}
		} else {
			if (left < (Integer.MIN_VALUE - right)) {
				throw new ArithmeticException("오버플로우 발생");
			}
		}
		return left + right;
	}
}
