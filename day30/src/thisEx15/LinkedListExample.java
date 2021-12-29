package thisEx15;

import java.util.ArrayList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();

		long startTime;
		long endTime;

		startTime = System.nanoTime();	// �и� : 10^-3, ����ũ�� : 10^-6, ���� : 10^-9
		for (int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));	// ������ String�� ��ü�� ��ȯ
		}

		endTime = System.nanoTime();
		System.out.println("ArrayList �ɸ��ð� : " + (endTime - startTime) + "ns");
		// ArrayList �ɸ��ð� : 13300000 ns
		
		
		
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList �ɸ��ð� : " + (endTime - startTime) + "ns");
		// LinkedList �ɸ��ð� : 9007800 ns

	}
}

