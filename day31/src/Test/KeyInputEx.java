package Test;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class KeyInputEx {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String src;
		System.out.println("자바 소스 파일이름을 입력하세요 >> ");

		// 파일Reader 생성 / in = null
		FileReader in = null;
		src = s.nextLine(); // 파일 읽어오기

		try {
			in = new FileReader(src);
			int c;

			// ()내에서 입력한 파일을 읽어서 화면에 출력하기
			while ((c = in.read()) != -1) { 
				System.out.print((char) c);
			}
			// 자원 반환
			in.close();
			s.close();

		} catch (IOException e) {
			System.out.println("입출력 오류");

		}

	}

}
