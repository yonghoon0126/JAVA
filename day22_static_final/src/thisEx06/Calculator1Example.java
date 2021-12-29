package thisEx06;

public class Calculator1Example {

	public static void main(String[] args) {

		Calculator1 myCalc = new Calculator1();

		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1 : " + result1);
		disp(result1);

		byte x = 10;
		byte y = 4;

		double result2 = myCalc.divide(x, y);
		System.out.println("result2 : " + result2);
		disp(result2);
		
		myCalc.powerOff();

	}
	
	static void disp(int result) {
		System.out.println("result : " + result);
	}
		static void disp(double result) {
			System.out.println("result : " + result);
	}
}
