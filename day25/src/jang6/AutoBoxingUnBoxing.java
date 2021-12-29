package jang6;

public class AutoBoxingUnBoxing {

	public static void main(String[] args) {

		int i = 10;
		Integer intObject = i;	// auto boxing
		// Integer intObject = new Integer(10);
		// intObject.intValue();
		System.out.println("intObject = " + intObject);	// 자동언박싱 후 출력
		
		
		// intObject.intValue() + 10;
		i = intObject + 10;	// 기본 = 객체 + 기본 // 객체를 기본으로 자동언박싱 후 계산
		System.out.println("i = " + i);
	}
}
