package test;

import java.util.Random;
import java.util.Scanner;

/*����4]
 * 0~11�� ������ �����ϰ� �̹��ڿ��� ǥ���Ͻÿ�.
 * 7�̸� monthString[7]-->August
 * ���) 
 * ����: October -->����
 * �� ���ΰ���? 8 --->�Է�
 * �ƴմϴ�.
 * 
 * �� ���ΰ���? 10
 * �����Դϴ�.
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
			int month = rand.nextInt(12);	// ������ �� �� : 0~11�� ����
			System.out.println("����: " + monthString[month]);
	
			while (true) {
				System.out.print("�� ���Դϱ�? : ");
				int m = stdIn.nextInt( );
				if(m==-1) {
					System.out.println("��.");
					break A;
				}
				if (m == month + 1) break;
				
				System.out.println("�ƴմϴ�.\n");
			}//while
			
			System.out.println("\n�����Դϴ�.");
		}//while
	}

}
