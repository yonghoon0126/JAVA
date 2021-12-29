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

		System.out.println("ÀÌ¸§À» ÀÔ·ÂÇÏ¼¼¿ä : ");
		for (int i = 0; i < 3; i++) {
			String s = sc.next();
			v.add(s);
		}
		System.out.println(v);

		HashMap<Integer, String> name = new HashMap<Integer, String>();

		name.put(1, "±è¿ëÈÆ");
		name.put(2, "¾çÁÖÈñ");
		name.put(3, "±èÀ¯¼º");
		name.put(4, "¿Á¼ö¹Î");
		name.put(5, "Á¶½Å¹ü");
		name.put(6, "±è¼Ò¿¬");
		name.put(7, "ÇãÁ¤Àº");
		name.put(8, "Á¶¼ºÇö");
		name.put(9, "±è¿µ¿ì");

		Set<Integer> keys = name.keySet();
		Iterator<Integer> it = keys.iterator();

		while (it.hasNext()) {
			Integer key = it.next();
			String value = name.get(key);
			System.out.println("(" + key + "," + value + ")");
		}

	}

}
