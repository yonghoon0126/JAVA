package jang_3;

public class ArrayException {

	public static void main(String[] args) {
		int intArray[] = new int[5];
		intArray[0] = 0;

		try {
			for (int i = 0; i < 5; i++) {
				intArray[i + 1] = i + 1 + intArray[i];
				System.out.println("intArray[" + i + "]" + " = " + intArray[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {	// 배열의 범위를 벗어난 접근 시 발생
			System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
			System.out.println(e.getMessage());	// 에러 메세지
			System.out.println(e.getStackTrace());	// 에러 경로 찾을 때 
		}

	}

}
