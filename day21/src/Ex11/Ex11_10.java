package Ex11;

class Car11_10 {
	String color;
	int speed;
	static int count = 0;
	public Car11_10() {
		count++;
	}
}



public class Ex11_10 {
	public static void main(String[] args) {

		Car11_10 myCar1 = new Car11_10();
		System.out.println("현재 생산된 자동차 숫자 ==> " + myCar1.count);
		
		Car11_10 myCar2 = new Car11_10();
		System.out.println("현재 생산된 자동차 숫자 ==> " + myCar2.count);
		
		Car11_10 myCar3 = new Car11_10();
		System.out.println("현재 생산된 자동차 숫자 ==> " + myCar3.count);
		
	}

}
