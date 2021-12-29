package thisEx06;

public class SingletonExample {

	public static void main(String[] args) {

		// Singleton obj1 = new Singleton(); // ���� �Ұ�

		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		if (obj1 == obj2) {
			System.out.println("���� Singleton ��ü �Դϴ�.");
		} else {
			System.out.println("�ٸ� Singleton ��ü �Դϴ�.");
		}
		System.out.println("obj1.hashCode = " + obj1.hashCode() );
		System.out.println("obj2.hashCode = " + obj2.hashCode() );
	}

}
