package jang_5;

class Person3 {
}

class Student3 extends Person3 {
}

class Researcher3 extends Person3 {
}

class Professor3 extends Researcher3 {
}

public class InstanceofExample {
	public static void main(String[] args) {

		Person3 jee = new Student3();
		Person3 kim = new Professor3();
		Person3 lee = new Researcher3();

		if (jee instanceof Student3)
			System.out.println("jee�� Student3 Ÿ��");
		// jee�� Student Ÿ���̹Ƿ� true

		if (jee instanceof Researcher3)
			System.out.println("jee�� Researcher3 Ÿ��");
		// jee�� Researcher Ÿ���� �ƴϹǷ� false

		// ==============================================================

		if (kim instanceof Student3)
			System.out.println("kim�� Student3 Ÿ��");
		// kim�� Student Ÿ���� �ƴϹǷ� false

		if (kim instanceof Professor3)
			System.out.println("kim�� Professor3 Ÿ��");
		// kim�� Professor Ÿ���̹Ƿ� true

		// ==============================================================

		if (kim instanceof Researcher3)
			System.out.println("kim�� Researcher3 Ÿ��");
		// kim�� Researcher Ÿ���̱⵵ �ϹǷ� true

		if (kim instanceof Person3)
			System.out.println("kim�� Perso3n Ÿ��");
		// kim�� Person Ÿ���̱⵵ �ϹǷ� true

		// ==============================================================

		if (lee instanceof Professor3)
			System.out.println("jee�� Professor3 Ÿ��");
		// lee�� Professor Ÿ���� �ƴϹǷ� false

		if ("java" instanceof String)
			System.out.println("\"java\"�� String Ÿ��");
		// "java"�� String Ÿ���� �ν��Ͻ��̹Ƿ� true

		aa(kim);
	}
	
	// ==============================================================

	private static void aa(Person3 kim) {

		if (kim instanceof Student3) {
			System.out.println("kim�� Student3 Ÿ��");
			Student3 s = (Student3) kim; // �ٿ� ĳ����
		} else if (kim instanceof Professor3) {
			System.out.println("kim�� Professor3 Ÿ��");
			Professor3 s = (Professor3) kim; // �ٿ� ĳ����
		} else if (kim instanceof Researcher3) {
			System.out.println("kim�� Researcher3 Ÿ��");
			Researcher3 s = (Researcher3) kim; // �ٿ� ĳ����
		}
	}
}
