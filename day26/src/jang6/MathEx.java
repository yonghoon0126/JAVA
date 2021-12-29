package jang6;

public class MathEx {

	public static void main(String[] args) {

		double a = 2.78987434;
		int n = 1;
		
		System.out.println(n++ + " : " + Math.abs(a));			// 2.78987434
		
		System.out.println(n++ + " : + " + Math.ceil(2.7));		// �ø�	// +3.0
		System.out.println(n++ + " : - " + Math.ceil(2.7));		// �ø�	// -3.0
		
		System.out.println(n++ + " : + " + Math.floor(a));		// ����	// +2.0
		System.out.println(n++ + " : - " + Math.floor(a));		// ����	// -2.0
		
		System.out.println(n++ + " : " + Math.sqrt(9.0));		// ������	// 3.0
		System.out.println(n++ + " : " + Math.exp(1.5));		// ����	// 4.4816890703380645
		System.out.println(n++ + " : " + Math.rint(3.141592));	// ������ ����	// 3.0

		// ���밪 ���ϱ�
		System.out.println(Math.abs(a));	// 2.78987434
		System.out.println(Math.ceil(a));	// �ø�	// 3.0
		System.out.println(Math.floor(a));	// ����	// 2.0
		System.out.println(Math.sqrt(a));	// ������	// 1.670291693088366
		System.out.println(Math.exp(a));	// ����	// 16.278974057376946
		System.out.println(Math.rint(a));	// ������ ����	// 3.0
		
		// [1,45] ������ ���� �߻�
		System.out.println("�̹��� ����� ��ȣ��");
		for(int i = 0; i < 5; i++) {
			System.out.print(Math.round(1 + Math.random()*44) + " ");
		}
		System.out.println("�Դϴ�.");
	}

}
