package jang_5;

class Person {
	String phone;	// 011-123-1234

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone() {
		return phone;
	}
}

class Professor extends Person {
	public String getPhone() {
		return "Professor : " + super.getPhone();
	}
}

public class Overring {

	public static void main(String[] args) {

		Professor a = new Professor();
		a.setPhone("011-123-1234");
		System.out.println(a.getPhone());
		
		Person p = a;
		System.out.println(p.getPhone());
	}

}
