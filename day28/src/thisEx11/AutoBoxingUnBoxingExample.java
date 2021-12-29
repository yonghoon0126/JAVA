package thisEx11;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {

		// �ڵ� Boxing
		Integer obj = 100;

		// Wrapper�� �ϱ�
		Integer obj2 = new Integer(100);
		
		System.out.println("value : " + obj.intValue());	// ���� 100
		System.out.println("value : " + obj);	// ���� 100
		

		
		
		// ���� �� �ڵ� UnBoxing
		int value = obj;
		
		// Wrapper�� �ϱ�
		int value2 = obj.intValue();
		
		System.out.println("value : " + value);	// 100


		
		
		// ���� �� �ڵ� UnBoxing
		
		int result = obj + 100;
		
		// Wrapper�� �ϱ�
		int result2 = value + 100;
		
		System.out.println("result : " + result);	// 200

	}

}
