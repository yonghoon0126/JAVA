package Test;

public class test04_method_Array {

	// �������� �����ϰ� �ޱ�(��ü, �迭)
	// �޼ҵ� ȣ�� : ��ȯ��x, �Ű�����o
			
	static void arr_sum(int arr[]) {	// �迭�� �����ּ� ����
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%4d", arr[i]);
		}
		System.out.println();
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
	};
	

	// �޼ҵ� ȣ�� : ��ȯ��o, �Ű�����o
	
	static int[] arr_sum2(int arr[]) {
		
		System.out.println();
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		return arr;
	};
	
	// �޼ҵ� ȣ�� : ��ȯ��o, �Ű�����o
	
	static int[] arr_sum3(int arr[]) {
		
		System.out.println();
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i * 10;
		System.out.println();
		}
		return arr;	// ��x
	}
	
	
//====================================================================
	
	// main
	public static void main(String[] args) {
		int a = 200;
		int b = 100;
		int result = 0;
		
		// �������� �����ϰ� �ޱ�(��ü, �迭)
		// �޼ҵ� ȣ�� : ��ȯ��x, �Ű�����o
		
		int arr[] = new int[4];
		
		arr_sum(arr);
		

		// �޼ҵ� ȣ�� : ��ȯ��o, �Ű�����o
		arr = arr_sum2(arr);	// �迭�� ���� �ּ� ����
		arr_sum(arr);
		
		// �޼ҵ� ȣ�� : ��ȯ��x, �Ű�����o
		arr = arr_sum3(arr);	// 10 20 30 40 �����ϰ� ����ϱ�

		
		
		
		
		
		
		

	}
}
