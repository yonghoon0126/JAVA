package Ex11;

class Car11_07{
	
	static int n = 0;
	
	private String color;
	private int speed;
	public Car11_07(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}

//========================================================================

	public String getColor() {
		return color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

//========================================================================
	
	public Car11_07() {
		
	}
	public Car11_07(String color) {
		this.color = color;
	}
}

public class Ex11_07_disp {

	public static void main(String[] args) {
		
		Car11_07 myCar1 = new Car11_07("빨강", 0);
		Car11_07 myCar2 = new Car11_07("파랑", 0);

		myCar1.setColor("빨강");
		myCar1.setSpeed(50);
		
		Ex11_07_disp ex = new Ex11_07_disp();
		
		// 호출 myCar1, myCar2
		ex.disp(myCar1);
		ex.disp(myCar2);
		System.out.println("===================================");

		Car11_07 myCar5 = new Car11_07();	// 디폴트 생성자
		Car11_07 myCar6 = new Car11_07("검정");	// 디폴트 생성자
		Car11_07 myCar7 = new Car11_07("주황", 60);	// 디폴트 생성자

		// 호출 myCar5, myCar6, myCar7
		ex.disp(myCar5);
		ex.disp(myCar6);
		ex.disp(myCar7);
	}
	
	public void disp(Car11_07 myCar) {
		
//		System.out.println("자동차" + myCar1 + "의 색상은 " + myCar.getColor() + "이며, 현재속도는"
//				+ myCar.getSpeed() + "km 입니다");
		System.out.println("자동차1의 색상은 " + myCar.getColor() + "이며, 현재속도는"
				+ myCar.getSpeed() + "km 입니다");
	}
}