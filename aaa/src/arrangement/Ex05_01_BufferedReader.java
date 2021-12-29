package arrangement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05_01_BufferedReader {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 키보드 생성(Scanner) int, String
		// 키보드로 입력받기

		int a = 0;
		// 스캐너 이용하기
		// Scanner sc = new Scanner(System.in);

		// 버퍼 이용하기
		BufferedReader br = new BufferedReader
				(new InputStreamReader(System.in));

		System.out.println("수 입력 : ");

		// a = sc.nextInt();
		// a = Integer.parseInt(sc.nextInt());
		a = Integer.parseInt(br.readLine());	// String --> Integer --> 기본형
		//		 a = br.readLine(); // ==> String일 때
		if (a < 100) 
			System.out.println("100보다 작군요 ..\n");
		else 
			System.out.println("100보다 크군요 ..\n");
		// 거짓일때도 처리
	}
}