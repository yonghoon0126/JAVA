package Homework;

public class September {
	public static void main(String[] args) {

		System.out.println("2021�� 9��\t\t\t\t��\t��" + "\n");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		System.out.print("\t\t\t");

		int i;

		for (i = 1; i < 31; i++) {
			System.out.print(i + "\t");
			if (i % 7 == 4) {
				System.out.print("\n");
			}
		}
	}
}
