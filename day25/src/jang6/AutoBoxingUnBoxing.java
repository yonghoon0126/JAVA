package jang6;

public class AutoBoxingUnBoxing {

	public static void main(String[] args) {

		int i = 10;
		Integer intObject = i;	// auto boxing
		// Integer intObject = new Integer(10);
		// intObject.intValue();
		System.out.println("intObject = " + intObject);	// �ڵ���ڽ� �� ���
		
		
		// intObject.intValue() + 10;
		i = intObject + 10;	// �⺻ = ��ü + �⺻ // ��ü�� �⺻���� �ڵ���ڽ� �� ���
		System.out.println("i = " + i);
	}
}
