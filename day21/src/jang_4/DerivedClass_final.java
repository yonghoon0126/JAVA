package jang_4;

// final�� ��ӺҰ�	/ Ŭ����
 class FinalClass {
	
	 // �޼ҵ�
	 // ������ �Ұ�(Overriding)X
	 // public final 
	 int finalMethod() {
		 return 10;
	 }
}

public final class DerivedClass_final extends FinalClass{
	//�ʵ� final
	
	static final int A = 70;	// A������ 70���� ����(���ȭ �� ����) : ���Ҵ�/������ �Ұ�

	public final int finalMethod() {
//		A = 30;	// ���� fianal���� 70�� �����߱� ������ �� ���Ҵ� �Ұ�
		return 100;
	}
	
}
	
	
