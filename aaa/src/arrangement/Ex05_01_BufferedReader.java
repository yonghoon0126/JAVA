package arrangement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05_01_BufferedReader {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// Ű���� ����(Scanner) int, String
		// Ű����� �Է¹ޱ�

		int a = 0;
		// ��ĳ�� �̿��ϱ�
		// Scanner sc = new Scanner(System.in);

		// ���� �̿��ϱ�
		BufferedReader br = new BufferedReader
				(new InputStreamReader(System.in));

		System.out.println("�� �Է� : ");

		// a = sc.nextInt();
		// a = Integer.parseInt(sc.nextInt());
		a = Integer.parseInt(br.readLine());	// String --> Integer --> �⺻��
		//		 a = br.readLine(); // ==> String�� ��
		if (a < 100) 
			System.out.println("100���� �۱��� ..\n");
		else 
			System.out.println("100���� ũ���� ..\n");
		// �����϶��� ó��
	}
}