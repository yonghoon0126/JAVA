package Test;

import java.io.IOException;
import java.util.Scanner;

//����11)
//����ڷκ��� ������ ���ĺ� �� ���ڸ� �Է¹޾�,
//�̸� �Ǻ��Ͽ� �Է¹��� ���ĺ��� ������ ��츸
//����� ����� �� �ִ� ���α׷��� �ۼ��Ѵ�
//
//��, ��ҹ��� ���  ������ �� �ֵ��� �����Ѵ�
//����, ���ĺ� �̿��� ���ڰ� �Է� �Ǿ��� ���
//�Է¿��� ó���� �� �ֵ��� �Ѵ�.
//(System.in.read(), if��)
//���)
//���ĺ� �� ���� �Է� : A
//���� OK~!
//
//���ĺ� �ѹ��� �Է� : e
//���� OK~!
//
//���ĺ� �ѹ��� �Է� : B
//�����Դϴ�.
//
//���ĺ� �ѹ��� �Է� : 1
//�Է� ����

public class Test11 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		char ch;

		while(true) {

			System.out.println("���ĺ� �� ���� �Է� : ");

			ch = (char)System.in.read();
			// �̴�� ����ϸ� ���ĺ� �� ���� �Է� : �� 3�� ��µ�
			// ���͸� �Է����� ���� �� 4����Ʈ
			// System.in.read�� �Է¹��� ���� 1����Ʈ
			// �׷��� ���� 3����Ʈ�� ä�������

			// System.in.skip(2);
			// �̰ų�
			// System.out.println();
			// System.out.println();

			if((ch >= 'A' & ch <= 'Z') || (ch >= 'a' & ch <= 'z') ) {
				if(ch == 'A'|| ch == 'E'|| ch == 'E'|| ch == 'O'|| ch == 'U'||
						ch == 'a'|| ch == 'e'|| ch == 'o'|| ch == 'u') {
					System.out.println("���� OK~!");
				}else {
					System.out.println("�����Դϴ�.");
				}

			}else if((ch >= '1' & ch <= '9') || (ch == '0')) {
				System.out.println("�Է� ����.");

			}
		}

	}
}