package thisEx06;

public class Television {

	static String company = "Samsung";	// ����� �ʱ�ȭ
	static String model = "LCD";
	static String info;	// �⺻�� = ������ �ʱ�ȭ
	
	// ���� �� = Ŭ���� ��
	static {
		info = company + "-" + model;
	}
	
	{} // ���� �� == �ν��Ͻ� ��
	
}
