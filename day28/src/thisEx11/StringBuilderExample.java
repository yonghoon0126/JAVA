package thisEx11;

// ���μ��� : �������� ���α׷�
// ���μ��� : cpu, ó����

public class StringBuilderExample {

	public static void main(String[] args) {

		String str = "abc";
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.hashCode());
		System.out.println(str.hashCode());
		
		// append = ���ڿ� ���� �߰�
		sb.append("JAVA "); 
		sb.append("Program Strudy");
		System.out.println(sb.toString());	// JAVA Program Strudy

		// insert = ���ڿ��� ���ڿ�("")����
		sb.insert(4, "2");
		System.out.println(sb.toString());	// JAVA2 Program Strudy

		// setCharAt = ���ڿ��� ����('')����
		sb.setCharAt(4, '6');
		System.out.println(sb.toString());	// JAVA6 Program Strudy

		// replace = ���ڿ��� ���ڿ�("")��ü
		sb.replace(6, 13, "Book");
		System.out.println(sb.toString());	// JAVA6 BookStrudy

		// delete = ���ڿ����� ���° ���� ����
		sb.delete(4, 5);
		System.out.println(sb.toString());	// JAVA BookStrudy
		
		// length = �� ���ڿ� �� 
		int length = sb.length();
		System.out.println("�ѹ��ڼ� : " + length);	// �ѹ��ڼ� : 16

		String result = sb.toString();
		System.out.println(result);	// JAVA BookStrudy

		str = str + "def";
		System.out.println(sb.hashCode());
		System.out.println(str.hashCode());
		
		
	}

}
