package thisEx11;

import java.io.IOException;

public class KeyboardToStringExample {

	public static void main(String[] args) throws IOException {

		byte bytes[] = new byte[100];
		// ���� ����Ʈ�� �����ϱ� ���� �迭 ����
		
		System.out.print("�Է� : ");
		int readByteNo = System.in.read(bytes);
		// �迭�� ���� ����Ʈ�� �����ϰ� ���� ����Ʈ���� ����
		
		String str = new String(bytes, 0, readByteNo-2);
		// -2�� �� ���� : ����(ĳ���� ���� + �����ǵ�)�� 2byte�� �ʿ��ϱ� ������
		
		System.out.println(str);
	}

}
