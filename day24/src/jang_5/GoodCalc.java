package jang_5;

//	* 추상 클래스(Abstract)는
//	선언만 있고 정의가 없는 하나 이상의 추상 메소드를 갖는 클래스로
//	하위 클래스에[서 오버라이딩(Overriding)할 것으로 예상되는
//	메소드에 대해 메모리 낭비 없이 미리 호출 계획을 세워두기 위해 만든다.
//	
//	* 형식 및 구조
//	[접근제어지시자] abstract class 클래스명
//	{
//		[접근제어지시자] abstract 자료형 메소드명([매개변수], [...]);
//	}
//	
//	*특징
//	클래스가 적어도 하나의 추상 메소드를 포함할 때
//	그 클래스는 클래스 앞에 『abstract』 키워드를 붙여
//	추상 클래스로 명시해야 하며 추상 클래스로 선언한 경우에는
//	불완전한 형태의 클래스이므로 객체를 생성할 수 없다.

class GoodCalc extends Calculator {
	
	public int add(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public double average(int[] a) {
		double sum = 0;
		for (int i = 0; i < a.length; i++)
			sum += a[i];
		return sum / a.length;
	}

	public static void main(String[] args) {
		
		Calculator c = new GoodCalc();
		
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2, 3));
		System.out.println(c.average(new int[] {2,3,4}));	
	}
}
