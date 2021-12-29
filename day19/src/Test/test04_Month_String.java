package Test;

import java.util.Random;
import java.util.Scanner;

//문제4)
//0~11의 난수로 생성하고 이문자열을 표시하시오
//7이면 monthString[7]-->August

//출력)
//문제 : October(랜덤)
//몇월인가요? 8(입력)
//아닙니다.

//몇월인가요? 10
//정답입니다.
public class test04_Month_String {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		String monthString[] = {"January", "February", "March",
				"April", "May", "June","July" , "August", 
				"September", "October", "November", "December"};
		A : while(true) {
			int month = r.nextInt(12);
			System.out.println("문제 : " + monthString[month]);

			while(true) {
				System.out.print("몇 월입니까? : ");
				int m = sc.nextInt();
				if(m == -1) {
					System.out.println("끝.");
					break A;
				}
				if(m == month +1) 
					break;

				System.out.println("아닙니다.");
				System.out.println();
			}
			System.out.println("정답입니다.");
			System.out.println();
		}
	}
}



