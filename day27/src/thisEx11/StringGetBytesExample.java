package thisEx11;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {

	public static void main(String[] args) {

		String str = "안녕하세요";	// 5 * 2

		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length : " + bytes1.length);	// 10 = 5 * 2
		String str1 = new String(bytes1);
		System.out.println("bytes1 -> String : " + str1);	// 안녕하세요

		
		try {

			byte[] bytes2 = str.getBytes("EUC-KR");	// 2바이트
			System.out.println("bytes1.length : " + bytes1.length);	// 10 = 5 * 2
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("bytes2 -> String : " + str2);	// 안녕하세요

			byte[] bytes3 = str.getBytes("UTF-8");	// 3바이트
			System.out.println("bytes3.length : " + bytes3.length);	// 15 = 3 * 5
			String str3 = new String(bytes3, "UTF-8");
			System.out.println("bytes3 -> String : " + str3);	// 안녕하세요

			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}
