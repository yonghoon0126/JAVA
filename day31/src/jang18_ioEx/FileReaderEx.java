package jang18_ioEx;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) {

		FileReader in = null;

		try {
			in = new FileReader("src/jang8_ioEX/data.txt");
			
			int c;
			while((c=in.read()) != -1) {
				System.out.print((char)c);
			}
			in.close();

		} catch(IOException e) {

			System.out.println("입출력 오류");
		}
	}

}
