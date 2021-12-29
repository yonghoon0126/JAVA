package thisEx03;

public class CheckOverflowExample {
	public static void main(String[]args) throws ArithmeticException{
		// object -> Throwable -> Error, Exception
		try {	// ���ܰ˻�
			int result = safeAdd(2_000_000_000, 2_000_000_000);
			System.out.println(result);
		} catch(ArithmeticException e) {	// ���ܰ˻� �� ������ ������ ó��
			System.out.println("�����÷ο찡 �߻��Ͽ� ��Ȯ�ϰ� ����� �� ����");
			throw new ArithmeticException("�����÷ο� �߻�");

		}finally{
			System.out.println("������ ������");
		}
	}

	// �޼ҵ� ȣ�� --> safeAdd(��)
	// �޼ҵ� ���� == �޼ҵ� ����
	// ���������� ������ ��ȯ�� �޼ҵ��(�ڷ�Ÿ�� ������...){ó���� ����; return
	public static int safeAdd(int left, int right) {
		if ((right > 0)) {
			if (left > (Integer.MAX_VALUE - right)) {
				// ArithmeticException���� ����
				throw new ArithmeticException("�����÷ο� �߻�");
			}
		} else {
			if (left < (Integer.MIN_VALUE - right)) {
				throw new ArithmeticException("�����÷ο� �߻�");
			}
		}
		return left + right;
	}
}
