package cook8;

import java.util.Scanner;

public class Ex08_12_Car {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char[] stack = new char[5];
		int top = 0;

		char carName = 'A';
		int select = 9;

		while (select != 3) {
			System.out.printf("<1> �ڵ��� �ֱ� <2> �ڵ��� ���� <3> �� : ");
			select = sc.nextInt();

			switch (select) {

			case 1:
				
				if (top >= 5) {
					System.out.printf("�ͳ��� �� ���� ���� �� ��.\n");
				} else {
					stack[top] = carName++;	// B
					System.out.printf("%c �ڵ����� �ͳο� ��.\n", stack[top]);
					top++;
				}
				break;

			case 2:
				
				if (top <= 0) {
					System.out.printf("�������� �ڵ����� ����.\n");
				} else {
					top--;
					System.out.printf("%c �ڵ����� �ͳο��� ����.\n", stack[top]);
					stack[top] = ' ';
				}
				break;

			case 3:
				
				System.out.printf("���� �ͳο� %d�밡 ����.\n", top);
				System.out.printf("���α׷��� �����մϴ�.\n");
				break;

			default:
				System.out.printf("�߸� �Է��߽��ϴ�. �ٽ� �Է��ϼ���.\n");
			}
		}

	}

}
