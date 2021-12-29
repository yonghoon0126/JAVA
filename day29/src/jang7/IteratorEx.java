package jang7;

import java.util.Iterator;
import java.util.Vector;

public class IteratorEx {

	public static void main(String[] args) {

		// ���� ���� �ٷ�� ���ʸ� ���� ����
		Vector <Integer> v = new Vector<Integer>();

		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2, 100);	// 4�� -1 ���̿� ���� 100 ����
		// 5 4 100 -1
		
		System.out.println("Size�� ���----------------");
		
		for(int i = 0; i < v.size(); i++) {
			int n = v.get(i);	// vector�� get()����ؾ� ��
			System.out.print(n + " ");
		}
		
		System.out.println();
		System.out.println("Iterator�� ���----------------");

		// Iterator�� �̿��� ��� ���� ����ϱ�
		Iterator <Integer> it = v.iterator();	// iterator ��ü ���

		while(it.hasNext()) {
			int n = it.next();
			System.out.print(n + " ");
		}

		// iterator�� �̿��Ͽ� ��� ���� ���ϱ�
		int sum = 0;
		it = v.iterator();	// iterator ��ü ���
		
		while(it.hasNext()) {
			int n = it.next();
			sum += n;
		}
		System.out.println("\n���Ϳ� �ִ� ���� �� : " + sum);

	}

}
