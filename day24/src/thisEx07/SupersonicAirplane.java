package thisEx07;

public class SupersonicAirplane extends Airplane{
	
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	
	public int flymode = NORMAL;
	
	@Override
	public void fly() {
	if(flymode == SUPERSONIC) {
		System.out.println("������ �����մϴ�.");
	}else {
		// Airplane ��ü�� fly() �޼ҵ� ȣ��
		super.fly();
	}
	
	
		
	}

}
