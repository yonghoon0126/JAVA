package thisEx07;

public class DmbCellPhoneExample {

	public static void main(String[] args) {

		// DmbCellPhone ��ü ����
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 10);
		DmbCellPhone dmbCellPhone2 = new DmbCellPhone();

		// CellPhone���κ��� ��ӹ��� �ʵ�
		System.out.println("�� : " + dmbCellPhone.model);
		System.out.println("���� : " + dmbCellPhone.color);
		System.out.println();
		
		// DmbCellPhone�� �ʵ�
		System.out.println("ä�� : " + dmbCellPhone.channel);
		System.out.println();
		
		// CellPhone���κ��� ��ӹ��� �޼ҵ� ȣ��
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.receiveVoice("�ȳ��ϼ��� ! ���� ȫ�浿�ε���.");
		dmbCellPhone.sendVoice("�� ~ �� �ݰ����ϴ�.");
		dmbCellPhone.hangUp();
		System.out.println();

		// DmbCellPhone�� �޼ҵ� ȣ��
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}

}
