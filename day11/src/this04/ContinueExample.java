package this04;

public class ContinueExample {
	public static void main(String[] args) {

		// int i = 0;
		// for (i = 1; i <= 10; i++) {
		// if (i % 2 != 0) {
		// continue;
		//
		// }
		// System.out.println(i);
		// }

		// -----------------------------------------------------------

		// 1 ~ 10���� 4�� ����� ����ϰ�, 4�� ����� ���� ����ϼ���

		// int i = 0;
		// int sum = 0;
		// String str = "";
		//
		// for (i = 1; i <= 10; i++) {
		// if (i % 4 == 0) { // 4, 8
		// sum += i;
		// str += " " + i;
		// }
		// if (i % 2 != 0) { // Ȧ��
		// continue;
		// }
		// System.out.println(i + "");
		// }
		// System.out.printf("4�� ��� = %s%n", str);
		// System.out.printf("4�� ����� �� = %d", +sum);

		// -------------------------------------------------------------------

		// 1~10���� �� �߿��� ¦��, Ȧ���� ����ϰ�, ���� ��/��ü���� ���ϰ�
		// ������ ���/��ü����� ���Ͻÿ�.

		int odd = 0, even = 0, i = 0; // i�� ����� ���ϱ� ���� ��ü ����
		int oCount = 0, eCount = 0; // ����� ���ϱ� ���� ���� ���ϱ�
		String oStr = "Ȧ��", eStr = "¦��"; // Ȧ¦�� ����� �ʱⰪ

		for (i = 1; i <= 10; i++) {

			if (i % 2 != 0) { // Ȧ��
				odd += i; // Ȧ���� ��
				oStr += " " + i; // Ȧ�� 1 3 5 7 9
				oCount++; // Ȧ�� ����
				continue;
			}
			System.out.print(i + " ");
			even += i; // ¦����
			eCount++; // ¦�� ����
			eStr += " " + i; // ¦�� 2 4 6 8 10
		}
		System.out.println("\n" + oStr);
		System.out.println(eStr);
		System.out.println("\n1 ~ 10 Ȧ���� �� = " + odd);
		System.out.println("\n1 ~ 10 ¦���� �� = " + even);
		System.out.println("\n1 ~ 10 ������ �� = " + (odd + even));

		System.out.println("\n1 ~ 10 ������ Ȧ���� ��� = " + odd / oCount);
		System.out.println("\n1 ~ 10 ������ ¦���� ��� = " + even / eCount);
		System.out.println("\n1 ~ 10 ������ ��� = " + (even + odd) / (i - 1));
	}
}













