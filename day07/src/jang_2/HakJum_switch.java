package jang_2;

import java.util.Scanner;

public class HakJum_switch {

	public static void main(String[] args) {

//switch문장으로
//점수 = 100 , 학점은 A입니다, 점수 :
	
//		char = grade;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수 : ");
		
		while(sc.hasNext()) {
			int s = sc.nextInt();	

		switch(s/10) { 	
		
		case 10:
		case 9:
			System.out.println("학점은 A입니다.");
			break;
		case 8:
			System.out.println("학점은 B입니다.");
			break;
		case 7:
			System.out.println("학점은 C입니다.");
			break;
		case 6:
			System.out.println("학점은 D입니다.");
			break;
	
		default :
//			System.out.println("학점은 "+grade+"입니다.\n");
			System.out.println("s\n");
		}
		System.out.println("점수 : ");

		}		

	}

}
