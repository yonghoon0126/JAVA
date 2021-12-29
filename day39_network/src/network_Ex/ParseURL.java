package network_Ex;

import java.net.MalformedURLException;
import java.net.URL;

public class ParseURL {

	public static void main(String[] args) {

		URL opinion = null;
		URL homePage = null;
		
		try {
			homePage = new URL("http://news.hankooki.com:80");	// ���� ��η� URL ��ü ����
			opinion = new URL(homePage,"opinion/editorial.htm");	// ��� ��η� URL ��ü ����
			
		}catch(MalformedURLException e) {
			System.out.println("�߸��� URL �Դϴ�.");
		}
		
		System.out.println("protocol = " + opinion.getProtocol());// �������� �ⷰ
		System.out.println("host = " + opinion.getHost());// ȣ��Ʈ �̸� �ⷰ
		System.out.println("port = " + opinion.getPort());// ��Ʈ ��ȣ �ⷰ
		System.out.println("path = " + opinion.getPath());// ��� �κ� �ⷰ
		System.out.println("filename = " + opinion.getFile());// ���� �̸� �ⷰ
		
		
		
		
	}

}
