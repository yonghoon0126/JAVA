package thisEx07;

public class DriverExample {

	public static void main(String[] args) {

		Driver driver = new Driver();

		Bus bus = new Bus();
		// Vehicle v = bus; // �ڵ�����ȯ up casting
		// bus = (bus)v; // ��������ȯ down casting
		Taxi taxi = new Taxi();

		driver.drive(bus);
		driver.drive(taxi);

	}

}
