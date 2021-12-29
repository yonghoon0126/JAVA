package thisEx11;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {

	public static void main(String[] args) {

		String str = "�ȳ��ϼ���";	// 5 * 2

		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length : " + bytes1.length);	// 10 = 5 * 2
		String str1 = new String(bytes1);
		System.out.println("bytes1 -> String : " + str1);	// �ȳ��ϼ���

		
		try {

			byte[] bytes2 = str.getBytes("EUC-KR");	// 2����Ʈ
			System.out.println("bytes1.length : " + bytes1.length);	// 10 = 5 * 2
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("bytes2 -> String : " + str2);	// �ȳ��ϼ���

			byte[] bytes3 = str.getBytes("UTF-8");	// 3����Ʈ
			System.out.println("bytes3.length : " + bytes3.length);	// 15 = 3 * 5
			String str3 = new String(bytes3, "UTF-8");
			System.out.println("bytes3 -> String : " + str3);	// �ȳ��ϼ���

			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}
