package jang_3;

import java.util.Scanner;

//Ű���尪 ���ؼ� �, ���
public class WhileSample {
	public static void main(String [] args) {

		Scanner sc = new Scanner(System.in);
		int n = 0; //�Է� ����
		double sum = 0;	//��
		int i = 0;	
/*		while((i = sc.nextInt()) !=0){
			sum += i;
			n++;
		}
		System.out.println("�Էµ� ������"+n+"�� �̸� ����� " +sum/n+"�Դϴ�.");
*/
		System.out.println("----do~while----");
		do {
			sum += i;
			n++;
		}while ((i = sc.nextInt()) !=0);
		System.out.println("�Էµ� ������"+n+"�� �̸� ����� " +sum/n+"�Դϴ�.");
	}
}
