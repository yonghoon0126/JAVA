package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//����9) ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
//�ش� �������� ó�� ����� ����ϴ� ���α׷��� �ۼ��Ѵ�.
//��, BufferedReader / if, Scanner/if/switch
//(���ǹ��� Ȱ���Ͽ� ������ �� �ֵ��� �ϸ�, �������� ���ǻ� ���������� ó���ǵ��� �Ѵ�.)

//���)
//ù ��° ���� �Է� : 4
//�� ��° ���� �Է� : 5
//������ �Է�[+ - * /] : +
//4 + 5 = 9

public class Test09_Calculating_BufferedReader {

	public static void main(String[] args) throws NumberFormatException, IOException  {

		BufferedReader br = 
				new BufferedReader (new InputStreamReader(System.in));

		int n1, n2, result = 0;
		String op;

		while (true) {

			System.out.print("ù ���� ���� �Է� : ");
			n1 = Integer.parseInt(br.readLine());

//********************************************************			
			System.out.print("������ �Է�[+ - * /] : ");
			op = br.readLine();
//********************************************************			

			System.out.print("�� ���� ���� �Է� : ");
			n2 = Integer.parseInt(br.readLine());



			if (op.equals("+")) {
//				result = n1 + n2;
//			} else if (op.equals("-")) {
//				result = n1 - n2;
//			} else if (op.equals("*")) {
//				result = n1 * n2;
//			} else if (op.equals("/")) {
//				result = n1 / n2;
//			}
//			else
//				System.out.println("�����ڸ� �߸� �Է��ϼ̽��ϴ�");
//			
//			System.out.println(n1 + " " + op + " " + n2 + " = " + result);

			
			// switch

			switch (op) {
	
			case "+" :
			result = n1 + n2;
			break;
	
			case "-" :
			result = n1 - n2;
			break;
	
			case "*":
			result = n1 * n2;
			break;
	
			case "/":
			result = n1 / n2;
			break;
	
			default:
			System.out.println("�����ڸ� �߸� �Է��ϼ̽��ϴ�.");
			break;
			}
	
			System.out.println(n1 + " " + op + " " + n2 + " = " + result );

			// ----------------------------�ݺ�

//			System.out.println("999�� �ԷµǸ� ��������.");
//
//			while(true) {
//
//				System.out.print("ù ��° ���� �Է� : ");
//				n1 = sc.nextInt();
//
//				System.out.print("�� ��° ���� �Է� : ");
//				n2 = sc.nextInt();
//
//				if(n1 == 999 & n2 == 999){ break; }
//				System.out.print("������ �Է�[+ - * /] : ");
//				op = sc.next().charAt(0);
//
//				switch (op) {
//				case '+': result = n1 + n2; break;
//				case '-': result = n1 - n2; break;
//				case '*': result = n1 * n2; break;
//				case '/': result = n1 / n2; break;
//
//				default: System.out.println("�����ڸ� �߸� �Է��ϼ̽��ϴ�.");
//				break;
//				}
//
//				System.out.println(n1 + " " + op + " " + n2 + " = "+ result + "\n" );
//
			}//while


		}
	}
}
