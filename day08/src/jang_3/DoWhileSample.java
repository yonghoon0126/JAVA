package jang_3;

public class DoWhileSample {
	public static void main(String []args) {
		char a = 'a';
		System.out.println("--------do while----------");
		
/*		do {
			System.out.print(a);
			a = (char)(a+1);
		}while(a<='z');
*/
	
		while(a <= 'z') {
		System.out.print(a);
		a = (char)(a+1);
//		a++;
		}
	}
}
