package jang7;

import java.util.Arrays;

public class BinarySearchEx {

	public static void main(String[] args) {

		// �̺а˻� : ������ �ݵ�� �˻����� ������������ ������ �Ǿ� �־����.
		// �߰���ġ�� �������� ã��
		int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		
		// �迭 ������������ ����
//		Arrays.sort(arr);
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
//		System.out.println();
		
		
		int low = 0; // ��ó�� ��ġ
		int high = arr.length - 1; // �ǳ� ��ġ
		int mid; // �߰� ��ġ
		int index = -1; // �� ã���� ��
		int sd = 70; // ã�� ��

		System.out.println("arr.length�� �� : " + arr.length);
		System.out.println("high�� �� : " + (arr.length - 1));
		System.out.println("(low + high)/2 = mid�� �� : " + ((low + high) / 2));

		while (low <= high) {
			mid = (low + high) / 2;
			if (sd == arr[mid]) {	// ã�Ҵ�.
				index = mid;
				break;
			} else if (sd > arr[mid]) { // ã�°� > �߰���ġ��
				low = mid + 1; // ã�� ���� ũ�� �߰���ġ +1��ŭ �ּ���ġ �־���
			} else {
				high = mid - 1;	// ã�� ���� ũ�� �߰���ġ -1��ŭ �ּ���ġ �־���
			}
		} // while
		if (index == -1) {
			System.out.println("ã�� �����߽��ϴ�.");
		} else {
			System.out.println("�˻��� 70�� index = " + index);
		}

	}

}
