package Test;
import java.util.Scanner;

public class test02_while {

	public static void main(String[] args) {

		int n = 1;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("[" + (n++) + "��]");
			System.out.println("�迭�� ũ�� : ");
			int size = sc.nextInt();

			if (size != 0) {
				String name[] = new String[size];
				for (int i = 0; i < name.length; i++) {
					System.out.println(i + "��° ���");
					name[i] = sc.next();
				}
				System.out.println("\t====�迭�� �� ����ϱ�=====");
				for (int i = 0; i < name.length; i++) {
					System.out.print(name[i] + ",");
				}

				System.out.println();
			}
		}
	}
}