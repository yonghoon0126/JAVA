package Ex2;

public class Ex02_01 {
//�ʵ�=date=�Ӽ�=��������=������� : Ÿ�Կ� �´� ������ ����Ʈ���� �ִ� 
//Ŭ���� ����~���� �� ���� �ʵ尪�� ������
	
	//�޼ҵ�
	public static void main(String[] args) {
		//�޼ҵ峻�� ����� �������� ��� ��������
		//�� ������� �ʱ�ȭ(�ʱⰪ) ����� ��
		//�޼ҵ�(){��������; }�������� �������� ������
		//�޼ҵ�(){��������; }�ܿ����� ������ ����
		//�޸𸮿� ���ÿ����� ����
		int a, b;
		int result;
		
		a = 100;
		b = 50;
		
		result = a + b;
		System.out.println(a + "+" + b + "=" + result);
		
		result = a - b;
		System.out.println(a + "-" + b + "=" + result);
		
		result = a * b;
		System.out.println(a + "*" + b + "=" + result);
		
		result = a / b;
		System.out.println(a + "/" + b + "=" + result);
	}
}
