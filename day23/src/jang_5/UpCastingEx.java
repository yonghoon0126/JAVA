package jang_5;

class Person2{
	String name;
	String id;

	public Person2(String name) {
		this.name = name;
	}
}

class Student2 extends Person2{

	String grade;
	String department;

	public Student2(String name) {
		super(name);
	}

}

public class UpCastingEx {

	public static void main(String[] args) {

		Person2 p;	// �θ�
		Student2 s = new Student2("���繮");	// �ڽ�
		p = s;	// ��ĳ���� �߻�(�ڵ� ĳ����)	// �θ�Ÿ�� = �ڽ�Ÿ��
		
		System.out.println(p.name);	// ���� ����
	
// 		�θ�Ÿ���� �ϸ� �ڽ��� ������� ����� �� ����
//		�������� ���� �ϱ� ���� ��ĳ����
//		p.grade = "A";	// ������ ����
//		p.department = "com";	// ������ ����
		s = (Student2)p;	// downcasting ���� ĳ���� // �ڽ�Ÿ�� = (�ڽ�Ÿ��)�θ�Ÿ��
		
		s.grade = "1�г�";
		s.department = "��ǻ���а�";
		System.out.println("�г� : " + s.grade);
		System.out.println("�� : " + s.department);
		
	}

}
