package thisEx06;

public class Calculator238Example {

	public static void main(String[] args) {

		Calculator238 myCalc = new Calculator238();
		
		double result1 = 10 * 10 * Calculator238.pi;
		int result2 = Calculator238.plus(10, 5);
		int result3 = Calculator238.minus(10, 5);

		// 위와 아래는 같음
		
//		double result1 = 10 * 10 * myCalc.pi;
//		int result2 = myCalc.plus(10, 5);
//		int result3 = myCalc.minus(10, 5);
		
		System.out.println("result1 : " + result1);	//314.1592
		System.out.println("result2 : " + result2);	// 15
		System.out.println("result3 : " + result3);	// 5
		
		
		disp(result1);
		disp(result2);
		disp(result3);
	}

	static void disp(double result){	// result1 값이 정수가 아니여서
		System.out.println("result : " + result);
	}
	static void disp(int result){
		System.out.println("result : " + result);
	}
}
