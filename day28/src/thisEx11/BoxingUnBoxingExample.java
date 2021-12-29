package thisEx11;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {

		// Boxing
		Integer obj1 = new Integer(100);	// �⺻ -> ��ü
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf("300");

		// �ڵ� �ڽ�
		Integer ob1 = 100;
//		jvm�� �ڵ����� �Ʒ����� ������
//		Integer ob1 = new Integer(100);
		Integer ob2 = 200;
		Integer ob3 = 300;
		
		
		// Unboxing
		int value1 = obj1.intValue();	// ��ü -> �⺻
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();

		// �ڵ� ��ڽ�
		int ov1 = ob1; 
		int ov2 = ob2; 
		int ov3 = ob3; 
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);

	}

}
