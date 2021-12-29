package jang_4;

public class MyExp {
	
	int base;
	int exp;

	// 멤버 메소드
	int getValue() {
		int res = 1;
		for(int i = 0; i < exp; i++)
			res = res * base;
		return res;
	}
	
	// setter()로 멤버변수 초기화
	public void setBase(int Base) {
		this.base = base;
	}
	public void setExp(int Exp) {
		this.exp = exp;
	}
	
	// get
	public int getBase() {
		return base;
	}
	public int getExp() {
		return exp;
	}
	
	
	public static void main(String[] args) {
		MyExp number1 = new MyExp();
		number1.base = 2;
		number1.exp = 3;

		MyExp number2 = new MyExp();
		number2.base = 3;
		number2.exp = 4;
		
		// setter()로 멤버변수 초기화
		number1.setBase(2);
		number1.setExp(3);
		
		number2.setBase(3);
		number2.setExp(4);
		
		System.out.println("2의 3승 = " + number1.getValue());
		System.out.println("3의 4승 = " + number2.getValue());
		
		// 직접 출력
		System.out.println("number1.base = " + number1.base);
		System.out.println("number1.exp = " + number1.exp);
		
		// get
		System.out.println("number1.base = " + number1.getBase());
		System.out.println("number1.exp = " + number1.getExp());
		
		
		
	}

}
