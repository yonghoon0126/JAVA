package Test;

//����(Sort)

//o ���� : �����͸� ������� ����(��������, ��������)
//o ������ ���� : �������� ���̱� ���� -> ��������...�˻��ϱ� ����
//o ������ ���� : ��������, ��������, ��������, ������, ������...
//
//���)
//Source Data : 52 42 12 62 50
//Sorted Data : 12 42 50 52 62	// (��������)

public class test03_SelectSort {

	public static void main(String[] args) {

		int a[] = { 52, 42, 12, 62, 50 };
		int i, j, temp;
		System.out.print("Source Date : ");
		// Source Data : 52 42 12 62 50 ���
		for (i = 0; i < a.length; i++) {
			System.out.printf("%4d", a[i]);
		}

		// ���� ����
		for(i = 0; i < a.length-1; i++) {
			for(j = i + 1; j < a.length; j++) {
				if(a[i] > a[j]) {	// �ڸ���ġ ����
					// ^
					a[j] = a[j] ^ a[j];
					a[j] = a[j] ^ a[j];
					a[i] = a[j] ^ a[j];

					temp	= a[i];
					a[i]	= a[j];
					a[j]	= temp;
				}
				// Sorted Data : 12 42 50 52 62 ������ ���
				System.out.print("Sorted Date : ");
				for(int n : a) 
					System.out.print(n + " ");
			}
		}
	}
}