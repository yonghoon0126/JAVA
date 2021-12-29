package jang6;

//	StringBuffer�� String ��ü�� �ѹ� ������� ���ڿ��� ���� �� �� ���� �Ͱ� �޸�
//	StringBuffer��ü�� ���ο� ���ڿ��� �����ϴ� ���� ũ���� ���۸� ���� �ִ� ���� �ٸ���
//	���ο� ���ڿ��� �����ϴ� ũ���� ���۸� ���� �ֱ� ������ ���� �� ���ڿ� ���� �ٲ� �� �ִ�
//	���� ���� ũ��� �ڵ� �����ȴ�. (�⺻ 16����Ʈ)

public class StringBufferEx {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("This");
		
		System.out.println(sb.hashCode());	// 292938459
		
		sb.append(" is pencil");	// ���ڿ� �����̱�
		System.out.println(sb);	// This is pencil

		sb.insert(7, " my");	// ���ڿ� ����	
		System.out.println(sb);	// This is my pencil
		
		sb.replace(8, 10, "your");	// ���ڿ� ��ġ	
		System.out.println(sb);	// This is your pencil
		
		sb.setLength(5);	// ��Ʈ�� ���� �� ���ڿ� ���� ����	
		System.out.println(sb);	// This
		System.out.println(sb.hashCode());	// 292938459

	}

}

