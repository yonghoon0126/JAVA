package innerClass;

//	3. Local class

public class LocalClass {

	int a = 100;

//==========================================================================	

	public void innerTest(int k) {	// �޼ҵ� ����

		// fianl ��������(JDK1.8���� ��������, ���� ������ �� final�� ��� ��)
		int b = 200; // == final int b = 200;
		final int c = k;

		
		class localInner {	// ���� ���� Ŭ���� ����

			// ���, ��������
			// ���� Ŭ������ ������ �޼ҵ峻�� ���ǵ� �������� ����
			public void getData() {
				System.out.println("int a = " + a);
				System.out.println("int b = " + b); // 1.8���� ����
				System.out.println("final int c = " + c);

				// �������� ����� �� ����
				System.out.println("method() = " + method()); // 1.8����

			} // getData()
		}
		; // localInner

		localInner i = new localInner(); // ������ �޼ҵ� ���� ���� ����
		i.getData();
	} // innerTest �޼ҵ� ����

//==========================================================================	
	
	public int method() {

		int m = 2;
		return m;
	}

//==========================================================================	

	public static void main(String[] args) {

		LocalClass outer = new LocalClass(); // �ܺ�Ŭ���� ��ü ����
		outer.innerTest(1000); // �ܺ�Ŭ���� method ȣ��

	}

}
