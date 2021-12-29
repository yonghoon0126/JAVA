package Test;

//정렬(Sort)

//o 정렬 : 데이터를 순서대로 나열(오름차순, 내림차순)
//o 정렬의 목적 : 가독성을 높이기 위함 -> 보기좋게...검색하기 위함
//o 정렬의 종류 : 선택정렬, 버블정렬, 삽입정렬, 힙정렬, 쉘정렬...
//
//출력)
//Source Data : 52 42 12 62 50
//Sorted Data : 12 42 50 52 62	// (오름차순)

public class test02_BubbleSort {

	public static void main(String[] args) {

		// 버블 정렬
		int a[] = { 52, 42, 12, 62, 50 };
		int i, j, temp;

		// 출력
		// Source Date : 52 42 12 62 50
		System.out.print("Source Date : ");
		dataDisp(a);
		System.out.println();
		
		// 버블 정렬
		for (i = 0; i < a.length - 1; i++) {
			for (j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) { // 오름차순 정렬
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
		// Sorted Data : 12 42 50 52 62 나오게 출력
		System.out.print("Sorted Date : ");
		dataDisp(a);
	}

	static void dataDisp(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%4d", a[i]);
		}
	}
}
