package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//����ڷκ��� �������� �Է¹޾�
//���� �ѷ��� ���̸� ���ϴ� ���α׷��� �ۼ��Ѵ�.

//���� ��)
// ���� ������ : 10
// ���� : xxx.xxx
// �ѷ� : xxx.xxx
public class Test02 {
	public static void main(String[] args) 
			throws NumberFormatException, IOException {

		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		int r; // ����
		double a, b; // ����, �ѷ�
		final double PI = 3.141592; // ������

		System.out.print("���� ������ �Է� : ");
		r = Integer.parseInt(br.readLine());	//���� ������ �������� �о���ڴ�
		// parsh ==> �⺻������ �ٲ� �� ex) int -> parseint
		// ����
		a = r * r * PI;
		// �ѷ�
		b = r * 2 * PI;
		System.out.printf("���� : %.2\n", a);
		System.out.printf("�ѷ� : %.2\n", b);

	}

}
