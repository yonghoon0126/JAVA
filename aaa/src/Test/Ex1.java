package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int num1, num2;
		
		System.out.println("ù ��° ���� �Է� : ");
		num1 = Integer.parseInt(br.readLine());
		
		System.out.println("�� ��° ���� �Է� : ");
		num2 = Integer.parseInt(br.readLine());
		
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
