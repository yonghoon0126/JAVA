package jang18_ioEx;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReadHangulSuccess {

	public static void main(String[] args) {

		InputStreamReader in = null;
		FileInputStream fin = null;

		try {
			fin = new FileInputStream("src/jang8_ioEx/hangul.txt");
			in = new InputStreamReader(fin, "MS949");
			int c;

			System.out.println("���ڵ� ���� ������ " + in.getEncoding());
			
			while((c=in.read()) != -1) {
				System.out.print((char)c);
			}
			in.close();
			fin.close();
		
		} catch(IOException e) {
			System.out.println("����� ����");
		}
	}

}
