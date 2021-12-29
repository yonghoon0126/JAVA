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

			// Post�� ������ ����Ʈ URL ��ü ����
			URL aURL = new URL("http://httpbin.org/post");
			URLConnection uc = aURL.openConnection(); // URLConnection ��ü ����
			uc.setDoOutput(true); // ��� ��� ����

			OutputStreamWriter out = new OutputStreamWriter(uc.getOutputStream()); // ��½�Ʈ�� ����

			out.write("frame = Kitae&lname = Hwang"); // ������ ������ ������
			out.close();

			BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream())); // �Է� ��Ʈ�� ����
			String inputLine;

			while ((inputLine = in.readLine()) != null) // ���� �� ����
				System.out.println(inputLine);
			in.close();

		} catch (IOException e) {
			System.out.println("URL�� �����͸� ����� �߿� ������ �߻��߽��ϴ�.");
		}

	}

}
