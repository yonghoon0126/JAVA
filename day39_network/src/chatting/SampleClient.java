package chatting;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class SampleClient {

	public static void main(String[] args) {

		try {
			// 소켓 생성
			Socket s1 = new Socket("127.0.0.1", 5432);

			// 출력 스트림 객체 얻어오기
			OutputStream s1out = s1.getOutputStream();

			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s1out));

			// 서버에 출력해주기
			bw.write("서버에 출력하기....");
			bw.close();
			s1.close();

		} catch (Exception e) {
			e.getStackTrace();
		}

	}

}
