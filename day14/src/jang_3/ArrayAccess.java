package jang_3;

import java.util.Scanner;

public class ArrayAccess {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int intArray[] = new int[5];
		int max = 0;	// max = 0
		
		for(int i = 0; i < intArray.length; i++) {
			System.out.println("intArray["+i+"] = " + intArray[i]);
		}	// 배열 초기화
		
		System.out.println("숫자 5개를 입력하세요.");
		for (int i = 0; i < 5; i++) {
			intArray[i] = sc.nextInt();
			if(intArray[i] > max)
				max = intArray[i];

		}
		System.out.println("입력된 수에서 가장 큰수는" + max + "입니다.");
	}
}
