package jang_2;

import java.util.Scanner; 

public class SwitchSeason {

	public static void main(String[] args) {
/*		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요[1~12] : ");

		while(scan.hasNext()) {
			score = scan.nextInt();	
			
		switch(score) { 	
		
		case 3:
		case 4:
		case 5:
			System.out.println(+ score +"웡은 봄 입니다.");
			break;
			
		case 6:
		case 7:
		case 8:
			System.out.println(+ score +"웡은 여름 입니다.");
			break;

		case 9:
		case 10:
		case 11:
			System.out.println(+ score +"웡은 가을 입니다.");
			break;
		
		case 12:
		case 1:
		case 2:
			System.out.println(+ score +"웡은 겨울 입니다.");
			break;

		default :
			System.out.println("다시 입력해주세요.\n");
			}
			System.out.println("숫자를 입력하세요[1~12] : ");
*/			
			
			
			String str="";
			
			Scanner a = new Scanner(System.in);
			System.out.print("숫자를 입력하세요[1~12] :  ");

			while(a.hasNext()) {
				
				int s = a.nextInt();
			
				if(s >=3 && s <6)
					str = "봄";
				else if(s >5 && s <= 8)
					str = "여름";
				else if(s > 8 && s <= 11)
					str = "가을";
				else if(s >= 12 || s <= 2)
					str = "겨울";
				else 
					System.out.print("숫자를 입력하세요[1~12] :  ");
				
				System.out.println( +s+"월은 " +str+" 입니다.\n");
				System.out.print("숫자를 입력하세요[1~12] :  ");
				
				if( s==1| s==2 | s==12) {
					str=s+"월은 겨울 입니다.";
				}else if(s>=3 & s<=5) {
					str=s+"월은 봄 입니다.";
				}else if(s>=3 & s<=5) {
					str=s+"월은 여름 입니다.";
				}else if(s>=3 & s<=5) {
					str=s+"월은 가을 입니다.";
				}else {
					str = s+"달이 없습니다.";
				}
				System.out.println(str);
					
			}

	}
}
