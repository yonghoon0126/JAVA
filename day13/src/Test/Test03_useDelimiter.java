package Test;

import java.util.Scanner;

//����1] Ű����� �̸�,����,����,������ �Է� �޾� �Ʒ��� ���� ����Ͻÿ�
//���� : [, ����], Scanner, useDelimite()�� �̿��Ͻÿ�.

//���)
//�̸� ���� ���� ���� �Է� [, ����] : ȫ�浿,90,80,70
//
//�̸� : ȫ�浿
//���� : 240

public class Test03_useDelimiter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int kor, eng, mat, tot;
		String name = " ";

		System.out.print("�̸� ���� ���� ���� �Է� [, ]�� ���� : ");
//		sc = new Scanner(System.in).useDelimiter("\\s|,"); // <==,�� �����̽��ٸ� ����
		sc = new Scanner(sc.next()).useDelimiter("\\s*,");


		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		tot = (kor + eng + mat);

		System.out.println("�̸� : " + name);
		System.out.println("���� : " + tot);

		sc.close();

	}

}
