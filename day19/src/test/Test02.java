package test;

import java.util.Scanner;

/*
����2] ������ ���� �Է� �޾� �迭�� ũ�⸦ ����,
      �迭�� ��� ��ҿ� ������ �����ؼ� ���� ������ ����׷����� ǥ��,
	  �迭�� ��� ��ҿ� 1~10�� ������ �����ؼ� ǥ���ϴ� ���α׷�
���) 
��� �� : 5
a[0] : *********
a[1] : ****
a[2] : *
a[3] : *******
a[4] : ****

�߰�: ��� ����: ¦���̸� �� , Ȧ���̸� *
* */
public class Test02 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("��� �� : ");
		int n = stdIn.nextInt( );
		int[ ] a = new int[n];//3
	
	/*	for (int i = 0; i < n; i++) {
			a[i]=1+ (int)( Math.random()*10);//2 3 3
		}*/
		for (int i = 0; i < n; i++) {
			System.out.print("\na[" + i + "] : ");
			a[i]=1+ (int)( Math.random()*10);
			for (int j = 0; j < a[i]; j++) {
				if(n % 2==0) {
					System.out.print('��');
				}else {
					System.out.print('*');
				}
			}
		}

	}

}
