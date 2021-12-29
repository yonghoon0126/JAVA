package thisEx02;

public class FromIntToFloat {

	public static void main(String[] args) {

		int num1 = 123456780;
		int num2 = 123456780;
		// int를 float로 변환 시 값 손실 = 쓰레기값 출력
		/*
		 * float num3 = num2; //~.0000 num2 = (int) num3; //~ // 123456780- num2 = (int)
		 * num3; // ~ // 123456780- int result = num1 - num2;
		 */
		
		// double형으로 변환 시 값 보존
		double num3 = num2; // ~.0000
		num2 = (int) num3; // ~
		// 				123456780-
		int result = num1 - num2;
		System.out.println(result);

		// 둘 다 4byte지만 int와 float의 정수범위가 다르기 때문에 값이 0이 안나온다.
	}
}
