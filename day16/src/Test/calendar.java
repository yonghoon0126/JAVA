package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//����3)
//���� 1�� 1�� 1�� : ������
//- �⵵�� 4�� ����̰�, 100�� ����� �ƴϰų�
//400�� ����̸� 2���� 29��(����)
//������ 2���� 28��(���)
//
//- 2021�� 4�� �޷��� �׸��ٰ� �����ϸ�
//1.1.1 ~ 2021.3.31(��������)������ ��ü �� ���� ���Ѵ�
//�� �ϼ��� +1 ������ �����ϸ�(���� Ȯ��)
//4�� �޷��� �ȴ�
//- ���� = ��ü�ϼ� % 7
//���� = 0 -> �Ͽ���.....6 -> �����
//
//���)
//�⵵�� �Է��ϼ��� : 2021
//���� �Է��ϼ��� : 4

public class calendar {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 12�� �߿��� �� �޿� ���������� ���� �迭�� �ʱⰪ�� ������ �ּ���.
		int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; //������ �ϼ�
		int y, m, w, ilsu; // ��, ��, ����, �ϼ�

		do { // �⵵
			System.out.print("�⵵�� �Է��ϼ��� : ");
			y = Integer.parseInt(br.readLine());
		} while (y < 1);

		do { // ��
			System.out.print("���� �Է��ϼ��� : ");
			m = Integer.parseInt(br.readLine());

		} while (m < 1 || m > 12);// 0 ~ 11���̿� �� �Է� ����

		// 1�� 1�� 1�� ~ �Է¹��� �⵵ ���� �⵵�� 12�� 31�ϱ����� �ϼ� ���
		// �⵵ / 4 and �⵵ / 100 or �⵵ / 400
		ilsu = ((y - 1) * 365) + ((y - 1) / 4) - ((y - 1) / 100) + ((y - 1) / 400);

		System.out.println(ilsu);

		// �Է¹��� �⵵�� 2���� ������ �� ���
		if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
			days[1] = 29;
		// �ش� �⵵ 1������ �Է� ���� �� ������ ����
		// ������ ��¥������ �� �� ���� ���
		for (int i = 0; i < (m - 1); i++) {
			ilsu += days[i];
		}

		// �Է� ���� ���� 1��
		ilsu += 1;

		// -------------------------------------------------��� �ϼ� ��� ��
		// ���� ���
		// �Է� ���� ���� 1���� ���� �������� Ȯ���ϱ� ���� ����
		w = ilsu % 7; // 0 : �Ͽ���, 1 : ������, 2 : ȭ����......6 : �����

		// �޷� ����ϱ�
		System.out.println();
		System.out.println("\t[" + y + "��" + m + "��]\n");
		System.out.println();
		System.out.println(" ��   ��   ȭ   ��   ��   ��   ��");
		System.out.println("=================================");

		for (int i = 1; i <= w; i++) {
			System.out.print("    "); // ���� 4ĭ �߻�
		}
		for (int i = 1; i <= days[m - 1]; i++) {
			System.out.printf("%4d", i);
			w++; // ��¥�� �����ϴ� ��ŭ ������ �Բ� ����

			// �Ͽ��� ����� �� ���� �� �ٲ��ϰ�
			// ����� �� �ֵ��� ó��
			if (w % 7 == 0)
				System.out.println();
		}
		// ���� ������ ��¥�� ��������� ��� ä���� ���
		// �̹� �Ͽ��� ������ �̷������ ������
		// �̰��� ������ ���� �ʵ��� ó��
		if (w % 7 != 0)
			System.out.println();

		System.out.println("=================================");

	}

}
