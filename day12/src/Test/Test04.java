package Test;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int c,y,n = 0;
		String a = "Ã¶¼ö";

		while(n<5) {
			n++;
			c=(int)(Math.random()*3)+1;
			y=(int)(Math.random()*3)+1;
			System.out.printf("Ã¶¼ö >> %d %n",c);
			System.out.printf("¿µÈñ >> %d %n",y);

			if (c==1) {
				
				if(y==1) {
					System.out.println("ºñ°å½À´Ï´Ù.");
				}else if(y==2){
					System.out.println(a + "°¡ °å½À´Ï´Ù.");
				}else{
						System.out.println("Ã¶¼ö°¡ ÀÌ°å½À´Ï´Ù.");
					}
			
			}else if (c==2) {
				if(y==1) {
					System.out.println("Ã¶¼ö°¡ Á³½À´Ï´Ù.");
				}else if(y==2){
					System.out.println("ºñ°å½À´Ï´Ù.");
				}else{
						System.out.println("Ã¶¼ö°¡ ÀÌ°å½À´Ï´Ù.");
				}
	
			}else if (c==3) {
				if(y==1) {
					System.out.println("Ã¶¼ö°¡ Á³½À´Ï´Ù.");
				}else if(y==2){
					System.out.println("Ã¶¼ö°¡ ÀÌ°å½À´Ï´Ù.");
				}else{
						System.out.println("ºñ°å½À´Ï´Ù.");
				}
			}//if
		}

	}//main
}
