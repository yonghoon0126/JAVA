package jang18_ioEx;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BufferedIOEx {

	public static void main(String[] args) {

		InputStreamReader in =
				new InputStreamReader(System.in);	// 1바이트 -> 2바이트
		
//		BufferedOutputStream out = 
//				new BufferedOutputStream(System.out, 5);	// 1바이트 -> 1바이트

		BufferedWriter out = 
				new BufferedWriter(new OutputStreamWriter(System.out), 5);	
				// 2바이트 -> 2바이트 필터

		try {
			int c;

			while((c = in.read())!= -1) {
				out.write(c);	// 버퍼가 다 찰 때 문자가 화면에 출력
			}
			out.flush();	// 버퍼에 남아 있던 문자 출력
			
			if(in != null) {
				in.close();
				out.close();
			}

		}catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}

}
