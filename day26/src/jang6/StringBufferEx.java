package jang6;

//	StringBuffer는 String 객체가 한번 만들어진 문자열을 수정 할 수 없는 것과 달리
//	StringBuffer객체는 내부에 문자열을 저장하는 가변 크기의 버퍼를 갖고 있는 점이 다르다
//	내부에 문자열을 저장하는 크기의 버퍼를 갖고 있기 때문에 생성 후 문자열 값을 바꿀 수 있다
//	내부 버퍼 크기는 자동 조절된다. (기본 16바이트)

public class StringBufferEx {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("This");
		
		System.out.println(sb.hashCode());	// 292938459
		
		sb.append(" is pencil");	// 문자열 덧붙이기
		System.out.println(sb);	// This is pencil

		sb.insert(7, " my");	// 문자열 삽입	
		System.out.println(sb);	// This is my pencil
		
		sb.replace(8, 10, "your");	// 문자열 대치	
		System.out.println(sb);	// This is your pencil
		
		sb.setLength(5);	// 스트링 버퍼 내 문자열 길이 설정	
		System.out.println(sb);	// This
		System.out.println(sb.hashCode());	// 292938459

	}

}

