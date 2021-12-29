package thisEx11;

public class ValueCompareExample {

	public static void main(String[] args) {

		System.out.println("[-128 ~ 127 초과값일 경우]");
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
		System.out.println("== 결과 : " + (obj1 == obj2));	// 범위가 아니면 값 비교 불가능
		
		System.out.println("언박싱 후 == 결과 : " + (obj1.intValue() == obj2.intValue() ) );
		// 기본값 비교
		System.out.println("equals() 결과 : " + obj1.equals(obj2));
		System.out.println();
		
		
		
		
		
		System.out.println("[-128 ~ 127 범위값일 경우]");
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println(obj3.hashCode());
		System.out.println(obj4.hashCode());
		
		System.out.println("== 결과 : " + (obj3 == obj4));	// 범위 안에 있으면 값 비교 가능
		// 기본형처럼 비교하도록 허용
		System.out.println("언박싱 후 == 결과 : " + (obj3.intValue() == obj4.intValue() ) );
		System.out.println("equals() 결과 : " + obj3.equals(obj4));
		System.out.println();
		
	}

}
