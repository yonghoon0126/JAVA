package jang_2;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.BindException;

public class InputExample {

	public static void main(String[] args) throws IOException {	
		// 입력장치(스트림) 생성하기 				2바이트 (1바이트)
		InputStreamReader rd = new InputStreamReader(System.in);

		try { // 에러 검사를 해서 에러가 없으면 아래문장을 처리함
				// catch문을 처리하지 않고 끝남
				// 에러가 있으면 아래문자 처리 하지 않고 catch 문장을 처리함
			while(true) {
				int a = rd.read();
				if (a == -1) // ctrl-z가 입력되면 read()는 -1을 리턴
					break; // 반복문자를 탈출해라
				System.out.println((char) a); //
			}
		} catch(BindException e) { // 에러가 있을 때 수행함
			System.out.println("입력 에러 발생" + e.getStackTrace());
		} catch(IOException e) { // 에러가 있을 때 수행함
			System.out.println("입력 에러 발생" + e.getStackTrace());
		} catch(Exception e) { // 에러가 있을 때 수행함
			System.out.println("입력 에러 발생" + e.getStackTrace());
		}
	}
}
