package Test;

import java.util.Random;

//����)
//2���� �迭�� �����Ͽ�
//��� ��Ҹ� 0~99����
//������ ä���
//
//���)
//��� : 2
//���� : 3
//x[0][0] = 92
//x[0][1] = ?
//x[0][2] = ?
//x[1][0] = ?
//x[1][1] = ?
//x[1][2] = ?

public class test04_MathRandom {

	public static void main(String[] args) {

		
		int i = 0;
		int j = 0;
		int aa[][] = new int[2][3];
		
		System.out.println("��� : 2");
		System.out.println("���� : 3");
		for(i = 0; i < aa.length; i++) {
			for(j = 0; j < aa[i].length; j++) {
				int r = (int)(Math.random()*100) + 1;
				System.out.printf("x[%d][%d] = %d%n", i, j, r);	
			}
			
		}
	}

}
