package thisEx07;

public class Child extends Parent{
	
	@Override
	public void method2() {	// 재정의
		System.out.println("Child-method2()");
	}
	
	public void method3() {	// child(자식)메소드
		System.out.println("Child-method3()");
	}

}
