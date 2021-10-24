package test;

import java.util.Random;
import java.util.Scanner;

/*문제4]
 * 0~11의 난수로 생성하고 이문자열을 표시하시오.
 * 7이면 monthString[7]-->August
 * 출력) 
 * 문제: October -->랜덤
 * 몇 월인가요? 8 --->입력
 * 아닙니다.
 * 
 * 몇 월인가요? 10
 * 정답입니다.
 * 
 * */
public class Test04 {

	public static void main(String[] args) {
		Random rand = new Random( );
		Scanner stdIn = new Scanner(System.in);	
		String monthString[]= {"January", "February", "March", "April", "May", 
							   "June", "July",	"August", "September", "October", 
							   "November", "December" };
		
	A:	while(true) {
			int month = rand.nextInt(12);	// 맞혀야 할 월 : 0~11의 난수
			System.out.println("문제: " + monthString[month]);
	
			while (true) {
				System.out.print("몇 월입니까? : ");
				int m = stdIn.nextInt( );
				if(m==-1) {
					System.out.println("끝.");
					break A;
				}
				if (m == month + 1) break;
				
				System.out.println("아닙니다.\n");
			}//while
			
			System.out.println("\n정답입니다.");
		}//while
	}

}
