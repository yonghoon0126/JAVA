package thisEx11;

import java.util.StringTokenizer;

public class StringSplitExample {

	public static void main(String[] args) {

		
		System.out.println("====Split=================");
		
		String text = "홍길동&이수홍,박연수,김자바-최명호";

		String[] names = text.split("&|,|-");	// & , -로 구분
		for (String name : names) {	// names값을 name으로 반복하여 출력

			System.out.println(name);
		}

		
		System.out.println("====StringTokenizer=================");
		
		
//		StringTokenizer st = new StringTokenizer(text, "/|&|,|-");	
													// / & , -로 구분
		StringTokenizer st = new StringTokenizer(text, "/&,-");	
													// / & , -로 구분 
		
		while (st.hasMoreTokens()) {	// 남아있는 토큰이 있는지 여부
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
