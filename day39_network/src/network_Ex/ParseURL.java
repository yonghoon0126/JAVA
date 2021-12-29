package network_Ex;

import java.net.MalformedURLException;
import java.net.URL;

public class ParseURL {

	public static void main(String[] args) {

		URL opinion = null;
		URL homePage = null;
		
		try {
			homePage = new URL("http://news.hankooki.com:80");	// 절대 경로로 URL 객체 생성
			opinion = new URL(homePage,"opinion/editorial.htm");	// 상대 경로로 URL 객체 생성
			
		}catch(MalformedURLException e) {
			System.out.println("잘못된 URL 입니다.");
		}
		
		System.out.println("protocol = " + opinion.getProtocol());// 프로토콜 출럭
		System.out.println("host = " + opinion.getHost());// 호스트 이름 출럭
		System.out.println("port = " + opinion.getPort());// 포트 번호 출럭
		System.out.println("path = " + opinion.getPath());// 경로 부분 출럭
		System.out.println("filename = " + opinion.getFile());// 파일 이름 출럭
		
		
		
		
	}

}
