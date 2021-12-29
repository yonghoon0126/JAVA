package jang7;

//	�÷���(Collection) Ư¡ ����
//	set				: �ߺ� ����, ����	/ �ε��� ����
//	List			: �ߺ� ���, ����	/ �ε��� ����
//	Map(Key�� Value)	: Ű - �ߺ� ����  	/ �ε��� ����, ����
//					  �� - �ߺ� ���

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsEx {

	static void printList(LinkedList<String> l) {
		Iterator<String> iterator = l.iterator();

		while (iterator.hasNext())	{

			String e = iterator.next();
			String separator;
			if (iterator.hasNext())
				separator = "->";
			else
				separator = "\n";
			System.out.print(e + separator);
		}
	}

	public static void main(String[] args) {

		LinkedList<String> myList = new LinkedList<String>();
		myList.add("Ʈ��������");
		myList.add("��Ÿ����");
		myList.add("��Ʈ����");
		myList.add(0, "�͹̳�����");
		myList.add(2, "�ƹ�Ÿ");

		System.out.println("���� ��====================");
		printList(myList);
		// �͹̳�����->Ʈ��������->�ƹ�Ÿ->��Ÿ����->��Ʈ����

		System.out.println("\n���� ��====================");
		Collections.sort(myList);
		printList(myList);
		// ��Ʈ����->��Ÿ����->�ƹ�Ÿ->�͹̳�����->Ʈ��������
		
		System.out.println("\n�̺а˻�====================");
		int index = Collections.binarySearch(myList, "�ƹ�Ÿ") + 1;
		System.out.println("�ƹ�Ÿ�� " + index + "��° ��� �Դϴ�.");

		System.out.println("\n���� ���====================");
		Collections.reverse(myList);	
		printList(myList);
		// Ʈ��������->�͹̳�����->�ƹ�Ÿ->��Ÿ����->��Ʈ����
	}

}



