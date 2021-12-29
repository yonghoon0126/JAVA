package Test;

//����(Sort)

//o ���� : �����͸� ������� ����(��������, ��������)
//o ������ ���� : �������� ���̱� ���� -> ��������...�˻��ϱ� ����
//o ������ ���� : ��������, ��������, ��������, ������, ������...
//
//���)
//Source Data : 52 42 12 62 50
//Sorted Data : 12 42 50 52 62	// (��������)

public class test02_BubbleSort {

	public static void main(String[] args) {

		// ���� ����
		int a[] = { 52, 42, 12, 62, 50 };
		int i, j, temp;

		// ���
		// Source Date : 52 42 12 62 50
		System.out.print("Source Date : ");
		dataDisp(a);
		System.out.println();
		
		// ���� ����
		for (i = 0; i < a.length - 1; i++) {
			for (j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) { // �������� ����
					// ^
//					a[j] = a[j] ^ a[j+1];
//					a[j+1] = a[j] ^ a[j+1];
//					a[i] = a[j] ^ a[j+1];

					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		// Sorted Data : 12 42 50 52 62 ������ ���
		System.out.print("Sorted Date : ");
		dataDisp(a);
	}

	static void dataDisp(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%4d", a[i]);
		}
	}
}
