package Test;

import java.text.DecimalFormat;

public class test05_Method {
	
	static void addMatrix(int a[][] , int b[][], int c[][] ) {
		for(int i = 0; i < 2; i++)
			for(int j = 0; j < 3; j++)
				c[i][j] = a[i][j] + b[i][j];
	}
	// ���
	static void printMatrix(int a[][]){
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) 
				System.out.printf("%3d", a[i][j]);
			System.out.println();
		}
	}
	
//--------------------------main------------------------	
	public static void main(String[] args) {

		int a[][] = { { 1, 2, 3 },{ 4, 5, 6 } };
		int b[][] = { { 6, 3, 4,},{	5, 1, 2 } };
		int c[][] = { { 0, 0, 0,},{	0, 0, 0 } };
		
		addMatrix(a, b, c);	// �迭c ���

		// ���a,b,c ���
		System.out.println("��� a");
		printMatrix(a);
		
		System.out.println("��� b");
		printMatrix(b);
		
		System.out.println("��� c");
		printMatrix(c);
		
		DecimalFormat d = new DecimalFormat("#,###.0");
		System.out.println(d.format(2222.0));
		
		};	// main		
	}
