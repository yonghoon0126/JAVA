package thisEx06;

public class Calculator232Example {

	public static void main(String[] args) {

		Calculator232 myCalc = new Calculator232();
		
		// ���簢�� ���� ���ϱ�
		double result1 = myCalc.areaRectangle(10);
		
		// ���簢�� ���� ���ϱ�
		double result2 = myCalc.areaRectangle(10, 20);
		
		// ��� ���
		System.out.println("���簢���� ���� : " + result1);
		System.out.println("���簢���� ���� : " + result2);
		
	}
}
