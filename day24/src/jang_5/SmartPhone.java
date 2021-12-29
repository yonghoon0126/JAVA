package jang_5;

public class SmartPhone extends PDA implements MobilePhone, Mp3 {

	// 메소드 추가
	public void scheduler() {
		System.out.println("일정 관리");
	}
	public void applicationManager() {
		System.out.println("응용프로그램 설치 / 삭제");
	}
	
	public static void main(String[] args) {	// 클래스
		SmartPhone p = new SmartPhone();
		p.sendCall();
		p.play();
		
		System.out.println(p.calculate(3, 10));	// PDA
		
		p.scheduler();	// smartPhone
		p.applicationManager();	// smartPhone
		p.stop();	// smartPhone
	}
	
	
	// mp3 인터페이스==================================
	
	@Override
	public void play() {	
		System.out.println("음악 재생");
	}
	@Override
	public void stop() {	
		System.out.println("재생 중지");
	}
	
	
	// mobilePhone 인터페이스==================================
	
	@Override
	public boolean sendCall() {	
		System.out.println("전화 걸기");
		return true;
	}
	@Override
	public boolean receiveCall() {	
		System.out.println("전화 받기");
		return true;
	}
	@Override
	public boolean sendSMS() {	
		System.out.println("SMS 보내기");
		return true;
	}
	@Override
	public boolean receiveSMS() {	
		System.out.println("SMS 받기");
		return true;
	}

}
