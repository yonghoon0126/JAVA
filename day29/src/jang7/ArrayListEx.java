package jang7;

//	ArrayList�� ����ũ���� �迭�� ���� �÷��� Ŭ�����μ� Vector�� ���� �����ϴ�.
//	�ٸ��� : ArrayList�� �����尣�� ����ȭ�� �������� �ʱ� ������ �ټ��� �����尡 ���ÿ�
//	ArrayList�� ��Ҹ� �����ϰų� ������ �� �浹�� �߻��� �� �ִ�.
//	ArrayList�� ����Ϸ��� ��Ƽ�������� ����ȭ�� ����ڰ� �����ؾ� �Ѵ�.
//	���ο� �迭�� ������ ������, �� �迭�� ������ ũ��� �����Ѵ�.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class ArrayListEx {

	public static void main(String[] args) {

		// ���ڿ��� ���� ������ ArrayList �÷��� ����
		ArrayList<String> a = new ArrayList<String>();

		// Ű����κ��� 4���� �̸� �Է¹޾� ArrayList�� ����
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 4; i++) {
			System.out.print("�̸��� �Է��ϼ��� >> ");
			String s = sc.next();
			a.add(s); // ArrayList�÷��ǿ� ����
		}

		// ArrayList�� ��� �ִ� ��� �̸� ���
//		for (int i = 0; i < a.size(); i++) {
//			// ArrayList�� i��° ���ڿ� ������
//			String name = a.get(i);
//			System.out.print(name + " ");
//		}
		
		// Iterator �̿��ϱ�
		Iterator<String> it = a.iterator();	// �ݺ���
		String str;
		while(it.hasNext()) {
			str = it.next();
			System.out.print(str + " ");
		}

		// ���� �� �̸� ���
		int longestIndex = 0;

		for (int i = 0; i < a.size(); i++) {

			if (a.get(longestIndex).length() < a.get(i).length()) 
				longestIndex = i;
		}	// for
		System.out.println("\n���� �� �̸��� : " + a.get(longestIndex));

	}

}
