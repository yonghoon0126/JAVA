package Test;
import java.util.Scanner;

public class test02_while {

	public static void main(String[] args) {

		int n = 1;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("[" + (n++) + "번]");
			System.out.println("배열의 크기 : ");
			int size = sc.nextInt();

			if (size != 0) {
				String name[] = new String[size];
				for (int i = 0; i < name.length; i++) {
					System.out.println(i + "번째 사람");
					name[i] = sc.next();
				}
				System.out.println("\t====배열에 값 출력하기=====");
				for (int i = 0; i < name.length; i++) {
					System.out.print(name[i] + ",");
				}

				System.out.println();
			}
		}
	}
}