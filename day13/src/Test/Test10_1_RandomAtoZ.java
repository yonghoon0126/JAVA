package Test;

import java.io.IOException;
import java.util.Random;

//����10)
//RandomŬ������ �̿���
//���ĺ� �빮�� �߿���
//�������� �����Ͽ� ����Ͻÿ�.(for�� �̿�)
//
//���)
//
//G	A	O	P	B
//G	A	O	P	B
//G	A	O	P	B

public class Test10_1_RandomAtoZ {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// Random
		Random r = new Random();

		int n;
		int i;

		for (i = 1; i < 15; i++) {
			n = r.nextInt(26) + 65;
			System.out.printf((char) n + " ");
			if ((i + 1) % 5 == 0)
				System.out.println();
		}

		System.out.println();
		for (i = 0; i < 15; i++) {
			n = r.nextInt(26) + 97;
			System.out.printf((char) n + " ");
			if ((i + 1) % 5 == 0)
				System.out.println();
		}

		char c = (char) ((Math.random() * 26) + 65);
		System.out.print(c + " ");
	}

}
