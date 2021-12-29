package Test;

import java.util.Scanner;

//문제8) 임의 문자열을 사용자로부터 입력 받아 아래와 같이 출력하시오
//출력)
//글자를 입력 : 배수만 출력
//
//입력한 문자열 : 배수만 출력
//거꾸로 문자열 : 력출 만수배

public class test08_length {

	public static void main(String[] args) {

		String str;
		int n;

		Scanner s = new Scanner(System.in);
		System.out.print("글자를 입력 : ");
		str = s.nextLine();

		System.out.printf("\n");
		System.out.printf("입력한 문자열 ==> %s\n", str);
		System.out.printf("변환된 문자열 ==> ");

		n = str.length();
		for (int i = n - 1; i >= 0; i--) {
			System.out.printf("%c", str.charAt(i));
		}

		// String str = "배수만 출력"; // 문자열의 길이 : 문자열.length();
		// // char[] c = str; // c[0] = '배', c[1]='수', c[2]='만'
		// int n = str.length(); // 6
		// // 0 ~ 2
		// for(int i = 0; i < n; i++) {
		// System.out.print(str.charAt(i));
		// } // 3 ; 3 >
		// System.out.println();
		// for(int i = n; i >= 1; i--) {
		// System.out.print(str.charAt(i-1));
		// }

	}

}
