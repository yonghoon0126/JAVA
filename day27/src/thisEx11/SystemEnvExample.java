package thisEx11;

public class SystemEnvExample {

	public static void main(String[] args) {

		String javaHome = System.getenv("JAVA_HOME");
		String path = System.getenv("path");
		String DriverData = System.getenv("DriverData");
		
		System.out.println("JAVA_HOME : " + javaHome);
		System.out.println("path : " + path);
		System.out.println("DriverData : " + DriverData);
	
	}

}
