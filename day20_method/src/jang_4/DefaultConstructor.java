package jang_4;

public class DefaultConstructor {
	int x;
	public void setX(int x) {
		this.x = x;
	}
	public DefaultConstructor() {
		System.out.println("�⺻ ������...");
	}
	public DefaultConstructor(int i) {
		this.x = i;
		System.out.println("���ڰ� �ִ� ������");
	}
	
	public int getX() {
		return x;
	}
		
	
	
	public static void main(String[] args) {
		
		// ���ڰ��� �ִ� �����ڸ� ȣ���ϸ� ����Ʈ �����ڸ� JVM�� �ڵ����� �־����� �ʴ´�.
		DefaultConstructor p1 = new DefaultConstructor();
		int n = p1.getX();
		
		DefaultConstructor p2 = new DefaultConstructor();
		p2.setX(5);
		
		System.out.println("x = " + p2.getX());
	}
}
