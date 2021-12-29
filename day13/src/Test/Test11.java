package Test;

import java.io.IOException;
import java.util.Scanner;

//문제11)
//사용자로부터 임의의 알파벳 한 문자를 입력받아,
//이를 판별하여 입력받은 알파벳이 모음일 경우만
//결과를 출력할 수 있는 프로그램을 작성한다
//
//단, 대소문자 모두  적용할 수 있도록 구현한다
//또한, 알파벳 이외의 문자가 입력 되었을 경우
//입력오류 처리할 수 있도록 한다.
//(System.in.read(), if문)
//출력)
//알파벳 한 문자 입력 : A
//모음 OK~!
//
//알파벳 한문자 입력 : e
//모음 OK~!
//
//알파벳 한문자 입력 : B
//자음입니다.
//
//알파벳 한문자 입력 : 1
//입력 오류

public class Test11 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		char ch;

		while(true) {

			System.out.println("알파벳 한 문자 입력 : ");

			ch = (char)System.in.read();
			// 이대로 출력하면 알파벳 한 문자 입력 : 이 3번 출력됨
			// 엔터를 입력으로 받을 때 4바이트
			// System.in.read로 입력받을 때는 1바이트
			// 그래서 따로 3바이트를 채워줘야함

			// System.in.skip(2);
			// 이거나
			// System.out.println();
			// System.out.println();

			if((ch >= 'A' & ch <= 'Z') || (ch >= 'a' & ch <= 'z') ) {
				if(ch == 'A'|| ch == 'E'|| ch == 'E'|| ch == 'O'|| ch == 'U'||
						ch == 'a'|| ch == 'e'|| ch == 'o'|| ch == 'u') {
					System.out.println("모음 OK~!");
				}else {
					System.out.println("자음입니다.");
				}

			}else if((ch >= '1' & ch <= '9') || (ch == '0')) {
				System.out.println("입력 오류.");

			}
		}

	}
}