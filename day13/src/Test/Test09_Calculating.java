package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//����9) ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
//�ش� �������� ó�� ����� ����ϴ� ���α׷��� �ۼ��Ѵ�.
//��, BufferedReader / if, Scanner/if/switch
//(���ǹ��� Ȱ���Ͽ� ������ �� �ֵ��� �ϸ�, �������� ���ǻ� ���������� ó���ǵ��� �Ѵ�.)

//���)
//ù ��° ���� �Է� : 4
//�� ��° ���� �Է� : 5
//������ �Է�[+ - * /] : +
//4 + 5 = 9

public class Test09_Calculating {

	public static void main(String[] args) throws NumberFormatException, IOException {

		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Scanner br=new Scanner(System.in);

		int n1,n2, result=0;
		char op;

		System.out.print("ù ��° ���� �Է� : ");
		n1 = br.nextInt();

		System.out.print("�� ��° ���� �Է� : ");
		n2 = br.nextInt();

		System.out.print("������ �Է�[+ - * /] : ");
		op = br.next().charAt(0);

//		if(op == '+') {
//			result = n1 + n2;
//		}
//
//		else if(op == '-'){
//			result = n1 - n2;
//		}
//
//		else if(op == '*'){
//			result = n1 * n2;
//		}
//
//		else if(op == '/'){
//			result = n1 / n2;
//		}
//
//		else
//			System.out.println("�����ڸ� �߸� �Է��ϼ̽��ϴ�.");
//		
//		System.out.println(n1 + " "+ op + " " + n2 + " = " + result );


		// switch

//		switch (op) {
//
//		case '+':
//		result = n1 + n2;
//		break;
//
//		case '-':
//		result = n1 - n2;
//		break;
//
//		case '*':
//		result = n1 * n2;
//		break;
//
//		case '/':
//		result = n1 / n2;
//		break;
//
//		default:
//		System.out.println("�����ڸ� �߸� �Է��ϼ̽��ϴ�.");
//		break;
//		}
//
//		System.out.println(n1 + " " + op + " " + n2 + " = " + result );

		// ----------------------------�ݺ�

		System.out.println("999�� �ԷµǸ� ��������.");

		while(true) {

			System.out.print("ù ��° ���� �Է� : ");
			n1 = br.nextInt();

			System.out.print("�� ��° ���� �Է� : ");
			n2 = br.nextInt();

			if(n1 == 999 & n2 == 999){ break; }
			System.out.print("������ �Է�[+ - * /] : ");
			op = br.next().charAt(0);

			switch (op) {
			case '+': result = n1 + n2; break;
			case '-': result = n1 - n2; break;
			case '*': result = n1 * n2; break;
			case '/': result = n1 / n2; break;

			default: System.out.println("�����ڸ� �߸� �Է��ϼ̽��ϴ�.");
			break;
			}

			System.out.println(n1 + " " + op + " " + n2 + " = "+ result + "\n" );

		}//while

	}

}