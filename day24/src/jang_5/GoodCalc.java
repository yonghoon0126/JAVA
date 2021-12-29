package jang_5;

//	* �߻� Ŭ����(Abstract)��
//	���� �ְ� ���ǰ� ���� �ϳ� �̻��� �߻� �޼ҵ带 ���� Ŭ������
//	���� Ŭ������[�� �������̵�(Overriding)�� ������ ����Ǵ�
//	�޼ҵ忡 ���� �޸� ���� ���� �̸� ȣ�� ��ȹ�� �����α� ���� �����.
//	
//	* ���� �� ����
//	[��������������] abstract class Ŭ������
//	{
//		[��������������] abstract �ڷ��� �޼ҵ��([�Ű�����], [...]);
//	}
//	
//	*Ư¡
//	Ŭ������ ��� �ϳ��� �߻� �޼ҵ带 ������ ��
//	�� Ŭ������ Ŭ���� �տ� ��abstract�� Ű���带 �ٿ�
//	�߻� Ŭ������ ����ؾ� �ϸ� �߻� Ŭ������ ������ ��쿡��
//	�ҿ����� ������ Ŭ�����̹Ƿ� ��ü�� ������ �� ����.

class GoodCalc extends Calculator {
	
	public int add(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public double average(int[] a) {
		double sum = 0;
		for (int i = 0; i < a.length; i++)
			sum += a[i];
		return sum / a.length;
	}

	public static void main(String[] args) {
		
		Calculator c = new GoodCalc();
		
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2, 3));
		System.out.println(c.average(new int[] {2,3,4}));	
	}
}
