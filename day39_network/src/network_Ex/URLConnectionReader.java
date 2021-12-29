package network_Ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionReader {

	public static void main(String[] args) {

		try {
			// URL 객체 생성
			URL aURL = new URL("https://www.daum.net");
			
			// URL 객체에서 URLConnection 객체 생성
			URLConnection uc = aURL.openConnection();	// URL 객체에서 입력 스트림 생성, 한글 처리해야 깨지지 않는다
			
			BufferedReader in = 
					new BufferedReader(new InputStreamReader(
							uc.getInputStream(),"utf-8")); // 입력 스트림 생성
			
			String inputLine;
			
			while((inputLine = in.readLine()) != null)	// 한행 씩 읽음
				System.out.println(inputLine);
				in.close();
				
		}catch(IOException e) {
			System.out.println("URL에서 데이터를 읽는 중 오류가 발생했습니다.");
		}
		
		
		
		
		
	}

}
