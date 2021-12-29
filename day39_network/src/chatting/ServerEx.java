package chatting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {

	public static void main(String[] args) {

		BufferedReader in = null;
		BufferedReader stin = null;
		BufferedWriter out = null;
		ServerSocket listener = null;
		Socket socket = null;

		try {
			
			listener = new ServerSocket(5432); // ���� ����
			socket = listener.accept(); // Ŭ���̾�Ʈ�κ��� ���� ��û ���
			System.out.println("�����");

			// Ŭ���̾�Ʈ�κ��� �Է� ��Ʈ�� �ޱ�
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			// Ű����κ����� �Է� ��Ʈ�� ��ü ����
			stin = new BufferedReader(new InputStreamReader(System.in));

			// Ŭ���̾�Ʈ�κ��� ��� ��Ʈ�� ���
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			String inputMessage;

			while (true) {
				// Ŭ���̾�Ʈ���� �� ���� ���ڿ� ����
				inputMessage = in.readLine();

				// Ŭ���̾�Ʈ�� "bye"�� ������ ���� ����
				if (inputMessage.equalsIgnoreCase("bye"))
					break;

				// Ŭ���̾�Ʈ�� ���� �޽��� ȭ�鿡 ���
				System.out.println(inputMessage);

				// Ű���忡�� �� ���� ���ڿ� ����
				String outputmessage = stin.readLine();

				// Ű���忡�� ���� ���ڿ� ����
				out.write("���� > " + outputmessage + "\n");
				out.flush();

			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		
		} finally {
		
			try {
				socket.close(); // Ŭ���̾�Ʈ�� ��ſ� ���� �ݱ�
				listener.close(); // ���� ���� �ݱ�

			} catch (IOException e) {
				System.out.println("Ŭ���̾�Ʈ�� ä�� �� ������ �߻��߽��ϴ�.");
			}
		}

	}

}
