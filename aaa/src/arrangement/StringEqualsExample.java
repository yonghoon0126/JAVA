package arrangement;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		String strVar3 = new String("신민철");

		System.out.println( strVar1 == strVar2); // 실제 주소 비교
		System.out.println( strVar1 == strVar3);
		System.out.println();

		System.out.println( strVar1.equals(strVar2)); // 내용 = 값을 비교
		System.out.println( strVar1.equals(strVar3));

//-----------------------------------------------------------------
		
		System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		// hashCode() 재정의(Overriding)
		System.out.println(" strVar1 " + strVar1.hashCode());
		System.out.println(" strVar2 " + strVar2.hashCode());
		System.out.println(" strVar3 " + strVar3.hashCode());

		// 객체 : 클래스, 배열, 인터페이스, String
		System.out.println("-------------------------------------");

		// String이 equals()를 재정의 해서 내용 비교가 된다
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));

		System.out.println("--------객체 주소 비교---------------------");
		// 객체생성, 힙영역에 메모리 할당 = 확보
		StringEqualsExample se = new StringEqualsExample();
		StringEqualsExample se1 = new StringEqualsExample();

		System.out.println(se.hashCode());
		System.out.println(se1.hashCode());
		System.out.println(se1 == se); // 주소 비교
		System.out.println(se1.equals(se)); // 주소 비교

	}
}
