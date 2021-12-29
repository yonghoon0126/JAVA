package thisEx06;

public class SingletonExample {

	public static void main(String[] args) {

		// Singleton obj1 = new Singleton(); // 생성 불가

		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		if (obj1 == obj2) {
			System.out.println("같은 Singleton 객체 입니다.");
		} else {
			System.out.println("다른 Singleton 객체 입니다.");
		}
		System.out.println("obj1.hashCode = " + obj1.hashCode() );
		System.out.println("obj2.hashCode = " + obj2.hashCode() );
	}

}
