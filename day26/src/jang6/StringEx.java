package jang6;

public class StringEx {

	public static void main(String[] args) {

		String a = new String(" abcd");
		String b = new String(",efg");
		System.out.println("변경 전 A : " + a.hashCode());

		// 문자열 연결
		a = a.concat(b);
		System.out.println("변경 후 A : " + a.hashCode());
		System.out.println(a);	// _abcd,efg

		// 공백 제거
		a = a.trim();
		System.out.println(a);	//abcd,efg

		// 문자열 대치
		a = a.replace("ab", "12");
		System.out.println(a);	// 12cd,efg	// ab대신에 12

		// 문자열 분리
		String s[] = a.split(",");
		for (int i = 0; i < s.length; i++)
			System.out.println("분리된" + i + "번 문자열 : " + s[i]);
//			분리된0번 문자열 : 12cd
//			분리된1번 문자열 : efg

		// 서브 스트링
		a = a.substring(3);	// 3번째 부터 끝까지
		System.out.println(a);	// d,efg

		// 문자열의 문자
		char c = a.charAt(2);
		System.out.println(c);	// e
		
//=======================================================================		

		// 내이름 넣기
		String name = "김용훈,";	
		
		// 김용훈 안녕하세요. // concat()을 사용해서, 출력
		name = name.concat("안녕하세요");
		System.out.println(name);
		
		// charAt() // '안'을 출력
		char nm = name.charAt(4);
		System.out.println(nm);
		
		// subString()	// '안녕하세요'를 출력
		name = name.substring(4);
		System.out.println(name);
		
		// indexof()	// 이름의 끝자의 인덱스를 출력
//		name = name.indexOf('훈');
		System.out.println(name.indexOf("훈"));
		
		// spilt()
		// name[0] = 김용훈님
		// name[1] = 안녕하세요
		String n[] = name.split(",");
		for(int i = 0; i < n.length; i++)
			System.out.println("name + ["+i+"] : " + n[i]);
	}
	
		
	
	
	
	
	
}
