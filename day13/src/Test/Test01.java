package Test;

import java.util.Scanner;

//����1] Ű����� �Ʒ��� ���� '�̸�/����/����/����'�� �Է� �޾� �Ʒ��� ���� ����Ͻÿ�
//(Scanner���)
//���)
//�̸� ���� ���� ���� �Է� [���鱸��] : ȫ�浿 90 80 70
//
//�̸� : ȫ�浿
//���� : 240

public class Test01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int kor, eng, mat, tot;
		String name =" ";
		
		System.out.println("�̸� ���� ���� ���� �Է� : " + "\t");
		name = sc.next();
		kor = sc.nextInt();	
		eng = sc.nextInt();
		mat = sc.nextInt();
		tot = kor + eng + mat;
		System.out.println(" ");
		System.out.println("�̸� : " + name);
		System.out.println("���� : "+ tot);
		
	}

}
