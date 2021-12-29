package thisEx05;

public class ArrayInArrayExample {

	public static void main(String[] args) {

		// 00->0
		// -------------------------------------------------------����

		int[][] mathScores = new int[2][3]; // ���� ���
		for (int i = 0; i < mathScores.length; i++) {
			for (int k = 0; k < mathScores[i].length; k++) {
				System.out.println("mathScores[" + i + "][" + k + "] = " + mathScores[i][k]);
			}
		}
		System.out.println();

		// -------------------------------------------------------����

		int[][] englishScores = new int[2][]; // ��������� : �����, �� ����
		englishScores[0] = new int[2]; // 0���� ���� ������ŭ �޸� ����
		englishScores[1] = new int[3];
		for (int i = 0; i < englishScores.length; i++) {
			for (int k = 0; k < englishScores[i].length; k++) {
				System.out.println("englishScores[" + i + "][" + k + "] = " + englishScores[i][k]);
			}
		}
		System.out.println();

		// -------------------------------------------------------�ڹ�

		int[][] javaScores = { { 95, 80 }, { 92, 96, 80 } }; // ��������� : ��/���� ���� ����
		for (int i = 0; i < javaScores.length; i++) {
			for (int k = 0; k < javaScores[i].length; k++) {
				System.out.println("javaScores[" + i + "][" + k + "] = " + javaScores[i][k]);
			}
		}
		// -------------------------------------------------------�ּ�ġȯ
		System.out.println("\n\n�ּ� ġȯ�ؼ� �޼ҵ� ȣ���Ͽ� ����ϱ�------");
		englishScores = javaScores; // �ּҸ� ġȯ
		disp(englishScores); // �ּҰ� ���� ��
		
		// �ּҰ��ְ� ȣ���� �Ͽ� ���ó��(��)/����� �� �� ó���� ���� ���� �ͼ� ���ο� ����ϱ�
		System.out.println();
		int sum = disp2(englishScores);
		System.out.println("�� : " + sum);
		// �հ� ��� --> �� : 443
	}

	public static int disp2(int[][] englishScores) {

		// �ּ�ġȯ�ؼ� �޼ҵ�ȣ���Ͽ� ����ϱ�(��ȯ��o)-------------------------
		int sum = 0;
		for (int i = 0; i < englishScores.length; i++) {
			for (int k = 0; k < englishScores[i].length; k++) {
				System.out.println("englishScores[" + i + "][" + k + "] = " + englishScores[i][k]);
				sum += englishScores[i][k];
			}
		}
		return sum;
	}

	public static void disp(int[][] englishScores) { // �ּҰ� �޾Ƽ� EnglishScores���빰 ���

		// �ּ�ġȯ�ؼ� �޼ҵ�ȣ���Ͽ� ����ϱ�(��ȯ��x)-------------------------
		for (int i = 0; i < englishScores.length; i++) {
			for (int k = 0; k < englishScores[i].length; k++) {
				System.out.println("englishScores[" + i + "][" + k + "] = " + englishScores[i][k]);
			}
		}
	}
}