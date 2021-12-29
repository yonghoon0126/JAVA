package jang6;

class Rect {
	int width;
	int height;

	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public boolean equals(Rect p) {
		if (width * height == p.width * p.height)
			return true;
		else
			return false;
	}
}


public class EqualsEx {

	public static void main(String[] args) {
		
		Rect a = new Rect(2, 3);
		Rect b = new Rect(3, 2);
		Rect c = new Rect(3, 4);

		if (a.equals(b))
			System.out.println("a is equals to b");
		
		if (a.equals(c))
			System.out.println("a is equals to c");
		if (b.equals(c))
			System.out.println("b is equals to c");
		
		
		if (a.equals(b))
			System.out.println("a is equals to b");
		else
			System.out.println("실제 주소가 달라요.");
		
		
		if(a == b) {
			System.out.println("주소가 같아요.");
		}else
			System.out.println("주소가 달라요.");
		
		System.out.println("a = " + a.height + ", b = " + b.hashCode());
		
		
		// 객체 : ==, equals() 주소
		
		// 기본형 : == 값 비교
		
		// String : == 주소(실제), equals() : 값 비교 = 내용, 
		//			 hashCode()를 재정의 했음(논리적 주소 비교)
		
		
	}

}
