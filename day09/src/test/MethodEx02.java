package test;
// ��ȯ���� ���� �Ű������� ������ �޼ҵ� ����
public class MethodEx02 {
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;

		// ��ü����
		MethodEx02 m1 = new MethodEx02();
		// �޼ҵ� ȣ��
		m1.sum(num1, num2);	// �޼ҵ� ���ǵǾ� �ִ´�� ȣ��
		sum(num1, num2);	// ���� Ŭ���� �� �̸� static�޼ҵ�()�̱� ������ ��������
		MethodEx02.sum(num1, num2);	// ŸŬ���������� Ŭ������.�޼ҵ��()

		// non-static �޼ҵ� ȣ�� �� �� sum1()
		MethodEx02 m2 = new MethodEx02();
		// �޼ҵ� ȣ��
		m2.sum1(num1, num2);	// ��ü��.�޼ҵ��();

	}
	// �޼ҵ� ����
	public static void sum(int num1, int num2) {	// int num1 = num1
		int tot = num1 + num2;
		System.out.println("�� = " + tot);
		return;	// �������� } == return�� �ǹ���
	}
	public void sum1(int num1, int num2) {
		int tot = num1 + num2 + 100;
		System.out.println("�� = " + tot);

	}
}
