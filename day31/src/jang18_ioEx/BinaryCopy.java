package jang18_ioEx;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryCopy {

	public static void main(String[] args) {

		File src = new File("c:\\windows\\explorer.exe");	// ������ ����
		File dst = new File("c:\\tmp\\exploere.bin");	// ����� ����

		FileInputStream fi = null;
		FileOutputStream fo = null;
		BufferedInputStream in = null;
		BufferedOutputStream out = null;

		int c;

		try {
			fi = new FileInputStream(src);		// ���� �Է� ����Ʈ ��Ʈ���� ����
			fo = new FileOutputStream(dst);		// ���� ��� ����Ʈ ��Ʈ���� ����
			in = new BufferedInputStream(fi);	// ���� �Է� ��Ʈ���� ����
			out = new BufferedOutputStream(fo);	// ���� ��� ��Ʈ���� ����

			while ((c = in.read()) != -1) {
				out.write((char) c);
			}
			in.close();
			out.close();
			fi.close();
			fo.close();
		
		} catch (IOException e) {
			System.out.println("���� ���� ����");
		}

	}

}
