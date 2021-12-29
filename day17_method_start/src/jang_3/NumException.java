package jang_3;

public class NumException {

	public static void main(String[] args) {
		String[] stringNumber = { "23", "12", "998", "3.141592" };

		try {
			
			for (int i = 0; i < stringNumber.length; i++) {
				int j = Integer.parseInt(stringNumber[i]);
				System.out.println("숫자로 변환된 값은 " + j);
			}
		} catch (NumberFormatException e) {	
			// 문자열이 나타내는 숫자와 일치하지 않는 타입의 숫자로 변환 시 발생
			
			System.out.println("정수로 변환할 수 없습니다.");
		}
	}

}
