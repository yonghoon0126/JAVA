package test;

import java.util.Random;
import java.util.Scanner;

/*
 * ����3]�����˻�: �迭�� ��� �߿��� � ���� ���ԵǾ� �ִ��� ������ 
                ���� ���ԵǾ� ������ �� ����� �ε����� �����ϴ� ���α׷�.
				� ���� �O�� ���� �˻�, �˻��� ���� Ű��� �Ѵ�.
				�˻��� ��ġ�� �Է� �޾� ��ġ�� ��� �Ͻÿ�.
				//12����, 0~10�� �����߻�
	���)
	�迭 a�� ��� ����� ��
	{ 6 6 4 7 1 7 4 7 8 1 9 1  }
	�˻��� ��ġ : 4----------------->����ڷ� ���� ã�� �� ����
	��ã�� �� ��� 6 6 7 1 7 7 8 1 9 1 
	ã�°� a[6]�� �ֽ��ϴ�.
 * */
public class Test03 {

	public static void main(String[] args) {
		Random rand = new Random( );
		Scanner stdIn = new Scanner(System.in);
		
		final int n=12;
		int[] a = new int[n];
		
		for (int j = 0; j < n; j++)
			a[j] = rand.nextInt(10);
		
		System.out.print("�迭 a�� ��� ����� ��\n{ ");
		for (int j = 0; j < n; j++)
			System.out.print(a[j] + " ");
		
		System.out.println(" }");
		
		System.out.print("�˻��� ��ġ : ");
		
		int key = stdIn.nextInt( );
		int i,k=0;
		System.out.print("��ã�� �� ��� ");
		for (i = 0; i < n; i++){
			if (a[i] == key){	k=i;	continue;}
			else System.out.print(a[i]+" ");
		}
		if(k==0) {
			System.out.println("��ã�ҽ��ϴ�.");
		}else {
			System.out.println("\nã�°� a[" + k + "]�� �ֽ��ϴ�.");
		}
	}

}
