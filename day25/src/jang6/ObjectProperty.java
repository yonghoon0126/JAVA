package jang6;

class Point {
	int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point(" + x + ", " + y + ")";
	}
	
	
	
	public boolean equals(Point p) {
		if(x == p.x && y == p.y)
			return true;
		else
			return false;
	}
}

public class ObjectProperty {
	public static void main(String[] args) {
		
		Point p = new Point(2, 3);
		System.out.println(p.getClass().getName());
		System.out.println(p.hashCode());
		System.out.println(p.toString());
		System.out.println(p);

		
		Point a = new Point(2,3);
		Point b = new Point(2,3);
		Point c = new Point(3,4);
		if(a == b)	
			System.out.println("a == b");
		if(a.equals(b))	
			System.out.println("a is equal to b");
		if(a.equals(c))	
			System.out.println("a is equal to c");
		
	}

}
