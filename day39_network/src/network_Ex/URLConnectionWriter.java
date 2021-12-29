package network_Ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionWriter {

	public static void main(String[] args) {

		try {

			// Post가 가능한 사이트 URL 객체 생성
			URL aURL = new URL("http://httpbin.org/post");
			URLConnection uc = aURL.openConnection(); // URLConnection 객체 생성
			uc.setDoOutput(true); // 출력 모드 설정

			OutputStreamWriter out = new OutputStreamWriter(uc.getOutputStream()); // 출력스트림 생성

			out.write("frame = Kitae&lname = Hwang"); // 서버에 데이터 보내기
			out.close();

			BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream())); // 입력 스트림 생성
			String inputLine;

			while ((inputLine = in.readLine()) != null) // 한행 씩 읽음
				System.out.println(inputLine);
			in.close();

		} catch (IOException e) {
			System.out.println("URL에 데이터를 입출력 중에 오류가 발생했습니다.");
		}

	}

}
