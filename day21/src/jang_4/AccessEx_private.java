package jang_4;

class Sample{
	public int a;
	
	private int b;	// �������� = ĸ��ȭ // �ܺ�Ŭ�������� �������� �Ұ�
	// �������� getter() / setter()
	
	int c;

	// getter() 
	public int getB() {	// int b = aClass.getB();
		return a;
	}
	// setter()
	public void setB(int b) {	// aClass.setB(10);
		this.b = b;
	}
}

public class AccessEx_private {
	
	public static void main(String[] args) {
		
		Sample aClass = new Sample();
		aClass.a = 10;

//**********************************************************************
//		aClass.b = 10;	// ���������ؼ� ������, setter()�� �����ؾ� ��
		aClass.setB(10); // ��������, setter()
//**********************************************************************
		
		aClass.c = 10;

		System.out.println("b�� = " + aClass.getB());
	}

}
