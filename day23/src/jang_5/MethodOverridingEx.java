package jang_5;

class DObject {
	
	public DObject next;

	public DObject() {
		next = null;
	}

	public void draw() {	// 메소드 오버라이딩
		System.out.println("DObject draw");
	}
}

class Line extends DObject {
	@Override
	public void draw() { // 메소드 오버라이딩
		System.out.println("Line");
	}
}
class Rect extends DObject {
	@Override
	public void draw() { // 메소드 오버라이딩
		System.out.println("Rect");
	}
}
class Circle extends DObject {
	@Override
	public void draw() { // 메소드 오버라이딩
		System.out.println("Circle");
	}
}

public class MethodOverridingEx {
	public static void main(String[] args) {

		DObject obj = new DObject();	// DObject.draw() 메소드 실행. "DObject draw"
		Line line = new Line();	// Line.draw() 메소드 실행. "Line" 출력
		DObject p = new Line();	// 오버라이딩된 메소드 Line.draw() 실행, "Line"
		DObject r = line;	// upcasting

		obj.draw();
		line.draw();
		p.draw();
		r.draw();

		DObject rect = new Rect();	// upcasting
		DObject circle = new Circle();	// upcasting
		rect.draw();	// 오버라이딩된 메소드 Rect.draw() 실행, "Rect" 출력		
		circle.draw();	// 오버라이딩된 메소드 Circle.draw() 실행, "Circle" 출력
	}
}
