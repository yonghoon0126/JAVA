package jang_4;

class CurrencyConverter {

	private static double rate; // �ѱ� ��ȭ�� ���� ȯ��
	
	// �Ϲ� �޼ҵ� == non static
	public double toDollar2(double won) {
		System.out.println("����� �Ϲ� �޼ҵ�...");
		return won / rate; // �ѱ� ��ȭ�� �޷��� ��ȯ
	}
	
	// static �޼ҵ�
	public static double toDollar(double won) {
		System.out.println("����� �Ϲ� �޼ҵ�...");
		return won / rate; // �ѱ� ��ȭ�� �޷��� ��ȯ
	}
	public static double toKWR(double dollar) {
		return dollar * rate; // �޷��� �ѱ� ��ȭ�� ��ȯ
	}
	public static void setRate(double rate) {
		// this.rate = rate ==> static �޼ҵ忡�� this ��� �Ұ�
		rate = rate; // ȯ�� ����.KWR / $1
	}
}


public class staticMember {

	public static void main(String[] args) {

		CurrencyConverter curr = new CurrencyConverter();
		
		CurrencyConverter.setRate(1121); // �̱� �޷� ȯ�� ����

		System.out.println("�鸸���� " + CurrencyConverter.toDollar(10000000) 
							+ "�޷� �Դϴ�.");
		System.out.println("�鸸���� " + curr.toDollar2(20000000) + "�޷� �Դϴ�."); 

		System.out.println("��޷��� " + CurrencyConverter.toKWR(100) 
							+ "�� �Դϴ�.");
	}
}
