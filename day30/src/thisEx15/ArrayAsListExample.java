package thisEx15;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListExample {

	public static void main(String[] args) {

		List<String> list1 = Arrays.asList("È«±æµ¿", "½Å¿ë±Ç", "±èÀÚ¹Ù");
		for(String name : list1) {
			System.out.println(name);	// È«±æµ¿, ½Å¿ë±Ç, ±èÀÚ¹Ù
		}
		
		List<Integer> list2 = Arrays.asList(1, 2, 3);
		for(int value : list2) {
			System.out.println(value);	// 1, 2, 3
		}
	}

}
