package thisEx08;

public interface RemoteControl {

	// ���
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// �߻� �޼ҵ�
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	// ����Ʈ �޼ҵ�
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		}else {
			System.out.println("���� �����մϴ�.");
		}
	}
	
	// static �޼ҵ�
	static void changeBettery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
	
}
