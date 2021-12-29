package chatting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SampleServer {

	public static void main(String[] args) {

		ServerSocket s = null;
		System.out.println("서버야");

		try {
			// 포트번호 지정해서 서버 소캣 생성
			s = new ServerSocket(5432);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		while (true) {
		
			try {
				// 클라이언트가 접속할때까지 기다림
				Socket s1 = s.accept();
				System.out.println(s1.getInetAddress()); // 클라이언트가 메세지를 보내면 읽어옴

				BufferedReader br = new BufferedReader(new InputStreamReader(s1.getInputStream()));

				// 읽어온거 줄단위로 출력
				System.out.println(br.readLine());
				br.close(); // 버퍼 자원 반환
				s1.close(); // 소켓 자원 반환

			} catch (Exception e) {
				e.printStackTrace();

			}
		}

	}

}
