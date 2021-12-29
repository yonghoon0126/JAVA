package Test;

import java.util.Random;
import java.util.Scanner;

//문제3) 배열 요소의 순서를 역순으로 바꿔서 표시
//요소 수 : 3(1~100사이의 랜덤으로 구해서 배열에 저장한 후 역으로 출력)
//a[0] = 77
//a[1] = 50
//a[2] = 91
//
//요소의 나열을 반대로 바꾸었습니다
//a[0] = 91
//a[1] = 50
//a[2] = 77

public class test03_ArraySwap {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		System.out.print("요소 수 : ");
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100) + 1;
			System.out.printf("a[%d] = %3d\n", i, arr[i]);
		}

		// 배열 순서 바꾸기
		int tmp = 0;

		for (int i = 0; i < (n - 1) - i; i++) {
			tmp = arr[i];
			arr[i] = arr[n - 1 - i];
			arr[n - 1 - i] = tmp;
		}
		System.out.println();
		System.out.println("요소의 나열을 반대로 바꾸었습니다.");

		for (int i = 0; i < n; i++) {
			System.out.printf("a[%d] = %3d\n", i, arr[i]);
		}

	}

}
