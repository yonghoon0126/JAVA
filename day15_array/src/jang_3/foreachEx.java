package jang_3;

public class foreachEx {

	enum Week {��, ȭ, ��, ��, ��, ��, ��};

	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 4, 5 };
		String names[] = { "���", "��", "�ٳ���", "ü��", "����", "����" };
		int sum = 0;

		// �Ʒ� for-each���� i�� num[0], num[1], ..., num[4]�� �ݺ���
//		for (int i : num) 
//			sum += i;
//		System.out.println("���� " + sum);
		
		// �⺻�� for
		for(int i =0; i < num.length; i++) {
			sum = sum + num[i];
		}
		System.out.println("���� " + sum);
		
//====================================================================

		// �Ʒ� for-each���� s�� names[0], names[1], ..., names[5]�� �ݺ���
//		for (String s : names) 
//			System.out.println(s + " ");
//		System.out.println();	// "���", "��", "�ٳ���", "ü��", "����", "����"
		
		// �⺻�� for
		for(int i = 0;  i < names.length; i++) {
		System.out.print(i + " : " + names[i] + " ");
		}
		System.out.println();
		
		int i = 0;
		for (String s : names) 
			System.out.println((i++) + " : "  + s + " " );
		
//====================================================================
		
		// �Ʒ� for-each���� day�� ��, ȭ, ��, ��, ��, ��, �� ������ �ݺ���
//		for (Week day : Week.values()) 
//			System.out.println(day + "����");
//		System.out.println();
		
		String week;
		for(i = 0; i < Week.values().length; i++) {
			System.out.print(i + " : " + Week.values()[i] + " ");
		}
		System.out.println();
	}
}

