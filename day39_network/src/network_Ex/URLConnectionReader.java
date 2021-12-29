package network_Ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionReader {

	public static void main(String[] args) {

		try {
			// URL ��ü ����
			URL aURL = new URL("https://www.daum.net");
			
			// URL ��ü���� URLConnection ��ü ����
			URLConnection uc = aURL.openConnection();	// URL ��ü���� �Է� ��Ʈ�� ����, �ѱ� ó���ؾ� ������ �ʴ´�
			
			BufferedReader in = 
					new BufferedReader(new InputStreamReader(
							uc.getInputStream(),"utf-8")); // �Է� ��Ʈ�� ����
			
			String inputLine;
			
			while((inputLine = in.readLine()) != null)	// ���� �� ����
				System.out.println(inputLine);
				in.close();
				
		}catch(IOException e) {
			System.out.println("URL���� �����͸� �д� �� ������ �߻��߽��ϴ�.");
		}
		
		
		
		
		
	}

}
