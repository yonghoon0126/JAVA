package Homework;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class homework {

	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();

		Scanner sc = new Scanner(System.in);

		System.out.println("�̸��� �Է��ϼ��� : ");
		for (int i = 0; i < 3; i++) {
			String s = sc.next();
			v.add(s);
		}
		System.out.println(v);

		HashMap<Integer, String> name = new HashMap<Integer, String>();

		name.put(1, "�����");
		name.put(2, "������");
		name.put(3, "������");
		name.put(4, "������");
		name.put(5, "���Ź�");
		name.put(6, "��ҿ�");
		name.put(7, "������");
		name.put(8, "������");
		name.put(9, "�迵��");

		Set<Integer> keys = name.keySet();
		Iterator<Integer> it = keys.iterator();

		while (it.hasNext()) {
			Integer key = it.next();
			String value = name.get(key);
			System.out.println("(" + key + "," + value + ")");
		}

	}

}
