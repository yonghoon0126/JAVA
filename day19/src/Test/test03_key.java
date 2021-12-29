package Test;

import java.util.Random;
import java.util.Scanner;

//문제3)
//선형검색 : 배열의 요소 중에서 어떤 값이 포함되어 있는지 없는지
//만약 포함되어 있으면 그 요소의 인덱스를 조사하는 프로그램.
//어떤 값을 찾는 것을 검색, 검색할 값을 키라고 한다.
//검색할 수치를 입력받아 위치를 출력 하시오.
//12고정, 0~10의 난수발생

//출력)
//배열 a의 모든 요소의 값
//{ 0 4 2 4 6 9 7 8 4 2 5 7 }
//검색할 값 : 4
//못 찾은 값 출력 : 0 2 6 9 7 8 2 5 7
//이것은 a[1]에 있습니다.

public class test03_key {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		final int n = 12;

		int a[] = new int[n]; // 배열 갯수 선언

		for (int j = 0; j < n; j++)
			a[j] = ran.nextInt(10); // 배열에 랜던값 저장
		// int r = (int)(Math.random()*10) + 1;
		// int r = (int)(ran.nextInt(10) + 1);

		System.out.println("배열 a의 모든 요소의 값");
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + " "); // 저장된 값 출력
		}
		System.out.println();

		System.out.print("검색할 값 : ");
		int key = sc.nextInt();

		int i,k = 0;
		System.out.print("못 찾은 값 출력 : ");
		for (i = 0; i < n; i++) {
			//for (int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				k = i;
				continue;
			} else {
				System.out.print(a[i] + " ");
			}

		}
		if (k == 0) {
			System.out.println("못 찾았습니다");
		} else {
			System.out.println("\n찾는값 a[" + i + "]에 있습니다.");
		}
	}

}
