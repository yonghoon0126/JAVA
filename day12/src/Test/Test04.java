package Test;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int c,y,n = 0;
		String a = "ö��";

		while(n<5) {
			n++;
			c=(int)(Math.random()*3)+1;
			y=(int)(Math.random()*3)+1;
			System.out.printf("ö�� >> %d %n",c);
			System.out.printf("���� >> %d %n",y);

			if (c==1) {
				
				if(y==1) {
					System.out.println("�����ϴ�.");
				}else if(y==2){
					System.out.println(a + "�� ����ϴ�.");
				}else{
						System.out.println("ö���� �̰���ϴ�.");
					}
			
			}else if (c==2) {
				if(y==1) {
					System.out.println("ö���� �����ϴ�.");
				}else if(y==2){
					System.out.println("�����ϴ�.");
				}else{
						System.out.println("ö���� �̰���ϴ�.");
				}
	
			}else if (c==3) {
				if(y==1) {
					System.out.println("ö���� �����ϴ�.");
				}else if(y==2){
					System.out.println("ö���� �̰���ϴ�.");
				}else{
						System.out.println("�����ϴ�.");
				}
			}//if
		}

	}//main
}
