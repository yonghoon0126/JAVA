package thisEx11;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {

	public static void main(String[] args) {

		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		String file = System.getProperty("file.separator");	//	\ /

		System.out.println("�ü�� �̸� : " + osName);
		System.out.println("����� �̸� : " + userName);
		System.out.println("����� Ȩ���丮 : " + userHome);
		System.out.println("���� �ܶ� ���� : " + file);

		System.out.println("==============================");
		System.out.println(" [ key ] value");
		System.out.println("==============================");

		Properties props = System.getProperties();
		Set keys = props.keySet();
		for (Object objkey : keys) {
			String key = (String) objkey;
			String value = System.getProperty(key);
			System.out.println("[ " + key + " ] " + value);
		}
	}
}
