package Test;

//정렬(Sort)

//o 정렬 : 데이터를 순서대로 나열(오름차순, 내림차순)
//o 정렬의 목적 : 가독성을 높이기 위함 -> 보기좋게...검색하기 위함
//o 정렬의 종류 : 선택정렬, 버블정렬, 삽입정렬, 힙정렬, 쉘정렬...
//
//출력)
//Source Data : 52 42 12 62 50
//Sorted Data : 12 42 50 52 62	// (오름차순)

public class test03_SelectSort {

	public static void main(String[] args) {

		int a[] = { 52, 42, 12, 62, 50 };
		int i, j, temp;
		System.out.print("Source Date : ");
		// Source Data : 52 42 12 62 50 출력
		for (i = 0; i < a.length; i++) {
			System.out.printf("%4d", a[i]);
		}

		// 선택 정렬
		for(i = 0; i < a.length-1; i++) {
			for(j = i + 1; j < a.length; j++) {
				if(a[i] > a[j]) {	// 자리위치 변경
					// ^
					a[j] = a[j] ^ a[j];
					a[j] = a[j] ^ a[j];
					a[i] = a[j] ^ a[j];

					temp	= a[i];
					a[i]	= a[j];
					a[j]	= temp;
				}
				// Sorted Data : 12 42 50 52 62 나오게 출력
				System.out.print("Sorted Date : ");
				for(int n : a) 
					System.out.print(n + " ");
			}
		}
	}
}