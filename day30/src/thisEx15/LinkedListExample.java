package thisEx15;

import java.util.ArrayList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();

		long startTime;
		long endTime;

		startTime = System.nanoTime();	// 밀리 : 10^-3, 마이크로 : 10^-6, 나노 : 10^-9
		for (int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));	// 정수를 String형 객체로 변환
		}

		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간 : " + (endTime - startTime) + "ns");
		// ArrayList 걸린시간 : 13300000 ns
		
		
		
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간 : " + (endTime - startTime) + "ns");
		// LinkedList 걸린시간 : 9007800 ns

	}
}

