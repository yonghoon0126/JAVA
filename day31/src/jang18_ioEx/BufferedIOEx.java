package jang18_ioEx;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BufferedIOEx {

	public static void main(String[] args) {

		InputStreamReader in =
				new InputStreamReader(System.in);	// 1����Ʈ -> 2����Ʈ
		
//		BufferedOutputStream out = 
//				new BufferedOutputStream(System.out, 5);	// 1����Ʈ -> 1����Ʈ

		BufferedWriter out = 
				new BufferedWriter(new OutputStreamWriter(System.out), 5);	
				// 2����Ʈ -> 2����Ʈ ����

		try {
			int c;

			while((c = in.read())!= -1) {
				out.write(c);	// ���۰� �� �� �� ���ڰ� ȭ�鿡 ���
			}
			out.flush();	// ���ۿ� ���� �ִ� ���� ���
			
			if(in != null) {
				in.close();
				out.close();
			}

		}catch(IOException e) {
			System.out.println("����� ����");
		}
	}

}
