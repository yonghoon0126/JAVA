package thisEx07;

public class ChildExample2 {

	public static void main(String[] args) {
		
		Parent2 parent2 = new Child2();
		parent2.field1 = "data1";
		parent2.method1();
		parent2.method2();
		
//		parent2.field = "data2";
//		parent2.method3(); // 호출 불가능

		Child2 child2 = (Child2)parent2;
		child2.field2 = "yyy"; // 가능
		child2.method3();	// 가능

		System.out.println();
		System.out.println("================================");
		System.out.println();
		
		
//================================================================
		
		Parent2 parentA = new Child2();
		method1(parentA);
		method2(parentA);

		Parent2 parentB = new Parent2();
		method1(parentB);
		method2(parentB);
	}
		
	public static void method2(Parent2 parent) {
		if(parent instanceof Child2) {
			Child2 child = (Child2)parent;
			System.out.println("method - Child로 변환 성공...");
		}else {
			System.out.println("method - Child로 변환 성공...");
		}

	}
	public static void method1(Parent2 patent) {
		Child2 child = (Child2)patent;	// 형변환 불가
		System.out.println("method - Child로 변환 성공...");
	}


}
