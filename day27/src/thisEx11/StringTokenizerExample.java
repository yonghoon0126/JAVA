package thisEx11;

//	* StringTokenizer 클래스는
//	문자열 파싱을 위한 정보를 제공하는 클래스로
//	파싱하고자 하는 문자열을 인자로 받아 생성하는데,
//	여기에서 파싱이란 하나의 문자열을 여러 문자열로
//	나누는 작업을 의미하게 되며, 이 때 나누는 단위가 되는 문자열을 
//	토근 이라고 한다.
//	
//	StringTokenizer 클래스를 사용하기 위해서는
//	java.util.*패키지의 StringTokenizer 클래스를 import 해야한다.
//	import java.util.StringTokenizer;
//	StringTokenizer클래스는 호환성을 유지하는 목적으로 
//	보관 유지되고 있으며 문자열을 파싱하기 위해서는
//	String 클래스의 split() 메소드나 java.util.regex패키지를
//	사용할 것을 권장한다.
//	
//	* 생성자
//	-원형
//	StrtingTokenzier(String str)
//	StrtingTokenzier(String str, String delim)
//	StrtingTokenzier(String str, String delim, boolean reurnDelims)
//	--> 주어진 문자열str을 단어로 분리하는 객체를 생성하며
//	공백문자는 delim에 포함된 문자로 처리한다.
//	만약 returnDelims가 true라면...공백문자도 단어로 처리한다.

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {

		String text = "홍길동/이수홍/박연수";

		// how1 : 전체 토큰 수를 얻어 for문으로 루핑
		StringTokenizer st = new StringTokenizer(text, "/");
		int countTokens = st.countTokens();	// 꺼내지 않고 남아있는 토큰의 수
		
		for (int i = 0; i < countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}

		
		System.out.println();

		
		// how2 : 남아 있는 토큰을 확인하고 while문으로 루핑
		st = new StringTokenizer(text, "/");
		
		while (st.hasMoreTokens()) {	// 남아있는 토큰이 있는지 여부
			String token = st.nextToken();
			System.out.println(token);
		}

	}

}
