package Test;

import java.util.Scanner;

public class test09_star {

	static void putStars(int n) {
		while(n-->0)
			System.out.print('*');
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �� : ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++ ) {
			for(int j = 0; j <= i; j++) {
				putStars(i);	// ������ ȣ��
//				System.out.print('*');	// 
			}
			System.out.println();
		}
		
	}
}
