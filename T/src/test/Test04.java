package test;

import java.util.Scanner;

/*����4] �л����� �Է� �ް�, �� �� ��ŭ ������ �Է� �޾�
 *      ��ü �л��� ������ ��, ���, ������ ���Ͽ�
 *      ����� ����Ͻÿ�.
 *      ��, �迭�� Ȱ���Ͽ� ó���Ͻÿ�.
 *      ���)
 *      �л��� �Է�: 5
 *      1�� �л� ���� �Է� :90
 *      2�� �л� ���� �Է� :82
 *      3�� �л� ���� �Է� :64
 *      4�� �л� ���� �Է� :36
 *      5�� �л� ���� �Է� :98
 *      
       ��  : 370
       ��� : 74
       ����
       -------------  
		90 : 16
		82 : 8
		64 : -10
		36 : -38
		98 : 24
 * */
public class Test04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, sum=0;
		
		System.out.print("�л��� �Է�: ");
		n=sc.nextInt();
		int score[]=new int[n];
		for (int i = 0; i < score.length; i++) {
			System.out.print((i+1)+"�� �л� ���� �Է� :");
			score[i]=sc.nextInt();
			sum +=score[i];
		}
		int avg=sum/score.length;

		System.out.println();		
		System.out.println("��  : "+ sum);
		System.out.println("��� : "+ avg);
		System.out.println("����");
		System.out.println("-----------------------");

		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]+"  :  "+(score[i]-avg));
		}

	}

}
