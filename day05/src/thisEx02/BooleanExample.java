package thisEx02;

import java.util.Scanner;

public class BooleanExample {

	public static void main(String[] args) {
		boolean stop = true;

		Scanner scan = new Scanner(System.in);
		System.out.println("����/����[true/false] ");
		stop = scan.nextBoolean();
		
		if (stop) { // if�� ���� <= ������ ���� - 1
			System.out.println("�����մϴ�.");
		} else {
			System.out.println("�����մϴ�.");

		}

	}

}
