package thisEx03;

public class InfinityAndNaNCheckExample {
	public static void main(String[] args) {

		int x = 5;
		double y = 0.0;
		// ��/0 / ��%0 -- �����Ͽ��� ���� ���� �� ArithmeticException �߻�
		// ��/0.0 �Ǵ� 0.0f : ���� ����, Infinite ���� ���� / ��%0.0 : ���� ����, NaN ���� ����
		// ��Ȯ�� ���� ���� isInfinite, isNaN�� ���ؾ� �Ѵ�.
		double z = x / y;	// 5/0.0 ���Ѵ�, isInfinite()
		double z1 = x % y;	// 5%0.0 NaN, isNaN()
		
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z1));

		System.out.println(z + 2); // �߸��� �ڵ�

	}
}
