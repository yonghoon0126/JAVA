package thisEx11;

public class StringIndexOfExample {

	public static void main(String[] args) {

		System.out.println("====IndexOf===============================");
		System.out.println();
		
		//IndexOf
		String subject = "자바 프로그래밍";

		int location = subject.indexOf("프로그래밍"); // 자바 프로그래밍의 3번째
		System.out.println(location);

		if (subject.indexOf("자바") != -1) { // indexOf에서 값이 없으면 -1
			// 문자열에서 "자바"가 있다면(없는게 아니라면)

			System.out.println("자바와 관련된 책이군요.");
		} else {
			System.out.println("자바와 관련없는 책이군요.");
		}

		
		System.out.println();
		System.out.println("====Length===============================");
		System.out.println();

		// Length
		String ssn = "7306241230123";

		int length = ssn.length();
		if (length == 13) {
			System.out.println("주민번호 자리수가 맞습니다.");
		} else {
			System.out.println("주민번호 자리수가 틀립니다.");
		}

		
		System.out.println();
		System.out.println("====replace===========================");
		System.out.println();

		// replace
		String oldStr = "자바는 객체지향언어 입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "JAVA"); // 자바 -> JAVA로 바꿈

		System.out.println(oldStr);
		System.out.println(newStr);
		System.out.println("전oldStr.hashCode() =  " + oldStr.hashCode());
		System.out.println("newStr.hashCode() =  " + newStr.hashCode());

		oldStr = oldStr.replace("자바", "JAVA");
		System.out.println("후oldStr.hashCode() =  " + oldStr.hashCode());

		
		System.out.println();
		System.out.println("====subString===========================");
		System.out.println();

		// subString
		String firstNum = ssn.substring(0, 6); // 0 ~ 6까지 추출
		System.out.println(firstNum);

		String secondNum = ssn.substring(7); // 7부터 추출
		System.out.println(secondNum);

		
		System.out.println();
		System.out.println("====ToLowerUpperCase===========================");
		System.out.println();

		// ToLowerUpperCasae
		String str1 = "Java Programing";
		String str2 = "JAVA PROGRAMING";

		System.out.println(str1.equals(str2));

		String lowerStr1 = str1.toLowerCase();	// str1을 소문자로 바꿈
		String lowerStr2 = str2.toLowerCase();	// str2를소문자로 바꿈
		System.out.println(lowerStr1.equals(lowerStr2));

		System.out.println(str1.equalsIgnoreCase(str2));	// 대소문자 상관없이 같은지
		System.out.println(str1.toUpperCase());	// str1을 대문자로 바꿈
	
		
		System.out.println();
		System.out.println("====Trim===========================");
		System.out.println();
		
		// Trim
		String tel1 = "  02";
		String tel2 = "123    ";
		String tel3 = "    1234     ";
		
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
					// tel1공백지움 + tel2공백지움 + tel3공백지움
		System.out.println(tel);
		
		
		System.out.println();
		System.out.println("====ValueOf===========================");
		System.out.println();
		
		
		// ValueOf = String에 저장된 값을 보관(저장)
		str1 = String.valueOf(10);
		str2 = String.valueOf(10.5);
		String str3 = String.valueOf(true);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		
		
		
		
	}
}
