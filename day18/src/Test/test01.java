package Test;

//����1) ������� ���� int���� �迭(������� ���� 5 : new�� �̿��ؼ� ��ü�� ����)
//���)
//a[0] = 0
//a[1] = 37
//a[2] = 51
//a[3] = 0
//a[4] = 74 ---> a[1] �߰��ؼ�

public class test01 {

	public static void main(String[] args) {

		int a[] = new int[5];

		a[0] = 0;
		a[1] = 37;
		a[2] = 51;
		a[3] = 0;
		a[4] = a[1] * 2;
		System.out.println("a[0] = " + a[0]);
		System.out.println("a[1] = " + a[1]);
		System.out.println("a[2] = " + a[2]);
		System.out.println("a[3] = " + a[3]);
		System.out.println("a[4] = " + a[4]);
		underline();

		for(int i = 0; i < a.length; i++) {
			System.out.printf("a[%d] = %d%n", i, a[i]);
		}
		underline();

		int n = 0;
		for(int i : a) {
			System.out.printf("a[%d] = %d%n", n++, i);
		}
		underline();

		System.out.println("�迭���� ����ϸ� �迭�� \n�����ּҰ� ��µ� : " + a);
		a = null;
		System.out.println("a = null�� ���(Gabage����� �ȴ�. JVM�� ������ : " + a);
		nullDisp(a);
		
	};	// main
	
	public static void underline() {
		System.out.println("..................................");

	};
	public static void nullDisp(int[] a) {
		System.out.println("a................" + a[0]);

	};
}
