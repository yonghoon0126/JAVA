package this04;

import java.io.IOException;

public class WhileKeyControlExample {
	public static void main(String[] args) throws IOException {

		boolean run = true;
		int speed = 0;
		int keyCode = 0;

		 while (run) { // ����x ���, ����
			if (keyCode != 13 && keyCode != 10) {
				System.out.println("--------------------------");
				System.out.println("1. ���� | 2. ���� | 3. ���� ");
				System.out.println("--------------------------");
				System.out.println("���� : ");
			}

			keyCode = System.in.read(); // 1 ~ 3�߿� �� �Է�

			if (keyCode == 49) { // 1�� �о��� ���
				speed++;
				System.out.println("���� �ӵ� = " + speed);
			} else if (keyCode == 50) { // 2�� �о��� ���
				speed--;
				System.out.println("���� �ӵ� = " + speed);
			} else if (keyCode == 51) { // 3�� �о��� ���
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}

}
