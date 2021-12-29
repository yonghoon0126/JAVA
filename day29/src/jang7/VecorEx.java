package jang7;

import java.util.Iterator;

//	Collection �������̽� : ��ü�� ��� ���� �������̽�
//
//	List : ����(o), �ߺ�(o) : vector, set, linkedList... 
//	Set : ����(x), �ߺ�(x) : Ű�� ���� ����
//	Map : Ű, ���� ������ ����, �˻��� ���� ����
//
//	<?> 				: ��� �ڷ����� ���ʸ� Ÿ������ ��� �� �� �ִ�.
//	<? super ���� Ŭ����> 	: ���� Ŭ������ ��� �ް� �ִ� ����(�θ�)Ŭ���� �ڷ������� ����
//	<? extends �θ� Ŭ����>	: �θ� ��� ���� ��ü���� �ڷ������� �ްڴ�.
//	
//	Vector : ������ ����ȭ, �ټ��� �����尡 ���ÿ� Vector�� ���ٰ���(thread safe)
//	list�� ������ Ŭ�����μ� ���������� �迭�� �ʿ��� �� ����.
//	���Ϳ� ���ԵǴ� ����� ���� �������� �ڵ����� ũ�� ������. ��Ұ� �������� �߰�, �߰��� ����
//	��� ����. �����ϸ� ��ҵ��� ������ �ϳ��� �̵���.


import java.util.Vector;

public class VecorEx {

	public static void main(String[] args) {

		// ���� ���� �ٷ�� ���ʸ� ���� ����
		Vector<Integer> v = new Vector<Integer>();	// �⺻ �뷮�� 10
		v.add(5);	// 5 ����
		v.add(4);	// 4 ����
		v.add(-1);	// -1 ����

		// ���� �߰��� �����ϱ�	// 5 4 100 -1
		v.add(2, 100);	// 4�� -1���̿� ���� 100 ����
		System.out.println("���� ���� ��� ��ü �� : " + v.size());	// ũ�� 4
		System.out.println("������ ���� �뷮 : " + v.capacity());	// ������ ����Ʈ �뷮 10
		// �⺻ �뷮 = 10

		// ��� ��� ���� ����ϱ�
		for (int i = 0; i < v.size(); i++) {
			int n = v.get(i);	// == v.elementAt(i);
			System.out.println(n);	// 5 4 100 -1
		}

		// ���� ���� ��� ���� ���ϱ�
		int sum = 0;
		for (int i = 0; i < v.size(); i++) {
			int n = v.elementAt(i);	// == v.get(i);
			sum += n;
		}
		System.out.println("���Ϳ� �ִ� ���� �� : " + sum);	// 108
		System.out.println();
		System.out.println("====Iterator(�ݺ���) �̿��ϱ�================");
		System.out.println();
		
//		Iterator�� ���� ��ü ���
//		hasNext() : ���� �����Ϳ�Ұ� �ִ��� ���θ� ��ȯ
//		next() : ���� ������ ��� ���� ���������� ��ȯ
//		Vector, ArrayList, linkedList, Set�� ���� �÷��ǿ��� ��Ҹ� ����������
//		�˻��� �� ���ϰ� ����ϴ� Interator<E>�������̽��̴�.
		
		Iterator<Integer> it = v.iterator();	// �ݺ���
		int str;
		while(it.hasNext()) {
			str = it.next();
			System.out.println(str + " ");	// 5 4 100 -1
		}
		System.out.println("..." + it.next());	// ���� �Ұ�, exception �߻�
		
	}

}

