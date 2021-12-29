package thisEx11;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {

		// Boxing
		Integer obj1 = new Integer(100);	// 기본 -> 객체
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf("300");

		// 자동 박싱
		Integer ob1 = 100;
//		jvm이 자동으로 아래같이 변경함
//		Integer ob1 = new Integer(100);
		Integer ob2 = 200;
		Integer ob3 = 300;
		
		
		// Unboxing
		int value1 = obj1.intValue();	// 객체 -> 기본
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();

		// 자동 언박싱
		int ov1 = ob1; 
		int ov2 = ob2; 
		int ov3 = ob3; 
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);

	}

}
