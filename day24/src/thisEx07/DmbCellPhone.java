package thisEx07;

public class DmbCellPhone extends CellPhone{
	
	// �ʵ�
	int channel;
	public DmbCellPhone() {
		System.out.println("DmbCellPhone �⺻ ������");
	}
	
	// ������
	DmbCellPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
		System.out.println("DmbCellPhone 3���� ���ڰ� �ִ� ������");
	}
	
	// �޼ҵ�
	
	void turnOnDmb() {
		System.out.println("ä�� " + channel + "�� Dmb ��� ������ �����մϴ�.");
	}
	void changeChannelDmb(int channel) {
		System.out.println("ä�� " + channel + "������ �ٲߴϴ�.");
	}
	void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}
}
