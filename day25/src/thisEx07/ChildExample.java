package thisEx07;

public class ChildExample {

	public static void main(String[] args) {
		
		Child child = new Child();
		
		Parent parent = child;
		
		parent.method1();
		parent.method2();
//		parent.method3(); // 호출 불가능

		child = (Child)parent;
		child.method3(); // 강제 캐스팅(다운 캐스팅)
		
	}

}
