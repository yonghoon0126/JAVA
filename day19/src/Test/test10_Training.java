package Test;

//����6] �ϻ� Ʈ���̴�!! ����(x,y,z)�� 1~10���� ������ ���� �Ʒ��� ���� ����Ͻÿ�.
//���)
//1 + 8 + 10 = 1
//Ʋ�Ƚ��ϴ�!!
//1 + 8 + 10 = 19
//�� �߾��.
//
//�ٽ� �ѹ�? <Yes-1/No-0> : 1
//1 + 3 + 3 = 7
//�� �߾��.
//
//�ٽ� �ѹ�? <Yes-1/No-0> : 0
//�׸�~~ 

import java.util.Random;
import java.util.Scanner;

public class test10_Training {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Random r = new Random();

		System.out.println("�ϻ� Ʈ���̴�");

		do {

			int x = r.nextInt(10);
			int y = r.nextInt(10);
			int z = r.nextInt(10);

			while(true) {
				System.out.printf("%d + %d + %d = ", x, y, z);
				int n = sc.nextInt();	// ����� �� �Է�

				if(n == x + y + z) {
					System.out.println("�� �߾��.\n");
					break;
				}	// ���� �� �ݺ�
				System.out.println("Ʋ�Ƚ��ϴ�.\n");
			}	// while

		}while(confirmRetry( ));	// 1
		System.out.println("�׸�.");
	}

	static boolean confirmRetry() {
		int count;
		do {
			System.out.print("�ٽ� �ѹ�? <Yes-1 / NO-0> : ");
			count = sc.nextInt();
		}while(count != 0 && count != 1);	// 1, 0 �ƴϸ� �ݺ�
		
		return count == 1;
	}

}
