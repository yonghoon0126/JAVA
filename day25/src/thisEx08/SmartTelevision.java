package thisEx08;

public class SmartTelevision implements RemoteControl, Searchable{

	private int volume;
	
	public void turnOn() {
		System.out.println("smartTV�� �մϴ�.");
	}

	public void turnOff() {
		System.out.println("smatrTV�� ���ϴ�.");
	}
	
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� TV ���� : " + this.volume);
	}
	
	public void search(String url) {
		System.out.println(url + "�� �˻��մϴ�.");
	}
}
