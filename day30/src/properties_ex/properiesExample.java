package properties_ex;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;

public class properiesExample {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Properties properies = new Properties();
		String path = properiesExample.class.
				getResource("database.properies").getPath();
		
		path = URLDecoder.decode(path, "utf-8");	// 한글을 읽게 해줌
		properies.load(new FileReader(path));	// 파일을 읽어옴
		
		String driver = properies.getProperty("driver");
		String url = properies.getProperty("url");
		String username = properies.getProperty("username");
		String password = properies.getProperty("password");
		String contry = properies.getProperty("country");
		String language = properies.getProperty("language");
		
		System.out.println("driver : " + driver);
		System.out.println("url : " + url);
		System.out.println("username : " + username);
		System.out.println("password : " + password);
		System.out.println("country : " + contry);
		System.out.println("language : " + language);
		
	}

}
