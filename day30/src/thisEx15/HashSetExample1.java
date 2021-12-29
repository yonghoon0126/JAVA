package thisEx15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();

		set.add("Java");	// 0
		set.add("JDBC");	// 1
		set.add("Servlet/JSP");	// 2
		set.add("Java");	// 3
		set.add("iBATIS");	// 4


		int size = set.size();
		System.out.println("ÃÑ °´Ã¼ ¼ö : " + size);

		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}

		set.remove("JDBC");
		set.remove("iBATIS");

		//=========================================================================

		System.out.println("ÃÑ °´Ã¼ ¼ö : " + set.size());

		iterator = set.iterator();	// ¹Ýº¹ÀÚ ¾ò±â
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}

		set.clear();
		if (set.isEmpty()) {
			System.out.println("ºñ¾î ÀÖÀ½");
		}

	}

}
