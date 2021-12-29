package thisEx11;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {

		// 자동 Boxing
		Integer obj = 100;

		// Wrapper로 하기
		Integer obj2 = new Integer(100);
		
		System.out.println("value : " + obj.intValue());	// 숫자 100
		System.out.println("value : " + obj);	// 글자 100
		

		
		
		// 대입 시 자동 UnBoxing
		int value = obj;
		
		// Wrapper로 하기
		int value2 = obj.intValue();
		
		System.out.println("value : " + value);	// 100


		
		
		// 연산 시 자동 UnBoxing
		
		int result = obj + 100;
		
		// Wrapper로 하기
		int result2 = value + 100;
		
		System.out.println("result : " + result);	// 200

	}

}
