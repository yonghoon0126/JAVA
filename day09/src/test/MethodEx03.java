package test;
// ��ȯ�� �ְ� �Ű����� ���� �� �޼ҵ� ����
public class MethodEx03 {

	public static void main(String[] args) {
		// ���� ����
		// �޼ҵ� ȣ�� disp()
		int tot = disp();	// 3 1~3�ڷ� Ÿ���� �¾ƾ� ��
		System.out.println("�� = " + tot);
		
	}
	// �޼ҵ� ����
	public static int disp() {	// 2
		int num1 = 10;
		int num2 = 20;
		return num1 + num2;	// 1
		
	}
	
	
}
