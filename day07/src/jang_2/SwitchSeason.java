package jang_2;

import java.util.Scanner; 

public class SwitchSeason {

	public static void main(String[] args) {
/*		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���[1~12] : ");

		while(scan.hasNext()) {
			score = scan.nextInt();	
			
		switch(score) { 	
		
		case 3:
		case 4:
		case 5:
			System.out.println(+ score +"���� �� �Դϴ�.");
			break;
			
		case 6:
		case 7:
		case 8:
			System.out.println(+ score +"���� ���� �Դϴ�.");
			break;

		case 9:
		case 10:
		case 11:
			System.out.println(+ score +"���� ���� �Դϴ�.");
			break;
		
		case 12:
		case 1:
		case 2:
			System.out.println(+ score +"���� �ܿ� �Դϴ�.");
			break;

		default :
			System.out.println("�ٽ� �Է����ּ���.\n");
			}
			System.out.println("���ڸ� �Է��ϼ���[1~12] : ");
*/			
			
			
			String str="";
			
			Scanner a = new Scanner(System.in);
			System.out.print("���ڸ� �Է��ϼ���[1~12] :  ");

			while(a.hasNext()) {
				
				int s = a.nextInt();
			
				if(s >=3 && s <6)
					str = "��";
				else if(s >5 && s <= 8)
					str = "����";
				else if(s > 8 && s <= 11)
					str = "����";
				else if(s >= 12 || s <= 2)
					str = "�ܿ�";
				else 
					System.out.print("���ڸ� �Է��ϼ���[1~12] :  ");
				
				System.out.println( +s+"���� " +str+" �Դϴ�.\n");
				System.out.print("���ڸ� �Է��ϼ���[1~12] :  ");
				
				if( s==1| s==2 | s==12) {
					str=s+"���� �ܿ� �Դϴ�.";
				}else if(s>=3 & s<=5) {
					str=s+"���� �� �Դϴ�.";
				}else if(s>=3 & s<=5) {
					str=s+"���� ���� �Դϴ�.";
				}else if(s>=3 & s<=5) {
					str=s+"���� ���� �Դϴ�.";
				}else {
					str = s+"���� �����ϴ�.";
				}
				System.out.println(str);
					
			}

	}
}
