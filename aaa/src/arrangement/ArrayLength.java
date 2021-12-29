package arrangement;

import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		기본형 배열로 선언하면 필드값의 초기값과 같은 값으로 초기화됨
//		객체형 배열로 선언하면 null로 초기화 됨
		
//		 1)선언, 메모리할당, 디폴트초기화
//		 int intArray[] = new int[5];
//		 int intArray[0] = 20;	// 초기화
//		
//		 2)
//		 int intArray[];	// 선언
//		 intArray = new int[5];	// 메모리할당, 디폴트초기화
//		 intArray[0] = 20;	// 초기화
//		
//		 3) 선언, 메모리할당, 초기화
//		 int intArray[] = {10, 20, 30, 40, 50};
//		
//		 4) 선언, 메모리할당과 초기화
		 int intArray[];
		 intArray = new int[] {10, 20, 30, 40, 50};
		
		double sum = 0;

		// 최대값, 최소값 구하기
		int max = 0; // 가장 작은 값으로 초기화 max < 비교대상 ==> max
		// max 초기값을 가장 작게 해야 입력값들이 max값으로 됨
		// 비교대상값이 max값 보다 커야 max
		int min = 999; // 가장 큰 값으로 초기화 min > 비교대상 ==> min
		// min 초기값을 가장 크게 해야 입력값들이 min값으로 됨
		// 비교대상값이 min값 보다 작아야 min

		for (int i = 0; i < intArray.length; i++) {
			System.out.println("intArray[" + i + "] = " + intArray[i]); // 초기값 출력
		}

		System.out.println("숫자 5개를 입력하세요.");
		System.out.println();

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = sc.nextInt();
			sum += intArray[i];
		}

		for (int i = 0; i < intArray.length; i++) {
			System.out.println("intArray[" + i + "] = " + intArray[i]); // 입력값 출력

			if (intArray[i] > max)
				// 최대값 =
				max = intArray[i];

			if (intArray[i] < min)
				// 최소값 =
				min = intArray[i];
		}
		System.out.println("최대값 = " + max);
		System.out.println("최소값 = " + min);
		System.out.println("배열 원소의 평균은" + sum / intArray.length + "입니다.");

	}

}
