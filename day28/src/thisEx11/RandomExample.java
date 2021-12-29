package thisEx11;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {

		// ���� ��ȣ
		int[] selectNumber = new int[6];
		Random random = new Random(3);
		System.out.print("���� ��ȣ : ");

		for (int i = 0; i < 6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();

		// ��÷ ��ȣ
		int[] winningNumber = new int[6];
		random = new Random(5);
		System.out.print("��÷ ��ȣ : ");

		for (int i = 0; i < 6; i++) {
			winningNumber[i] = random.nextInt(45) + 1;
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println();

		// ��÷ ����
		Arrays.sort(selectNumber); // ���� ��ȣ ����
		dispsort(selectNumber);
		Arrays.sort(winningNumber); // ��÷ ��ȣ ����
		dispsort(winningNumber);
		dispsort(winningNumber);

		boolean result = Arrays.equals(selectNumber, winningNumber);
		// ���� ��ȣ�� ��÷ ��ȣ�� ��ġ�ϴ��� Ȯ��
		System.out.print("��÷ ���� : ");

		if (result) {
			System.out.println("1� ��÷�Ǽ̽��ϴ�.");
		} else {
			System.out.println("��");
		}
	}

//===========================================================================
	
	// ���� ��ȣ ���� �޼ҵ�
	public static void dispSort(int[] selectNumber) {
		for (int i = 0; i < 6; i++) {
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
	}

	// ��÷ ��ȣ ���� �޼ҵ�
	public static void dispsort(int[] winningNumber) {
		for (int i = 0; i < 6; i++) {
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println();
	}
}
