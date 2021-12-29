package thisEx03;

import java.util.Scanner;

public class InputDataCheckNaNExample2 {
	public static void main(String[] args) {
		String userInput = "NaN";
		double val = Double.valueOf(userInput);

		double currentBalance = 10000.0;
		// String : 객체
		// ==, != : 기본형 연산일때만 비교, 산술처리
		// 객체.equals("비교할 객체") : 객체일 때 비교연산
		if (Double.isNaN(val)) {
			System.out.println("NaN이 입력되어 처리할 수 없음");
			val = 0.0;
		}
		currentBalance += val;
		System.out.println(currentBalance);
		System.out.println("-----------------------------------");

		InputDataCheckNaNExample2 i1 = new InputDataCheckNaNExample2();
		InputDataCheckNaNExample2 i2 = new InputDataCheckNaNExample2();

		// 논리적 주소, 물리적 주소(=실제 주소)
		System.out.println("i1 = " + i1.hashCode()); // 실제 주소가 다름
		System.out.println("i2 = " + i2.hashCode()); // 실제 주소가 다름
		// 객체끼리 비교(equals)일 때 주소 비교
		// object일 때 ==, equals 주소
		if (i1.equals(i2)) {
			System.out.println("i1과 i2는 주소가 같다");
		} else
			System.out.println("i1과 i2는 주소가 다르다");

		// String 일 때 == : 주소 비교, equals() : 값 비교(Overriding)
		String str1 = "값", str2 = "값"; // equals()를 재정의(Overriding) 값비교로
		// new 연산없이 똑같은 값을 넣어주면 같은 주소를 가리킨다.
		// new 연산자가 있으면 무조건 새로운 주소를 생성
		// new 연산자로 객체를 생성할 때 같은 값을 넣어주면
		// 실제 주소는 다르지만 hashCode()를 재정의해서 논리적 주소가 같아 진다.
		String str3 = new String("값");
		String str4 = new String("값");

		if (str1.equals(str2)) {
			System.out.println("str1과 str2는 값이 같다");
		} else
			System.out.println("str1과 str2는 값이 다르다");

		if (str1 == str2) {
			System.out.println("str1과 str2는 주소가 같다");
		} else
			System.out.println("str1과 str2는 주소가 다르다");

		System.out.println("str1 = " + str1.hashCode()); // 실제 주소가 다름
		System.out.println("str2 = " + str2.hashCode()); // 실제 주소가 다름
		System.out.println("str3 = " + str3.hashCode()); // 실제 주소가 다름
		System.out.println("str4 = " + str4.hashCode()); // 실제 주소가 다름
		System.out.println("String일 때 = " + str4);
		System.out.println("String일 때 = " + str4.toString());
		System.out.println("객체 = " + str4);
		System.out.println("객체 = " + str4.toString());

		System.out.println("-----------------------------------");

//========================================================================

		// 키보드로 성별을 입력 받아
		// 입력 받은 값이 "여성" 또는 "남성"인지 구분하여 아래처럼 출력하시오.
		// 여성 / 남성 이외의 값을 입력하면 "잘못 입력했습니다"를 출력하시오.
		// 출력)
		// 당신은 여성 / 남성 입니까? : 여성
		// 여성이군요.
		// 당신은 여성 / 남성 입니까? : 남성
		// 남성이군요.

		// 스캐너 이용해서 키보드를 생성하세요.
		Scanner s = new Scanner(System.in);

		System.out.println("당신은 여성 / 남성입니까?");
		// 키보드 변수를 이용해서 성별을 입력하고 변수에 저장하세요.
		String str = s.next();

		// if문 사용해서 남성일 때 "당신은 남성이군요."
		// 만약에 str이 여성이면 여성출력
		// 여성이 아니면 str이 남성이면 남성출력
		// 여성도 남성도 아니면 잘못 입력했습니다.
		if (str.equals("여성")) {
			System.out.println("당신은 여성 이군요.");

		} else if (str.equals("남성")) {
			System.out.println("당신은 남성 이군요.");

		} else {
			System.out.println("잘못 입력했습니다.");

		}

	}

}
