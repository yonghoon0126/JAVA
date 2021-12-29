package Test;

import java.util.Scanner;

//문제8)
//키보드로 요소수를 메인에서 입력 받고 주소값을 넘겨 메소드에서 각 인덱스에
//값을 초기화 한 후 메인에 와서 아래와 같이 출력
//
//요소 수는 : 4
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
	
	// 주소
	static int[] indexArray_1(int x1[]) {
	
		for(int i = 0; i < x1.length; i++) {
			x1[i] = i + 1;
		}
		return x1;
	}	
	
//=====================main================================
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소 수는 : ");
		int n = sc.nextInt();
		
//		indexArray()호출
		int x[] = indexArray(n);
		
		// 출력
		for(int i = 0; i < n; i++) 
			System.out.println("x["+i+"] = " + x[i]);
		
		// 주소 전달
		int x1[] = new int[n];
		x1 = indexArray_1(x1);
		for(int i = 0; i < x1.length; i++) 
			
		System.out.println("x1["+i+"] = " + x1[i]);
		
		
		
	}
}
