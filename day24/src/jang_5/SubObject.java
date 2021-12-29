package jang_5;

class SuperObject {
	
	protected String name;

	public void paint() {
		draw();
	}

	public void draw() {
		System.out.println(name);
	}
}

public class SubObject extends SuperObject {

	protected String name;

	@Override
	public void draw() {	// �������̵�

		name = "Sub";	// this.name = "Sub";	--> this�����ص� JVM�� ����
		super.name = "Super";	// �θ�ü.�ʵ� ȣ��
		super.draw();	// �θ�ü.�޼ҵ�() ȣ��
		System.out.println(name);
	}

	public static void main(String[] args) {
		
		SuperObject b = new SubObject();	// �θ� = �ڽ� �϶� 
		// �������̵� �� �θ� �޼ҵ� �����ϰ�, �ڽ� �޼ҵ� ���
		b.paint();

	}

}
