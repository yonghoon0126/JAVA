package Test;

//����7) 1���� 100������ ���߿��� 4�� ����� ����ϴ� ���α׷��� �����Ѵ�
//�� for���� Ȱ���ؾ� �ϸ� ���ٿ� 5���� ����ϵ����Ѵ�

public class test07 {

	public static void main(String[] args) {

		for (int i = 4; i <= 100; i++) {
			if (i % 4 == 0) {
				System.out.printf("%4d", i);
			}
			if (i % 20 == 0) {
				System.out.println();
			}

		}

	}

}
