package thisEx08;

public class RemoteControlExample {
	public static void main(String[] args){

	RemoteControl rc, rc1;	// �θ� Ŭ����
	rc = new Television();
	rc1 = new Audio();
		
//========================================================
	
	// �͸� Ŭ����(�ѹ��� ����), Swing���� ���� ��
//	RemoteControl rc = new RemoteControl() {
//		public void turnOn() {
//			// ���๮
//		}
//		public void turnOff() {
//			// ���๮
//		}
//		public void setVolume(int volume) {
//			// ���๮
//		};
		
//========================================================
	
//		RemoteControl rc = null;
//	
//	rc = new Television();
//	rc.turnOn();
//	rc.setMute(true);
//	rc.turnOff();
//	
//	rc = new Audio();
//	rc.turnOn();
//	rc.setMute(true);
//	rc.turnOff();
//	
//	RemoteControl.changeBettery();
	
//========================================================

	System.out.println("TV======");
	rc.turnOn();
	rc.setVolume(rc.MAX_VOLUME);
	rc.setMute(false);
	RemoteControl.changeBettery();
	rc.setMute(true);

	System.out.println("\nAudio======");
	rc1.turnOn();
	rc1.setVolume(30);
	rc1.setMute(false);	
	RemoteControl.changeBettery();	// �������̽���.�޼ҵ�() - ����
	rc1.setMute(true);
	
	}
}
