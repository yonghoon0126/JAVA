package test;
// ��ȯ���� �ְ� �Ű������� ���� �� �޼ҵ� ����
public class MethodEx04 {

	public static void main(String[] args) {
		int num1 = 10, num2 = 20;
		
		// �޼ҵ� ȣ�� sum()
		int result = sum(num1 , num2);
		System.out.println("�� = " + result);
		
		
	}
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	
}
