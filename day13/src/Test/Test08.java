package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//문제8)
//임의의 정수 입력 : 12
//12 ==> 양수
//
//임의의 정수 입력 : -12
//-12 ==> 음수
//
//임의의 정수 입력 : 0
//0 ==> 영

public class Test08 {

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a;
		String str;

		while (true) {

			System.out.println("임의의 정수 입력 : ");
			a = Integer.parseInt(br.readLine());

			str = (a < 0) ? "음수" : (a > 0) ? "양수" : "영";

			System.out.println(a + " ==> " + str);

			if (a == 0) {
				System.out.println("끝");
				break;
			}
		}

	}
}
