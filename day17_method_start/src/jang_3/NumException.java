package jang_3;

public class NumException {

	public static void main(String[] args) {
		String[] stringNumber = { "23", "12", "998", "3.141592" };

		try {
			
			for (int i = 0; i < stringNumber.length; i++) {
				int j = Integer.parseInt(stringNumber[i]);
				System.out.println("���ڷ� ��ȯ�� ���� " + j);
			}
		} catch (NumberFormatException e) {	
			// ���ڿ��� ��Ÿ���� ���ڿ� ��ġ���� �ʴ� Ÿ���� ���ڷ� ��ȯ �� �߻�
			
			System.out.println("������ ��ȯ�� �� �����ϴ�.");
		}
	}

}
