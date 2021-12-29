package this04;

public class ContinueExample {
	public static void main(String[] args) {

		// int i = 0;
		// for (i = 1; i <= 10; i++) {
		// if (i % 2 != 0) {
		// continue;
		//
		// }
		// System.out.println(i);
		// }

		// -----------------------------------------------------------

		// 1 ~ 10까지 4의 배수를 출력하고, 4의 배수의 합을 출력하세요

		// int i = 0;
		// int sum = 0;
		// String str = "";
		//
		// for (i = 1; i <= 10; i++) {
		// if (i % 4 == 0) { // 4, 8
		// sum += i;
		// str += " " + i;
		// }
		// if (i % 2 != 0) { // 홀수
		// continue;
		// }
		// System.out.println(i + "");
		// }
		// System.out.printf("4의 배수 = %s%n", str);
		// System.out.printf("4의 배수의 합 = %d", +sum);

		// -------------------------------------------------------------------

		// 1~10까지 수 중에서 짝수, 홀수를 출력하고, 각각 합/전체합을 구하고
		// 각각의 평균/전체평균을 구하시오.

		int odd = 0, even = 0, i = 0; // i는 평균을 구하기 위한 전체 개수
		int oCount = 0, eCount = 0; // 평균을 구하기 위한 갯수 구하기
		String oStr = "홀수", eStr = "짝수"; // 홀짝을 출력할 초기값

		for (i = 1; i <= 10; i++) {

			if (i % 2 != 0) { // 홀수
				odd += i; // 홀수의 합
				oStr += " " + i; // 홀수 1 3 5 7 9
				oCount++; // 홀수 갯수
				continue;
			}
			System.out.print(i + " ");
			even += i; // 짝수합
			eCount++; // 짝수 갯수
			eStr += " " + i; // 짝수 2 4 6 8 10
		}
		System.out.println("\n" + oStr);
		System.out.println(eStr);
		System.out.println("\n1 ~ 10 홀수의 합 = " + odd);
		System.out.println("\n1 ~ 10 짝수의 합 = " + even);
		System.out.println("\n1 ~ 10 까지의 합 = " + (odd + even));

		System.out.println("\n1 ~ 10 까지의 홀수의 평균 = " + odd / oCount);
		System.out.println("\n1 ~ 10 까지의 짝수의 평균 = " + even / eCount);
		System.out.println("\n1 ~ 10 까지의 평균 = " + (even + odd) / (i - 1));
	}
}













