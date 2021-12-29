package jang6;

public class StringEx {

	public static void main(String[] args) {

		String a = new String(" abcd");
		String b = new String(",efg");
		System.out.println("���� �� A : " + a.hashCode());

		// ���ڿ� ����
		a = a.concat(b);
		System.out.println("���� �� A : " + a.hashCode());
		System.out.println(a);	// _abcd,efg

		// ���� ����
		a = a.trim();
		System.out.println(a);	//abcd,efg

		// ���ڿ� ��ġ
		a = a.replace("ab", "12");
		System.out.println(a);	// 12cd,efg	// ab��ſ� 12

		// ���ڿ� �и�
		String s[] = a.split(",");
		for (int i = 0; i < s.length; i++)
			System.out.println("�и���" + i + "�� ���ڿ� : " + s[i]);
//			�и���0�� ���ڿ� : 12cd
//			�и���1�� ���ڿ� : efg

		// ���� ��Ʈ��
		a = a.substring(3);	// 3��° ���� ������
		System.out.println(a);	// d,efg

		// ���ڿ��� ����
		char c = a.charAt(2);
		System.out.println(c);	// e
		
//=======================================================================		

		// ���̸� �ֱ�
		String name = "�����,";	
		
		// ����� �ȳ��ϼ���. // concat()�� ����ؼ�, ���
		name = name.concat("�ȳ��ϼ���");
		System.out.println(name);
		
		// charAt() // '��'�� ���
		char nm = name.charAt(4);
		System.out.println(nm);
		
		// subString()	// '�ȳ��ϼ���'�� ���
		name = name.substring(4);
		System.out.println(name);
		
		// indexof()	// �̸��� ������ �ε����� ���
//		name = name.indexOf('��');
		System.out.println(name.indexOf("��"));
		
		// spilt()
		// name[0] = ����ƴ�
		// name[1] = �ȳ��ϼ���
		String n[] = name.split(",");
		for(int i = 0; i < n.length; i++)
			System.out.println("name + ["+i+"] : " + n[i]);
	}
	
		
	
	
	
	
	
}
