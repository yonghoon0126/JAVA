package jang_4;

public class Person {

	// �ʵ� = ������ = ������� = �������� = Ŭ���� ����(static�� ������ Ŭ���� ����)
	public static String name;	// Ŭ���� ����
	public int age;	// Ŭ���� �ν��Ͻ� ����

	// ������ : �������� ���� �޼ҵ��̸�, �⺻�� public, ���� : ��ü ����, ������� �ʱ�ȭ
	// ����Ʈ ������ : person ��ü�� = new person(); // ���� �� �ڵ� ȣ���
	// jvm�� �ڵ����� �־���
	public Person() {
		System.out.println("����Ʈ ������...");
	}

	// �Ű������� �ִ� ������ / person ��ü�� = new person(��);
	public Person(String name) {
		this.name = name;	// ���� ��ü �ڽ��� ���� �ִ� �ʵ忡 name����
		System.out.println("�Ű������� �ִ� ������");
	}

	// getter()���� �����ϴ� �޼ҵ�
	// ���ο��� ��ȯŸ�� ���� = ��ü��.getName();
	public String getName() {
		return name;
	}

	// setter() : �� ����
	// ���ο��� ��ü��.setName("��̳�");
	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Person aperson;	// ��ü ����
		aperson = new Person("��̳�");	// ��ü ����, �� ������ ����
		aperson = new Person();	// ����Ʈ ������ ȣ��
		
		aperson.age = 30;	// �ʵ尪(��������) �ʱ�ȭ = ���� = ����
		int i = aperson.age;	// �ʵ尪(��������) ������ = ����
		String s = aperson.getName();	// �ʵ尪 �޼ҵ�(��������)�� �̿��� ������ = ����
		aperson.setName("ȫ�浿");// �ʵ尪 �޼ҵ�(��������)�� �̿��� �����ϱ�
		
		System.out.println("�̸� : " + s);	// ��̳�
		System.out.println("���� : " + i);	// 30
		System.out.println("�̸� : " + aperson.getName());	// ȫ�浿
		System.out.println("���� : " + aperson.age);	// 30
		
	}

}
