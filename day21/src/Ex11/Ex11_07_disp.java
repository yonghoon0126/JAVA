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
		
		Car11_07 myCar1 = new Car11_07("����", 0);
		Car11_07 myCar2 = new Car11_07("�Ķ�", 0);

		myCar1.setColor("����");
		myCar1.setSpeed(50);
		
		Ex11_07_disp ex = new Ex11_07_disp();
		
		// ȣ�� myCar1, myCar2
		ex.disp(myCar1);
		ex.disp(myCar2);
		System.out.println("===================================");

		Car11_07 myCar5 = new Car11_07();	// ����Ʈ ������
		Car11_07 myCar6 = new Car11_07("����");	// ����Ʈ ������
		Car11_07 myCar7 = new Car11_07("��Ȳ", 60);	// ����Ʈ ������

		// ȣ�� myCar5, myCar6, myCar7
		ex.disp(myCar5);
		ex.disp(myCar6);
		ex.disp(myCar7);
	}
	
	public void disp(Car11_07 myCar) {
		
//		System.out.println("�ڵ���" + myCar1 + "�� ������ " + myCar.getColor() + "�̸�, ����ӵ���"
//				+ myCar.getSpeed() + "km �Դϴ�");
		System.out.println("�ڵ���1�� ������ " + myCar.getColor() + "�̸�, ����ӵ���"
				+ myCar.getSpeed() + "km �Դϴ�");
	}
}