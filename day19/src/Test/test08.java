package Test;

import java.util.Scanner;

//����8)
//Ű����� ��Ҽ��� ���ο��� �Է� �ް� �ּҰ��� �Ѱ� �޼ҵ忡�� �� �ε�����
//���� �ʱ�ȭ �� �� ���ο� �ͼ� �Ʒ��� ���� ���
//
//��� ���� : 4
//x[0] = 0
//x[1] = 1
//x[2] = 2
//x[3] = 3

public class test08 {

	static int[] indexArray(int n) {
		
		int a[] = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = i;
		}
		return a;
	}
	
	// �ּ�
	static int[] indexArray_1(int x1[]) {
	
		for(int i = 0; i < x1.length; i++) {
			x1[i] = i + 1;
		}
		return x1;
	}	
	
//=====================main================================
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("��� ���� : ");
		int n = sc.nextInt();
		
//		indexArray()ȣ��
		int x[] = indexArray(n);
		
		// ���
		for(int i = 0; i < n; i++) 
			System.out.println("x["+i+"] = " + x[i]);
		
		// �ּ� ����
		int x1[] = new int[n];
		x1 = indexArray_1(x1);
		for(int i = 0; i < x1.length; i++) 
			
		System.out.println("x1["+i+"] = " + x1[i]);
		
		
		
	}
}
