package thisEx07;

public class CarExample {

	public static void main(String[] args) {

		Car car = new Car();

//		for (int i = 1; i <= 10; i++) {
//			int problemLocation = car.run();
//
//			switch (problemLocation) {
//			
//			case 1:
//
//				System.out.println("�� ���� HankookTire�� ��ü");
//				car.frontLeftTire = new HankookTire("�� ����", 15);
//				break;
//
//			case 2:
//				System.out.println("�� ������ KumhoTire�� ��ü");
//				car.frontRightTire = new KumhoTire("�� ������", 13);
//				break;
//
//			case 3:
//				System.out.println("�� ���� HankookTire�� ��ü");
//				car.backLeftTire = new HankookTire("�� ������", 14);
//				break;
//
//			case 4:
//				System.out.println("�� ������ KumhoTire�� ��ü");
//				car.backRightTire = new KumhoTire("�� ������", 17);
//				break;
//			}
//			System.out.println("========================");
//	}
		
		for(int i = 1; i <= 10; i++) {
			int problemLocation = car.run();

			if(problemLocation != 0) {
				System.out.println(car.tires[problemLocation-1].location
						+ "HankookTire�� ��ü");
				car.tires[problemLocation-1] = 
						new HankookTire(car.tires[problemLocation-1].location, 15);
			}
			System.out.println("===================================");
		}

	}
}

