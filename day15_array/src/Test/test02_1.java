package Test;

import java.util.Scanner;

//문제2) 우리반 학생이름을 키보드로 입력 받아 배열에 저장한 후 화면에 출력하시오
//출력)
//학생명 김소연
//학생명 김영우
//학생명 김용훈
//학생명 김유성
//학생명 양주희

//1번 옥수민
//2번 조성현
//3번 조신범
//4번 허정은
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//문제3)
//1. 키보드로 배열의 크기를 입력받는다.
//2. 입력받은 크기만큼 지정.
//3. 키보드로 각 요소에 값을 입력받는다.
//출력)
//[1회]
//배열크기 : 2
//0번쨰 사람 : 김소연
//1번째 사람 : 김영우
//
//배열에 값 출력하기
//--------------
//김소연, 김영우
//>>>>>>>>>>>>>>>>>>>>>>>>>>>
//문제4) while문으로
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//문제5) 
//시작위치 배열 = 5, 1, 1	(length)
//끝날 배열 31, 28			(day)
//월 > 10

public class test02_1 {

	public static void main(String[] args) {

//		String name[] = {"김소연", "김영우", "김용훈", "김유성",
//				"양주희", "옥수민", "조성현", "조신범", "허정은"};
		
		//	2번
//		int i,n;
//		for(i = 0; i < name.length; i++) {
//			System.out.println((i+1) +"번 : " + name[i] );
//		}
//		System.out.println();
		
		//	3번
//		String name[] = new String[3];
//		Scanner sc = new Scanner(System.in);
//		
//		for(int i = 0; i < name.length; i++) {
//			System.out.print("학생명 : ");
//			name[i] = sc.next();
//		}
//		for(int i = 0; i < name.length; i++) {
//			System.out.printf("%d번 %s %n",i+1, name[i]);
//		}
		
		//	4번
		Scanner sc = new Scanner(System.in);
		System.out.print("배열크기 : ");
		int size = sc.nextInt();
		
		String name[] = new String[size];

		for(int i = 0; i < name.length; i++) {
			System.out.print(i + "번째 사람 : ");
			name[i] = sc.next();
		}
		
//		배열에 값 출력하기
			 
		//홍길동, 홍길순

		 System.out.println("\n배열에 값 출력하기\n------------------");

		 for (int i = 0; i < name.length; i++) {

		 System.out.print(name[i]+",");

		 }

		 System.out.println();

	
	}

}
