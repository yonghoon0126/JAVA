package jang18_ioEx;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryCopy {

	public static void main(String[] args) {

		File src = new File("c:\\windows\\explorer.exe");	// 복사할 파일
		File dst = new File("c:\\tmp\\exploere.bin");	// 복사될 파일

		FileInputStream fi = null;
		FileOutputStream fo = null;
		BufferedInputStream in = null;
		BufferedOutputStream out = null;

		int c;

		try {
			fi = new FileInputStream(src);		// 파일 입력 바이트 스트림에 연결
			fo = new FileOutputStream(dst);		// 파일 출력 바이트 스트림에 연결
			in = new BufferedInputStream(fi);	// 버퍼 입력 스트림에 연결
			out = new BufferedOutputStream(fo);	// 버퍼 출력 스트림에 연결

			while ((c = in.read()) != -1) {
				out.write((char) c);
			}
			in.close();
			out.close();
			fi.close();
			fo.close();
		
		} catch (IOException e) {
			System.out.println("파일 복사 오류");
		}

	}

}
