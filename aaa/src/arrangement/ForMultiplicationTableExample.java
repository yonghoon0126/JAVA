package arrangement;

import java.util.Scanner;

public class ForMultiplicationTableExample {
	public static void main(String []args) {

		//		int i,j;
		//		
		//		for (i = 2; i <= 9; i++) {
		//			System.out.println("***" + i + "단을 시작합니다." + "***");
		//			System.out.println(" ");
		//			for(j = 1; j<=9; j++) {
		//				System.out.println(i + " x " + j + " = "  + (i*j));
		//			}
		//			System.out.println(" ");
		//			
//======================================================================		
		
		// 키보드로 단을 입력받아 2~받은 단까지 출력하시오
		// 출력)
		// 단 입력 : 
		
		Scanner sc = new Scanner(System.in);
		System.out.print(" 단 입력 : ");
		
		int i,j;

		while(true) {
			
			int s = sc.nextInt();
			for (i = 2; i <= s; i++) {
				System.out.println("***" + i + "단을 시작합니다." + "***");
				System.out.println(" ");
				for(j = 1; j<=9; j++) {
					System.out.println(i + " x " + j + " = "  + (i*j));
				}
				System.out.println(" ");
				if (s == 1) {
					System.out.println("종료되었습니다.");
					break;
				}
			}
			System.out.print(" 단 입력 : ");
		}
	}
}