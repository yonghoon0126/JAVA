package thisEx11;

//	* StringTokenizer Ŭ������
//	���ڿ� �Ľ��� ���� ������ �����ϴ� Ŭ������
//	�Ľ��ϰ��� �ϴ� ���ڿ��� ���ڷ� �޾� �����ϴµ�,
//	���⿡�� �Ľ��̶� �ϳ��� ���ڿ��� ���� ���ڿ���
//	������ �۾��� �ǹ��ϰ� �Ǹ�, �� �� ������ ������ �Ǵ� ���ڿ��� 
//	��� �̶�� �Ѵ�.
//	
//	StringTokenizer Ŭ������ ����ϱ� ���ؼ���
//	java.util.*��Ű���� StringTokenizer Ŭ������ import �ؾ��Ѵ�.
//	import java.util.StringTokenizer;
//	StringTokenizerŬ������ ȣȯ���� �����ϴ� �������� 
//	���� �����ǰ� ������ ���ڿ��� �Ľ��ϱ� ���ؼ���
//	String Ŭ������ split() �޼ҵ峪 java.util.regex��Ű����
//	����� ���� �����Ѵ�.
//	
//	* ������
//	-����
//	StrtingTokenzier(String str)
//	StrtingTokenzier(String str, String delim)
//	StrtingTokenzier(String str, String delim, boolean reurnDelims)
//	--> �־��� ���ڿ�str�� �ܾ�� �и��ϴ� ��ü�� �����ϸ�
//	���鹮�ڴ� delim�� ���Ե� ���ڷ� ó���Ѵ�.
//	���� returnDelims�� true���...���鹮�ڵ� �ܾ�� ó���Ѵ�.

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {

		String text = "ȫ�浿/�̼�ȫ/�ڿ���";

		// how1 : ��ü ��ū ���� ��� for������ ����
		StringTokenizer st = new StringTokenizer(text, "/");
		int countTokens = st.countTokens();	// ������ �ʰ� �����ִ� ��ū�� ��
		
		for (int i = 0; i < countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}

		
		System.out.println();

		
		// how2 : ���� �ִ� ��ū�� Ȯ���ϰ� while������ ����
		st = new StringTokenizer(text, "/");
		
		while (st.hasMoreTokens()) {	// �����ִ� ��ū�� �ִ��� ����
			String token = st.nextToken();
			System.out.println(token);
		}

	}

}
