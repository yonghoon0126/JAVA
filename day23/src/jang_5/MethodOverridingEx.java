package jang_5;

class DObject {
	
	public DObject next;

	public DObject() {
		next = null;
	}

	public void draw() {	// �޼ҵ� �������̵�
		System.out.println("DObject draw");
	}
}

class Line extends DObject {
	@Override
	public void draw() { // �޼ҵ� �������̵�
		System.out.println("Line");
	}
}
class Rect extends DObject {
	@Override
	public void draw() { // �޼ҵ� �������̵�
		System.out.println("Rect");
	}
}
class Circle extends DObject {
	@Override
	public void draw() { // �޼ҵ� �������̵�
		System.out.println("Circle");
	}
}

public class MethodOverridingEx {
	public static void main(String[] args) {

		DObject obj = new DObject();	// DObject.draw() �޼ҵ� ����. "DObject draw"
		Line line = new Line();	// Line.draw() �޼ҵ� ����. "Line" ���
		DObject p = new Line();	// �������̵��� �޼ҵ� Line.draw() ����, "Line"
		DObject r = line;	// upcasting

		obj.draw();
		line.draw();
		p.draw();
		r.draw();

		DObject rect = new Rect();	// upcasting
		DObject circle = new Circle();	// upcasting
		rect.draw();	// �������̵��� �޼ҵ� Rect.draw() ����, "Rect" ���		
		circle.draw();	// �������̵��� �޼ҵ� Circle.draw() ����, "Circle" ���
	}
}
