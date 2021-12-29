package thisEx07;

public class PhoneExample {

	public static void main(String[] args) {

		//Phone phone = new Phone();	
		// 추상클래스는 부모클래스 객체 생성X
		// 상속을 받은 자식클래스가 재정의 한건 객체 생성O
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internenSearch();
		smartPhone.turnOff();
	}

}
