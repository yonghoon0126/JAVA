package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//����ڷκ��� ������ ������ �ι� �Է¹޾� ��Ģ���� �� ������������ �����Ͽ�
//����� ����Ͻÿ�. 
//(��, �Է��� BufferedReader, readLine(), printf() ����Ͻÿ�)
//
//�������)
//ù ��° ���� �Է� : 10
//�� ��° ���� �Է� : 2
//==[���� ���]====
//10 + 2 = 12
//10 - 2 = 8
//10 * 2 = 20
//10 / 2 = 5
//10 % 2 = 0

public class Ex1 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int num1, num2; 
//		int result = 0;
	
		System.out.print("ù ��° ���� �Է� : ");
		num1 = Integer.parseInt(br.readLine() );
		
		System.out.print("�� ��° ���� �Է� : ");
		num2 = Integer.parseInt(br.readLine() );
		
		int result1 = num1 + num2;
		int result2 = num1 - num2;
		int result3 = num1 * num2;
		int result4 = num1 / num2;
		int result5 = num1 % num2;
		
		
		System.out.println("==[���� ���]====");

		System.out.printf("%d + %d = %d%n", num1, num2, result1);
		System.out.printf("%d - %d = %d%n", num1, num2, result2);
		
		try {
			System.out.printf("%d * %d = %d%n", num1, num2, result3);
			System.out.printf("%d / %d = %d%n", num1, num2, result4);
			System.out.printf("%d %% %d = %d%n", num1, num2, result5);
			
		} catch (ArithmeticException e) {	
			System.out.println(e.getMessage());
			
		} catch (Exception e) {	
			System.out.println("0���� ���� �� �����ϴ�.");
		}
	}

}


//10 + 2 = 12
//
//10 - 2 = 8
//
//10 * 2 = 20
//
//10 / 2 = 5
//
//10 % 2 = 0
