package Test;

import java.util.Scanner;

//����11)
//a�� b���� ����Ͻÿ�
//�Է°� ����� ���ο��� �ۼ��ϰ� ��길 �޼ҵ� �̿��Ͻÿ�.
//���)
//�Ǽ� a : 3
//���� b : 2
//3.0�� 2���� 9.0�Դϴ�.

public class test11_multiply {
	
	static double result(double a, int b) {
		double sum = 1.0;
		for(int i = 0; i < b; i++)
			sum *= a;
		
		return sum;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("a�� b���� ����մϴ�.");
		
		System.out.print("�Ǽ� a : ");
		double a = sc.nextDouble();
		
		System.out.print("���� b : ");
		int b = sc.nextInt();
		
		System.out.printf("%.1f�� %d���� %.1f�Դϴ�.", a, b, result(a,b));
	}
	

}
