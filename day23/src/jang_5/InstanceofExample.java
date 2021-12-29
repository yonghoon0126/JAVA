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
			System.out.println("jee는 Student3 타입");
		// jee는 Student 타입이므로 true

		if (jee instanceof Researcher3)
			System.out.println("jee는 Researcher3 타입");
		// jee는 Researcher 타입이 아니므로 false

		// ==============================================================

		if (kim instanceof Student3)
			System.out.println("kim는 Student3 타입");
		// kim은 Student 타입이 아니므로 false

		if (kim instanceof Professor3)
			System.out.println("kim는 Professor3 타입");
		// kim은 Professor 타입이므로 true

		// ==============================================================

		if (kim instanceof Researcher3)
			System.out.println("kim는 Researcher3 타입");
		// kim은 Researcher 타입이기도 하므로 true

		if (kim instanceof Person3)
			System.out.println("kim는 Perso3n 타입");
		// kim은 Person 타입이기도 하므로 true

		// ==============================================================

		if (lee instanceof Professor3)
			System.out.println("jee는 Professor3 타입");
		// lee는 Professor 타입이 아니므로 false

		if ("java" instanceof String)
			System.out.println("\"java\"는 String 타입");
		// "java"는 String 타입의 인스턴스이므로 true

		aa(kim);
	}
	
	// ==============================================================

	private static void aa(Person3 kim) {

		if (kim instanceof Student3) {
			System.out.println("kim는 Student3 타입");
			Student3 s = (Student3) kim; // 다운 캐스팅
		} else if (kim instanceof Professor3) {
			System.out.println("kim는 Professor3 타입");
			Professor3 s = (Professor3) kim; // 다운 캐스팅
		} else if (kim instanceof Researcher3) {
			System.out.println("kim는 Researcher3 타입");
			Researcher3 s = (Researcher3) kim; // 다운 캐스팅
		}
	}
}
