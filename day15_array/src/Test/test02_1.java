package Test;

import java.util.Scanner;

//����2) �츮�� �л��̸��� Ű����� �Է� �޾� �迭�� ������ �� ȭ�鿡 ����Ͻÿ�
//���)
//�л��� ��ҿ�
//�л��� �迵��
//�л��� �����
//�л��� ������
//�л��� ������

//1�� ������
//2�� ������
//3�� ���Ź�
//4�� ������
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//����3)
//1. Ű����� �迭�� ũ�⸦ �Է¹޴´�.
//2. �Է¹��� ũ�⸸ŭ ����.
//3. Ű����� �� ��ҿ� ���� �Է¹޴´�.
//���)
//[1ȸ]
//�迭ũ�� : 2
//0���� ��� : ��ҿ�
//1��° ��� : �迵��
//
//�迭�� �� ����ϱ�
//--------------
//��ҿ�, �迵��
//>>>>>>>>>>>>>>>>>>>>>>>>>>>
//����4) while������
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//����5) 
//������ġ �迭 = 5, 1, 1	(length)
//���� �迭 31, 28			(day)
//�� > 10

public class test02_1 {

	public static void main(String[] args) {

//		String name[] = {"��ҿ�", "�迵��", "�����", "������",
//				"������", "������", "������", "���Ź�", "������"};
		
		//	2��
//		int i,n;
//		for(i = 0; i < name.length; i++) {
//			System.out.println((i+1) +"�� : " + name[i] );
//		}
//		System.out.println();
		
		//	3��
//		String name[] = new String[3];
//		Scanner sc = new Scanner(System.in);
//		
//		for(int i = 0; i < name.length; i++) {
//			System.out.print("�л��� : ");
//			name[i] = sc.next();
//		}
//		for(int i = 0; i < name.length; i++) {
//			System.out.printf("%d�� %s %n",i+1, name[i]);
//		}
		
		//	4��
		Scanner sc = new Scanner(System.in);
		System.out.print("�迭ũ�� : ");
		int size = sc.nextInt();
		
		String name[] = new String[size];

		for(int i = 0; i < name.length; i++) {
			System.out.print(i + "��° ��� : ");
			name[i] = sc.next();
		}
		
//		�迭�� �� ����ϱ�
			 
		//ȫ�浿, ȫ���

		 System.out.println("\n�迭�� �� ����ϱ�\n------------------");

		 for (int i = 0; i < name.length; i++) {

		 System.out.print(name[i]+",");

		 }

		 System.out.println();

	
	}

}
