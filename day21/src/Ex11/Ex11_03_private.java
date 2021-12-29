package Ex11;

public class Ex11_03_private {
	public static void main(String[] args) {

		Ex11_03Car_private myCar1 = new Ex11_03Car_private();
		myCar1.setColor ("빨강");
		myCar1.setSpeed (0);

		Ex11_03Car_private myCar2 = new Ex11_03Car_private();
		myCar2.setColor ("파랑");
		myCar2.setSpeed  (0);

		Ex11_03Car_private myCar3 = new Ex11_03Car_private();
		myCar3.setColor ("노랑");
		myCar3.setSpeed (0);

		
		myCar1.upSpeed(30);
		System.out.println("자동차 1의 색상은 " + myCar1.getColor() + "이며, 현재속도는"
				+ myCar1.getSpeed() + "km 입니다.");

		myCar2.upSpeed(60);
		System.out.println("자동차 2의 색상은 " + myCar2.getColor() + "이며, 현재속도는"
				+ myCar1.getSpeed() + "km 입니다.");

		myCar3.upSpeed(0);
		System.out.println("자동차 3의 색상은 " + myCar3.getColor() + "이며, 현재속도는"
				+ myCar1.getSpeed() + "km 입니다.");
	}
}
