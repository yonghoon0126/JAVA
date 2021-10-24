package test;

import java.util.Random;
import java.util.Scanner;

/*
 * 문제3]선형검색: 배열의 요소 중에서 어떤 값이 포함되어 있는지 없는지 
                만약 포함되어 있으면 그 요소의 인덱스를 조사하는 프로그램.
				어떤 값을 찿는 것을 검색, 검색할 값을 키라고 한다.
				검색할 수치를 입력 받아 위치를 출력 하시오.
				//12고정, 0~10의 난수발생
	출력)
	배열 a의 모든 요소의 값
	{ 6 6 4 7 1 7 4 7 8 1 9 1  }
	검색할 수치 : 4----------------->사용자로 부터 찾는 값 받음
	못찾은 값 출력 6 6 7 1 7 7 8 1 9 1 
	찾는값 a[6]에 있습니다.
 * */
public class Test03 {

	public static void main(String[] args) {
		Random rand = new Random( );
		Scanner stdIn = new Scanner(System.in);
		
		final int n=12;
		int[] a = new int[n];
		
		for (int j = 0; j < n; j++)
			a[j] = rand.nextInt(10);
		
		System.out.print("배열 a의 모든 요소의 값\n{ ");
		for (int j = 0; j < n; j++)
			System.out.print(a[j] + " ");
		
		System.out.println(" }");
		
		System.out.print("검색할 수치 : ");
		
		int key = stdIn.nextInt( );
		int i,k=0;
		System.out.print("못찾은 값 출력 ");
		for (i = 0; i < n; i++){
			if (a[i] == key){	k=i;	continue;}
			else System.out.print(a[i]+" ");
		}
		if(k==0) {
			System.out.println("못찾았습니다.");
		}else {
			System.out.println("\n찾는값 a[" + k + "]에 있습니다.");
		}
	}

}
