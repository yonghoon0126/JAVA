package thisEx11;

import java.io.IOException;

public class KeyboardToStringExample {

	public static void main(String[] args) throws IOException {

		byte bytes[] = new byte[100];
		// 읽은 바이트를 저장하기 위한 배열 생성
		
		System.out.print("입력 : ");
		int readByteNo = System.in.read(bytes);
		// 배열에 읽은 바이트를 저장하고 읽은 바이트수를 리턴
		
		String str = new String(bytes, 0, readByteNo-2);
		// -2를 한 이유 : 엔터(캐리지 리턴 + 라인피드)에 2byte가 필요하기 때문에
		
		System.out.println(str);
	}

}
