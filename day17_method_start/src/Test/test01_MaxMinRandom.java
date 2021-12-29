package Test;

import java.util.Random;
import java.util.Scanner;

//문제1) 사용자로부터 입력받은 변수의 갯수만큼
//난수를 발생시켜 배열에 담고 배열에 담겨있는 데이터들 중
//가장 큰 값과 작은 값을 출력하시오(1차원 배열)
//1~100사이의 난수 중에서 구하세요

//출력)
//발생할 난수의 갯수 : 3
//53 46 92
//가장 큰 값 : 92
//가장 작은 값 : 46

public class test01_MaxMinRandom {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("발생할 난수의 갯수 : ");
		int n = sc.nextInt();

		// 배열 선언 / 메모리 할당 / 디폴트 초기화
		int arr[] = new int[n];

		// 난수 발생(1~100) 시켜서 배열에 저장하기
		Random r = new Random();

		for(int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100)+1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		int max, min;
		max = min = arr[0];

		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}

		}
		System.out.print("가장 큰 값 : " + max);
		System.out.println();
		System.out.print("가장 큰 값 : " + min);



	}
}
