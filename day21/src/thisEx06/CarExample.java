package thisEx06;

public class CarExample {
	
	public static void main(String[] args) {
		
		// ��ü ����
		Car myCar = new Car();
		
		// �ʵ尪 �б�
		System.out.println("����ȸ�� : " + myCar.company);
		System.out.println("�𵨸� : " + myCar.model);
		System.out.println("���� : " + myCar.color);
		System.out.println("�ְ�ӵ� : " + myCar.maxspeed);
		System.out.println("����ӵ� : " + myCar.speed);
		System.out.println();
		
		// �ʵ尪 ����
		myCar.speed = 60;
		System.out.println("������ �ӵ� : " + myCar.speed);
	}
}
