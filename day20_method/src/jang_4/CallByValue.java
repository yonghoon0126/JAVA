package jang_4;

public class CallByValue {

	public static void main(String[] args) {
		Person3 aPerson3 = new Person3("ȫ�浿");
		int a = 33;
		
		// �ǸŰ����� ��, ���μ�, ������
		aPerson3.setAge(a);	// 33, call by value, �� ���� ����, �⺻Ÿ��
		
		System.out.println(a);

	}

};

class Person3 {
	public String name;	// ȫ�浿
	public int age;	// 33
	public Person3(String s) {	// ȫ�浿
		name = s;	// ȫ�浿
	}

	// ���ǸŰ�����, �����μ�, ��������
	public void setAge(int n) {	// 33
		age = n;
		n++;
	}
}
