package chatting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientEx {

	public static void main(String[] args) {

		BufferedReader in = null;
		BufferedReader stin = null;
		BufferedWriter out = null;
		Socket socket = null;

		try {

			// 클라이언트 소켓 생성
			socket = new Socket("localhost", 5432);

			// 서버로부터의 입력 스트림 얻어오기
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			// 키보드로부터의 입력 스트림 생성
			stin = new BufferedReader(new InputStreamReader(System.in));

			// 서버로의 출력 스트림 얻어오기
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			String outputMessage;

			while (true) {

				// 키보드에서의 한 행의 문자열 읽음
				outputMessage = stin.readLine();

				// "bye"가 입력되면 메시지 전송 후 연결 종료
				if (outputMessage.equalsIgnoreCase("bye")) {
					out.write(outputMessage);
					out.flush();
					break;
				}

				// 키보드에서 읽은 문자열 전송
				out.write("클라이언트 > " + outputMessage + "\n");
				out.flush();

				// 서버에서 한 행의 문자열 읽음
				String inputMessage = in.readLine();

				System.out.println(inputMessage);

			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
			
		} finally {
			
			try {
				socket.close(); // 클라이언트 소켓 닫기

			} catch (IOException e) {
				System.out.println("서버와 채팅 중 오류가 발생했습니다.");
			}

		}

	}

}
