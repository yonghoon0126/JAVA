package Test;

import java.util.Scanner;

//����8) ���� ���ڿ��� ����ڷκ��� �Է� �޾� �Ʒ��� ���� ����Ͻÿ�
//���)
//���ڸ� �Է� : ����� ���
//
//�Է��� ���ڿ� : ����� ���
//�Ųٷ� ���ڿ� : ���� ������

public class test08_length {

	public static void main(String[] args) {

		String str;
		int n;

		Scanner s = new Scanner(System.in);
		System.out.print("���ڸ� �Է� : ");
		str = s.nextLine();

		System.out.printf("\n");
		System.out.printf("�Է��� ���ڿ� ==> %s\n", str);
		System.out.printf("��ȯ�� ���ڿ� ==> ");

		n = str.length();
		for (int i = n - 1; i >= 0; i--) {
			System.out.printf("%c", str.charAt(i));
		}

		// String str = "����� ���"; // ���ڿ��� ���� : ���ڿ�.length();
		// // char[] c = str; // c[0] = '��', c[1]='��', c[2]='��'
		// int n = str.length(); // 6
		// // 0 ~ 2
		// for(int i = 0; i < n; i++) {
		// System.out.print(str.charAt(i));
		// } // 3 ; 3 >
		// System.out.println();
		// for(int i = n; i >= 1; i--) {
		// System.out.print(str.charAt(i-1));
		// }

	}

}
