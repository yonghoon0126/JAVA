//�������� �����ϸ�
//javac HelloJava3.java
//java HelloJava3 "ȫ�浿" "100" //Ű����� �Է¹޴� ���� String����
public class HelloJava3 {
	// ��¹�, ���Ŀ��� '+'�����ڸ�(���Ῥ����) �˾ƺ���
	// "���ڿ�" + "���ڿ�" = "���ڿ�"
	// "���ڿ�" + ���� = "���ڿ�"
	// ���� + "���ڿ�" = "���ڿ�"
	// ���� + ���� 	= 	����
	// String str=20+"20" --> 2020
	// int	  num=20+20 ---> 40
	public static void main(String[] args) {
		System.out.println("�̸� : " + args[0]);
		System.out.println("���� : " + args[1]);
		System.out.print(20+20);
	}
}
