package jang_5;

public class SmartPhone extends PDA implements MobilePhone, Mp3 {

	// �޼ҵ� �߰�
	public void scheduler() {
		System.out.println("���� ����");
	}
	public void applicationManager() {
		System.out.println("�������α׷� ��ġ / ����");
	}
	
	public static void main(String[] args) {	// Ŭ����
		SmartPhone p = new SmartPhone();
		p.sendCall();
		p.play();
		
		System.out.println(p.calculate(3, 10));	// PDA
		
		p.scheduler();	// smartPhone
		p.applicationManager();	// smartPhone
		p.stop();	// smartPhone
	}
	
	
	// mp3 �������̽�==================================
	
	@Override
	public void play() {	
		System.out.println("���� ���");
	}
	@Override
	public void stop() {	
		System.out.println("��� ����");
	}
	
	
	// mobilePhone �������̽�==================================
	
	@Override
	public boolean sendCall() {	
		System.out.println("��ȭ �ɱ�");
		return true;
	}
	@Override
	public boolean receiveCall() {	
		System.out.println("��ȭ �ޱ�");
		return true;
	}
	@Override
	public boolean sendSMS() {	
		System.out.println("SMS ������");
		return true;
	}
	@Override
	public boolean receiveSMS() {	
		System.out.println("SMS �ޱ�");
		return true;
	}

}
