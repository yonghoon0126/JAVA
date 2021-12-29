package thisEx11;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {

		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
//					  02이거나010 - 3자리거나4자리 - 4자리
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);

		if(result) {
			System.out.println("정규식과 일치합니다.");
		}else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
//				\w+	@	\w+	\.	\w+	(\.\w+)?
		data = "angle@naver.com";
		result = Pattern.matches(regExp, data);
		
		if(result) {
			System.out.println("정규식과 일치합니다.");
		}else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
	}

}
