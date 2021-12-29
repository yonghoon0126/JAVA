package thisEx11;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {

		char[] arr1 = { 'J', 'A', 'V', 'A' };

		// 방법1
		char[] arr2 = Arrays.copyOf(arr1, arr1.length); // 원본배열, 복사 할 배열길이
		System.out.println(Arrays.toString(arr2));

		// 방법2
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3); // 원본배열, 
		System.out.println(Arrays.toString(arr3));

		// 방법3
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
				// 원본배열, 몇번째부터시작, 복사할배열, 몇번째부터시작, 배열길이
		for (int i = 0; i < arr4.length; i++) {
			System.out.println("arr4[" + i + "] = " + arr4[i]);
		}

	}

}
