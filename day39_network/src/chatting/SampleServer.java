package chatting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SampleServer {

	public static void main(String[] args) {

		ServerSocket s = null;
		System.out.println("������");

		try {
			// ��Ʈ��ȣ �����ؼ� ���� ��Ĺ ����
			s = new ServerSocket(5432);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		while (true) {
		
			try {
				// Ŭ���̾�Ʈ�� �����Ҷ����� ��ٸ�
				Socket s1 = s.accept();
				System.out.println(s1.getInetAddress()); // Ŭ���̾�Ʈ�� �޼����� ������ �о��

				BufferedReader br = new BufferedReader(new InputStreamReader(s1.getInputStream()));

				// �о�°� �ٴ����� ���
				System.out.println(br.readLine());
				br.close(); // ���� �ڿ� ��ȯ
				s1.close(); // ���� �ڿ� ��ȯ

			} catch (Exception e) {
				e.printStackTrace();

			}
		}

	}

}
