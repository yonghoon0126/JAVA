package thisEx07;

public class DriverExample {

	public static void main(String[] args) {

		Driver driver = new Driver();

		Bus bus = new Bus();
		// Vehicle v = bus; // 자동형변환 up casting
		// bus = (bus)v; // 강제형변환 down casting
		Taxi taxi = new Taxi();

		driver.drive(bus);
		driver.drive(taxi);

	}

}
