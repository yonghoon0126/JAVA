package jang_5;
class Person {
	
	int age;
	public String name;
	protected int height;
	private int weight;
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getWeight() {
		return weight;
	}
}

public class Student extends Person {
	
	void set() {
		age = 30;
		name = "ȫ�浿";
		height = 175;
//		whight = 99;	// weight�� private�̱� ������
		setWeight(99);
	}
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.set();
	}
}
