package jang7;

//	�Ǻθ� �Լ�(recursive function) : �ڱ� �ڽ��� �θ�
//	Stack : ���꿡 �߰� ��, �����, �Ű����� ��, �Ǻθ� �Լ����� �� ����, ������ ����
//	��ü�� �ּ�

public class FactorialText {

	private static int factorial(int n) {
		int result = 0;
		if(n == 1) {
			result = 1;
		}else {
			result = n * factorial(n-1);	//�Ǻθ� �Լ�, n*(n-1)*(n-2)...(n-4)
		}
		return result;
	}
	
	public static void main(String[] args) {

	}

}
