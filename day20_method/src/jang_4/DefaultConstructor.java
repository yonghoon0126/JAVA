package jang_4;

public class DefaultConstructor {
	int x;
	public void setX(int x) {
		this.x = x;
	}
	public DefaultConstructor() {
		System.out.println("기본 생성자...");
	}
	public DefaultConstructor(int i) {
		this.x = i;
		System.out.println("인자가 있는 생성자");
	}
	
	public int getX() {
		return x;
	}
		
	
	
	public static void main(String[] args) {
		
		// 인자값이 있는 생성자를 호출하면 디폴트 생성자를 JVM이 자동으로 넣어주지 않는다.
		DefaultConstructor p1 = new DefaultConstructor();
		int n = p1.getX();
		
		DefaultConstructor p2 = new DefaultConstructor();
		p2.setX(5);
		
		System.out.println("x = " + p2.getX());
	}
}
