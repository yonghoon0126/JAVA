package day04;
//���������� ������ class Ŭ������{}
public class Test01 {
	//�������
	//���������� ������ �ڷ�Ÿ�� ������=�ʱⰪ;	//public static int a=10;
	//�⺻�� �ʱ�ȭ �Ǿ� ����.
	//�⺻��, �޸𸮴� �����Ϸ��� ũ�� ����,  ���ÿ���
	
	//���� 
	boolean b;//false ,1byte
	//������
	byte    by;//0 ,������ ǥ����, �̹���,����, �����󿡼� ��� ,1byte
	char    c;//' '//���� �ϳ�, 2byte, \u0000, ��ȣ�� ����
	short   sh;//0 c����ڸ� ���� �ڷ�Ÿ��  ,2byte //byte b=2; short sh= b+2;
	int     i;//0  �ڹٴ� ����Ÿ���̶�� �ϸ� ������ int���� ����  ,4byte
	long    l;//0  ȸ�迡�� ���� ���,8byte, long l=20L;
	//�Ǽ� 4,8   / ������ �Ǽ��߿� �Ǽ��� ǥ�������� ũ��, ���ӵ��� �Ǽ��� ������. 
	float   f;//0.0 , 4����Ʈ   float f=2.5;(x),float f=2.5f;(O),
	          // float f=(float)2.5;(O)--> '(�ڷ�Ÿ��)'�� ����ȯ=ĳ���ÿ����� 
	double  d;//0.0 , 8����Ʈ �Ǽ����� �⺻Ÿ��, double d=2.5;(O)
	//float�� ���� ������ �Ǽ� �ڿ��ٰ� f�ٿ��ߵ�,
	//�ƴϸ� double�� �⺻���̱� ������double�� �ν�
	
	
	//��ü��=������=�������� ����=���۷�����
	//������: String, Ŭ����, �������̽�, �迭, Enum(���������),��ü /Heep����
	//������ �� �޸� Ȯ��X, ����ÿ� �޸� Ȯ��
	//����Ҷ� new�����ڷ� ��ü ���� ���
	String str;//null: �ƹ��ּҵ� ����Ű�� ����, �ƹ����� ����
	
	//������ : ��ü�� ����, Ŭ�������� ����������� �ʱ�ȭ ���ִ� ������ �Ѵ�.
	public Test01(){
		System.out.println("���� ����Ʈ �����ھ�...");
	}//����Ʈ ������
	public static void main(String[] args) {

		//��ü ����
		// Ŭ������ ��ü������= new Ŭ������();
		//�ĺ��� : ����ڰ� �����ϴ� �̸�
		Test01 t=new Test01();
		System.out.println("--------�⺻��--------");	
		System.out.println("boolean b="+t.b);
		System.out.println("byte    by="+t.by);
		System.out.println("char    c="+t.c);
		System.out.println("short   sh="+t.sh);
		System.out.println("int     i="+t.i);
		System.out.println("long    l="+t.l);
		System.out.println("float   f="+t.f);
		System.out.println("double  d="+t.d);
		System.out.println("--------������--------");
		
		System.out.println("String str="+t.str);
	}
}











