package Test;

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

public class Test09_1_Calculating {

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = 
				new BufferedReader (new InputStreamReader(System.in) ) ;

		int a, b;
		String s;

		while (true) {
			
			System.out.print("ù ���� ���� �Է� : ");
			a = Integer.parseInt(br.readLine());

			System.out.print("�� ���� ���� �Է� : ");
			b = Integer.parseInt(br.readLine());
			
			System.out.print("������ �Է�[+ - * /] : ");
			s = br.readLine();
			

			if (s == "+") {
				System.out.println(a + " + " + b + " = " + (a + b));
			} else if (s == "-") {
				System.out.println(a + " - " + b + " = " + (a - b));
			} else if (s == "*") {
				System.out.println(a + " * " + b + " = " + (a * b));
			} else if (s == "/") {
				System.out.println(a + " / " + b + " = " + (a / b));
			}
			


		}
	}
}
