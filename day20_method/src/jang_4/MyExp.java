package jang_4;

public class MyExp {
	
	int base;
	int exp;

	// ��� �޼ҵ�
	int getValue() {
		int res = 1;
		for(int i = 0; i < exp; i++)
			res = res * base;
		return res;
	}
	
	// setter()�� ������� �ʱ�ȭ
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
		
		// setter()�� ������� �ʱ�ȭ
		number1.setBase(2);
		number1.setExp(3);
		
		number2.setBase(3);
		number2.setExp(4);
		
		System.out.println("2�� 3�� = " + number1.getValue());
		System.out.println("3�� 4�� = " + number2.getValue());
		
		// ���� ���
		System.out.println("number1.base = " + number1.base);
		System.out.println("number1.exp = " + number1.exp);
		
		// get
		System.out.println("number1.base = " + number1.getBase());
		System.out.println("number1.exp = " + number1.getExp());
		
		
		
	}

}
