package thisEx06;

public class Car223Example {

	public static void main(String[] args) {
		
		Car223 myCar = new Car223();
		
		myCar.setGas(5);	// Car�� setGas() �޼ҵ� ȣ��
		
		boolean gasState = myCar.isLeftGas();	// Car�� isLeftGas() �޼ҵ� ȣ��
		
		if(gasState) {
			System.out.println("����մϴ�.");
			myCar.run();	// Car�� run() �޼ҵ� ȣ��
		}
		
		if(myCar.isLeftGas()) {	// Car�� isLeftGas() �޼ҵ� ȣ��
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
			myCar.run();
			
		}else {
			System.out.println("gas�� �����ϼ���.");
		}
	}
}
