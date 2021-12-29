package thisEx08;

public class RemoteControlExample {
	public static void main(String[] args){

	RemoteControl rc, rc1;	// 부모 클래스
	rc = new Television();
	rc1 = new Audio();
		
//========================================================
	
	// 익명 클래스(한번만 쓴다), Swing에서 많이 씀
//	RemoteControl rc = new RemoteControl() {
//		public void turnOn() {
//			// 실행문
//		}
//		public void turnOff() {
//			// 실행문
//		}
//		public void setVolume(int volume) {
//			// 실행문
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
	RemoteControl.changeBettery();	// 인터페이스명.메소드() - 가능
	rc1.setMute(true);
	
	}
}
