package Ex11;

public class Ex11_03_private {
	public static void main(String[] args) {

		Ex11_03Car_private myCar1 = new Ex11_03Car_private();
		myCar1.setColor ("����");
		myCar1.setSpeed (0);

		Ex11_03Car_private myCar2 = new Ex11_03Car_private();
		myCar2.setColor ("�Ķ�");
		myCar2.setSpeed  (0);

		Ex11_03Car_private myCar3 = new Ex11_03Car_private();
		myCar3.setColor ("���");
		myCar3.setSpeed (0);

		
		myCar1.upSpeed(30);
		System.out.println("�ڵ��� 1�� ������ " + myCar1.getColor() + "�̸�, ����ӵ���"
				+ myCar1.getSpeed() + "km �Դϴ�.");

		myCar2.upSpeed(60);
		System.out.println("�ڵ��� 2�� ������ " + myCar2.getColor() + "�̸�, ����ӵ���"
				+ myCar1.getSpeed() + "km �Դϴ�.");

		myCar3.upSpeed(0);
		System.out.println("�ڵ��� 3�� ������ " + myCar3.getColor() + "�̸�, ����ӵ���"
				+ myCar1.getSpeed() + "km �Դϴ�.");
	}
}
