package Ex11;

public class Ex11_01 {
	public static void main(String[] args) {

		Ex11_01Car myCar1 = new Ex11_01Car();
		myCar1.color = "����";
		myCar1.speed = 0;

		Ex11_01Car myCar2 = new Ex11_01Car();
		myCar2.color = "�Ķ�";
		myCar2.speed = 0;

		Ex11_01Car myCar3 = new Ex11_01Car();
		myCar3.color = "���";
		myCar3.speed = 0;

		
		myCar1.upSpeed(30);
		System.out.println("�ڵ��� 1�� ������ " + myCar1.color + "�̸�, ����ӵ���"
				+ myCar1.speed + "km �Դϴ�.");

		myCar2.upSpeed(60);
		System.out.println("�ڵ��� 2�� ������ " + myCar2.color + "�̸�, ����ӵ���"
				+ myCar1.speed + "km �Դϴ�.");

		myCar3.upSpeed(0);
		System.out.println("�ڵ��� 3�� ������ " + myCar3.color + "�̸�, ����ӵ���"
				+ myCar1.speed + "km �Դϴ�.");
	}
}
