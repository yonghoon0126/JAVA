package jang_4;

// final은 상속불가	/ 클래스
 class FinalClass {
	
	 // 메소드
	 // 재정의 불가(Overriding)X
	 // public final 
	 int finalMethod() {
		 return 10;
	 }
}

public final class DerivedClass_final extends FinalClass{
	//필드 final
	
	static final int A = 70;	// A변수에 70으로 고정(상수화 된 변수) : 재할당/재저장 불가

	public final int finalMethod() {
//		A = 30;	// 위에 fianal에서 70을 선언했기 때문에 값 재할당 불가
		return 100;
	}
	
}
	
	
