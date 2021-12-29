package jang18_ioEx;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextCopy {

	public static void main(String[] args) {

		File src = new File("c:\\windows\\system.ini"); // 소스 파일
		File dst = new File("c:\\tmp\\system.txt"); // 목적 파일
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader in = null;
		BufferedWriter out = null;

		int c;

		try {
			fr = new FileReader(src);
			fw = new FileWriter(dst);
			in = new BufferedReader(fr);
			out = new BufferedWriter(fw);

			while ((c = in.read()) != -1) {
				out.write((char) c);
			}
			in.close();
			fr.close();
			fw.close();

		} catch (IOException e) {
			System.out.println("파일 복사 오류");
		}

	}

}
