package Cook5;

import java.util.Scanner;

public class Ex05_10_hasNextInt {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a = 0;

		System.out.print("Ãâ»ý³âµµ¸¦ ÀÔ·ÂÇÏ¼¼¿ä : ");
		while (s.hasNextInt()) {	// hasNextInt = ctrl + z°¡ Á¾·á
			
			a = s.nextInt();

//			if(a == -1) {
//				break;
//			}
			switch (a%12) {

			case 0 :
				System.out.println("¿ø¼þÀÌ ¶ì"); break;
			case 1 :
				System.out.println("´ß ¶ì"); break;
			case 2 :
				System.out.println("°³ ¶ì"); break;
			case 3 :
				System.out.println("µÅÁö ¶ì"); break;
			case 4 :
				System.out.println("Áã ¶ì"); break;
			case 5 :
				System.out.println("¼Ò ¶ì"); break;
			case 6 :
				System.out.println("È£¶ûÀÌ ¶ì"); break;
			case 7 :
				System.out.println("Åä³¢ ¶ì"); break;
			case 8 :
				System.out.println("¿ë ¶ì"); break;
			case 9 :
				System.out.println("¹ì ¶ì"); break;
			case 10 :
				System.out.println("¸» ¶ì"); break;
			case 11 :
				System.out.println("¾ç ¶ì"); break;

			}	// switch
			System.out.print("Ãâ»ý³âµµ¸¦ ÀÔ·ÂÇÏ¼¼¿ä : ");
		}	// while
		System.out.println("Á¾·á ÇÏ°Ú½À´Ï´Ù.");
	}
}
