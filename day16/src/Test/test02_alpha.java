package Test;
//문제2)

//char자료형의 배열과 알파벳 대문자를 채우고
//채워진 배열의 전체 요소를 출력하시오
//단, char자료형의 배열을 구성하는 과정에서
//반복문을 통해 초기화 시킬 수 있도록 하시오
//
//출력)
//A B C D E.......Z
//char 65~90

public class test02_alpha {

	public static void main(String[] args) {

		char alpha[] = new char[26];

		for (int i = 0; i < alpha.length; i++) {
			alpha[i] = (char) (65 + i);
		}
		for (int i = 0; i < alpha.length; i++) {
			System.out.printf("%2c", alpha[i]);
			System.out.print(alpha[i] + " ");
		}
	}
}
