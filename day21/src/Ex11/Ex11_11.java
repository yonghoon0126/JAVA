package Ex11;

class Car11_11 {
	String color;
	int speed;
	private static int count = 0;
	
	public Car11_11() {
		count++;
	}
	
	// static getter()
	public static int getCount() {
		return count;
	}
	
}



public class Ex11_11 {
	public static void main(String[] args) {

		Car11_11 myCar1 = new Car11_11();
		System.out.println("현재 생산된 자동차 숫자 ==> " + myCar1.getCount() );
//		System.out.println("현재 생산된 자동차 숫자 ==> " + Car11_11.getCount() );
		
		Car11_11 myCar2 = new Car11_11();
		System.out.println("현재 생산된 자동차 숫자 ==> " + myCar2.getCount() );
//		System.out.println("현재 생산된 자동차 숫자 ==> " + Car11_11.getCount() );
		
		Car11_11 myCar3 = new Car11_11();
		System.out.println("현재 생산된 자동차 숫자 ==> " + myCar3.getCount() );
//		System.out.println("현재 생산된 자동차 숫자 ==> " + Car11_11.getCount() );
		
	}

}
