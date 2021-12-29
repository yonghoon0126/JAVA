package thisEx06;

public class Singleton {

	private static Singleton singleton = new Singleton();	// new Singleton();

	private Singleton() {
		System.out.println("Singleton ������...");
	}

	static Singleton getInstance() {
		return singleton;
	}
}
