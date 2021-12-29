package thisEx11;

public class ClassExample {

	public static void main(String[] args) {

		GetPropertyExample car = new GetPropertyExample();
		
		Class clazz1 = car.getClass();
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName());
		System.out.println();

		try {
		
			Class clazz2 = Class.forName("thisEx11.GetPropertyExample");
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName());
			System.out.println();
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
