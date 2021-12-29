package thisEx11;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {

		// 선택 번호
		int[] selectNumber = new int[6];
		Random random = new Random(3);
		System.out.print("선택 번호 : ");

		for (int i = 0; i < 6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();

		// 당첨 번호
		int[] winningNumber = new int[6];
		random = new Random(5);
		System.out.print("당첨 번호 : ");

		for (int i = 0; i < 6; i++) {
			winningNumber[i] = random.nextInt(45) + 1;
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println();

		// 당첨 여부
		Arrays.sort(selectNumber); // 랜덤 번호 정렬
		dispsort(selectNumber);
		Arrays.sort(winningNumber); // 당첨 번호 정렬
		dispsort(winningNumber);
		dispsort(winningNumber);

		boolean result = Arrays.equals(selectNumber, winningNumber);
		// 랜덤 번호와 당첨 번호가 일치하는지 확인
		System.out.print("당첨 여부 : ");

		if (result) {
			System.out.println("1등에 당첨되셨습니다.");
		} else {
			System.out.println("꽝");
		}
	}

//===========================================================================
	
	// 랜덤 번호 정렬 메소드
	public static void dispSort(int[] selectNumber) {
		for (int i = 0; i < 6; i++) {
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
	}

	// 당첨 번호 정렬 메소드
	public static void dispsort(int[] winningNumber) {
		for (int i = 0; i < 6; i++) {
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println();
	}
}
