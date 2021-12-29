package jang_4;

public class Person2 {

	public static String name;
	public int age;

	public static void main(String[] args) {

		Person2[] pa;
		pa = new Person2[10];
		for (int i = 0; i < pa.length; i++) {
			pa[i] = new Person2();
			pa[i].age = 30 + i;
		}

		for (int i = 0; i < pa.length; i++) {
			System.out.println("pa["+i+"].age = " + pa[i].age);
		}
		System.out.println(pa[0].name);
	}

}
