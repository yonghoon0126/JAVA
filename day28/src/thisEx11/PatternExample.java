package thisEx11;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {

		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
//					  02�̰ų�010 - 3�ڸ��ų�4�ڸ� - 4�ڸ�
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);

		if(result) {
			System.out.println("���Խİ� ��ġ�մϴ�.");
		}else {
			System.out.println("���Խİ� ��ġ���� �ʽ��ϴ�.");
		}
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
//				\w+	@	\w+	\.	\w+	(\.\w+)?
		data = "angle@naver.com";
		result = Pattern.matches(regExp, data);
		
		if(result) {
			System.out.println("���Խİ� ��ġ�մϴ�.");
		}else {
			System.out.println("���Խİ� ��ġ���� �ʽ��ϴ�.");
		}
	}

}
