package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//����8)
//������ ���� �Է� : 12
//12 ==> ���
//
//������ ���� �Է� : -12
//-12 ==> ����
//
//������ ���� �Է� : 0
//0 ==> ��

public class Test08 {

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a;
		String str;

		while (true) {

			System.out.println("������ ���� �Է� : ");
			a = Integer.parseInt(br.readLine());

			str = (a < 0) ? "����" : (a > 0) ? "���" : "��";

			System.out.println(a + " ==> " + str);

			if (a == 0) {
				System.out.println("��");
				break;
			}
		}

	}
}
