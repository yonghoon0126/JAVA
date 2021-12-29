package day18;

import thisEx05.Week;

public class EnumMethodExample {

	public static void main(String[] args) {
		
		// name() 메소드================================================
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);	// SUNDAY
		System.out.println("==============");

		// ordinal() 메소드================================================
		int ordinal = today.ordinal();
		System.out.println(ordinal);	// 6
		System.out.println("==============");

		// compareTo() 메소드================================================
		Week day1 = Week.MONDAY;	// 0
		Week day2 = Week.WEDNESDAY;	// 2
		int result1 = day1.compareTo(day2);	// 0 - 2
		int result2 = day2.compareTo(day1);	// 2 - 0
		System.out.println(result1);	
		System.out.println(result2);	
		System.out.println("==============");

		// valueOf() 메소드================================================
		if (args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if (weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말이군요.");
			} else {
				System.out.println("평일이군요.");
			}
		}

		// values() 메소드================================================
		Week[] days = Week.values();
		for (Week day : days) {
//			= for (Week day : Week.values()) {
			System.out.println(day);
		}
		System.out.println("==============");
	}
}
