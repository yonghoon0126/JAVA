package jang_5;

class SuperObject {
	
	protected String name;

	public void paint() {
		draw();
	}

	public void draw() {
		System.out.println(name);
	}
}

public class SubObject extends SuperObject {

	protected String name;

	@Override
	public void draw() {	// 오버라이딩

		name = "Sub";	// this.name = "Sub";	--> this생략해도 JVM이 해줌
		super.name = "Super";	// 부모객체.필드 호출
		super.draw();	// 부모객체.메소드() 호출
		System.out.println(name);
	}

	public static void main(String[] args) {
		
		SuperObject b = new SubObject();	// 부모 = 자식 일때 
		// 오버라이딩 된 부모 메소드 무시하고, 자식 메소드 사용
		b.paint();

	}

}
