package test;
// ��ȯ���� ���� �Ű������� ���� �޼ҵ� ����
public class MethodEx01 {
	static	int num1 = 10;
	static	int num2 = 20;

	public static void main(String[] args) {
		// ��ü����
		MethodEx01 m1 = new MethodEx01();
		// �޼ҵ� ȣ��
		m1.sum();
		sum();	// ���� Ŭ���� �� �̸� static�޼ҵ�()�̱� ������ ��������
		MethodEx01.sum();	// ŸŬ���������� Ŭ������.�޼ҵ��()

		// non-static �޼ҵ� ȣ�� �� �� sum1()
		MethodEx01 m2 = new MethodEx01();
		// �޼ҵ� ȣ��
		m2.sum1();	// ��ü��.�޼ҵ��();

	}
	// �޼ҵ� ����
	public static void sum() {
		int tot = num1 + num2;
		System.out.println("�� = " + tot);
		return;	// �������� } == return�� �ǹ���
	}
	public void sum1() {
		int tot = num1 + num2;
		System.out.println("�� = " + tot);

	}
}

