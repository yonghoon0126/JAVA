package chatting;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class SampleClient {

	public static void main(String[] args) {

		try {
			// ���� ����
			Socket s1 = new Socket("127.0.0.1", 5432);

			// ��� ��Ʈ�� ��ü ������
			OutputStream s1out = s1.getOutputStream();

			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s1out));

			// ������ ������ֱ�
			bw.write("������ ����ϱ�....");
			bw.close();
			s1.close();

		} catch (Exception e) {
			e.getStackTrace();
		}

	}

}
