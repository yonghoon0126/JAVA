package jang_3;

public class foreachEx {

	enum Week {월, 화, 수, 목, 금, 토, 일};

	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 4, 5 };
		String names[] = { "사과", "배", "바나나", "체리", "딸기", "포도" };
		int sum = 0;

		// 아래 for-each에서 i는 num[0], num[1], ..., num[4]로 반복됨
//		for (int i : num) 
//			sum += i;
//		System.out.println("합은 " + sum);
		
		// 기본형 for
		for(int i =0; i < num.length; i++) {
			sum = sum + num[i];
		}
		System.out.println("합은 " + sum);
		
//====================================================================

		// 아래 for-each에서 s는 names[0], names[1], ..., names[5]로 반복됨
//		for (String s : names) 
//			System.out.println(s + " ");
//		System.out.println();	// "사과", "배", "바나나", "체리", "딸기", "포도"
		
		// 기본형 for
		for(int i = 0;  i < names.length; i++) {
		System.out.print(i + " : " + names[i] + " ");
		}
		System.out.println();
		
		int i = 0;
		for (String s : names) 
			System.out.println((i++) + " : "  + s + " " );
		
//====================================================================
		
		// 아래 for-each에서 day는 월, 화, 수, 목, 금, 토, 일 값으로 반복됨
//		for (Week day : Week.values()) 
//			System.out.println(day + "요일");
//		System.out.println();
		
		String week;
		for(i = 0; i < Week.values().length; i++) {
			System.out.print(i + " : " + Week.values()[i] + " ");
		}
		System.out.println();
	}
}

