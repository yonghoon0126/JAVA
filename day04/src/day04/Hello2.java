package day04;

public class Hello2 {
	//�޼ҵ� ����
//���������� ������ ��ȯ�� �޼ҵ��(�μ�Ÿ�� ������)
	public static int sum(int n, int m) {//���� ���� �ڷ�Ÿ��
		return n+m;
	}
	public static void main(String[] args) {
		System.out.println(args[0]+args[1]);
		int i=20;
		int s;
		char a;
		s=sum(i,10);//�ڷ�Ÿ�� �´� ���� �����ؾ� ��
		a='?';
		System.out.println((int)a);
		System.out.println("Hello2");
		System.out.println(s);

	}

}
