package thisEx11;

public class StringIndexOfExample {

	public static void main(String[] args) {

		System.out.println("====IndexOf===============================");
		System.out.println();
		
		//IndexOf
		String subject = "�ڹ� ���α׷���";

		int location = subject.indexOf("���α׷���"); // �ڹ� ���α׷����� 3��°
		System.out.println(location);

		if (subject.indexOf("�ڹ�") != -1) { // indexOf���� ���� ������ -1
			// ���ڿ����� "�ڹ�"�� �ִٸ�(���°� �ƴ϶��)

			System.out.println("�ڹٿ� ���õ� å�̱���.");
		} else {
			System.out.println("�ڹٿ� ���þ��� å�̱���.");
		}

		
		System.out.println();
		System.out.println("====Length===============================");
		System.out.println();

		// Length
		String ssn = "7306241230123";

		int length = ssn.length();
		if (length == 13) {
			System.out.println("�ֹι�ȣ �ڸ����� �½��ϴ�.");
		} else {
			System.out.println("�ֹι�ȣ �ڸ����� Ʋ���ϴ�.");
		}

		
		System.out.println();
		System.out.println("====replace===========================");
		System.out.println();

		// replace
		String oldStr = "�ڹٴ� ��ü������ �Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�.";
		String newStr = oldStr.replace("�ڹ�", "JAVA"); // �ڹ� -> JAVA�� �ٲ�

		System.out.println(oldStr);
		System.out.println(newStr);
		System.out.println("��oldStr.hashCode() =  " + oldStr.hashCode());
		System.out.println("newStr.hashCode() =  " + newStr.hashCode());

		oldStr = oldStr.replace("�ڹ�", "JAVA");
		System.out.println("��oldStr.hashCode() =  " + oldStr.hashCode());

		
		System.out.println();
		System.out.println("====subString===========================");
		System.out.println();

		// subString
		String firstNum = ssn.substring(0, 6); // 0 ~ 6���� ����
		System.out.println(firstNum);

		String secondNum = ssn.substring(7); // 7���� ����
		System.out.println(secondNum);

		
		System.out.println();
		System.out.println("====ToLowerUpperCase===========================");
		System.out.println();

		// ToLowerUpperCasae
		String str1 = "Java Programing";
		String str2 = "JAVA PROGRAMING";

		System.out.println(str1.equals(str2));

		String lowerStr1 = str1.toLowerCase();	// str1�� �ҹ��ڷ� �ٲ�
		String lowerStr2 = str2.toLowerCase();	// str2���ҹ��ڷ� �ٲ�
		System.out.println(lowerStr1.equals(lowerStr2));

		System.out.println(str1.equalsIgnoreCase(str2));	// ��ҹ��� ������� ������
		System.out.println(str1.toUpperCase());	// str1�� �빮�ڷ� �ٲ�
	
		
		System.out.println();
		System.out.println("====Trim===========================");
		System.out.println();
		
		// Trim
		String tel1 = "  02";
		String tel2 = "123    ";
		String tel3 = "    1234     ";
		
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
					// tel1�������� + tel2�������� + tel3��������
		System.out.println(tel);
		
		
		System.out.println();
		System.out.println("====ValueOf===========================");
		System.out.println();
		
		
		// ValueOf = String�� ����� ���� ����(����)
		str1 = String.valueOf(10);
		str2 = String.valueOf(10.5);
		String str3 = String.valueOf(true);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		
		
		
		
	}
}
