package Test;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class KeyInputEx {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String src;
		System.out.println("�ڹ� �ҽ� �����̸��� �Է��ϼ��� >> ");

		// ����Reader ���� / in = null
		FileReader in = null;
		src = s.nextLine(); // ���� �о����

		try {
			in = new FileReader(src);
			int c;

			// ()������ �Է��� ������ �о ȭ�鿡 ����ϱ�
			while ((c = in.read()) != -1) { 
				System.out.print((char) c);
			}
			// �ڿ� ��ȯ
			in.close();
			s.close();

		} catch (IOException e) {
			System.out.println("����� ����");

		}

	}

}
