package jang_2;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.BindException;

public class InputExample {

	public static void main(String[] args) throws IOException {	
		// �Է���ġ(��Ʈ��) �����ϱ� 				2����Ʈ (1����Ʈ)
		InputStreamReader rd = new InputStreamReader(System.in);

		try { // ���� �˻縦 �ؼ� ������ ������ �Ʒ������� ó����
				// catch���� ó������ �ʰ� ����
				// ������ ������ �Ʒ����� ó�� ���� �ʰ� catch ������ ó����
			while(true) {
				int a = rd.read();
				if (a == -1) // ctrl-z�� �ԷµǸ� read()�� -1�� ����
					break; // �ݺ����ڸ� Ż���ض�
				System.out.println((char) a); //
			}
		} catch(BindException e) { // ������ ���� �� ������
			System.out.println("�Է� ���� �߻�" + e.getStackTrace());
		} catch(IOException e) { // ������ ���� �� ������
			System.out.println("�Է� ���� �߻�" + e.getStackTrace());
		} catch(Exception e) { // ������ ���� �� ������
			System.out.println("�Է� ���� �߻�" + e.getStackTrace());
		}
	}
}
