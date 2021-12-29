package thisEx11;

// 프로세스 : 실행중인 프로그램
// 프로세서 : cpu, 처리기

public class StringBuilderExample {

	public static void main(String[] args) {

		String str = "abc";
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.hashCode());
		System.out.println(str.hashCode());
		
		// append = 문자열 끝에 추가
		sb.append("JAVA "); 
		sb.append("Program Strudy");
		System.out.println(sb.toString());	// JAVA Program Strudy

		// insert = 문자열에 문자열("")삽입
		sb.insert(4, "2");
		System.out.println(sb.toString());	// JAVA2 Program Strudy

		// setCharAt = 문자열에 문자('')삽입
		sb.setCharAt(4, '6');
		System.out.println(sb.toString());	// JAVA6 Program Strudy

		// replace = 문자열에 문자열("")대체
		sb.replace(6, 13, "Book");
		System.out.println(sb.toString());	// JAVA6 BookStrudy

		// delete = 문자열에서 몇번째 문자 삭제
		sb.delete(4, 5);
		System.out.println(sb.toString());	// JAVA BookStrudy
		
		// length = 총 문자열 수 
		int length = sb.length();
		System.out.println("총문자수 : " + length);	// 총문자수 : 16

		String result = sb.toString();
		System.out.println(result);	// JAVA BookStrudy

		str = str + "def";
		System.out.println(sb.hashCode());
		System.out.println(str.hashCode());
		
		
	}

}
