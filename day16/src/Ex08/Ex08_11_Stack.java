package Ex08;

public class Ex08_11_Stack {

	public static void main(String[] args) {

		char[] stack = new char[5];
		int top = 0;

//		if(top >= 5) {
//			System.out.printf("�ͳ��� �� ���� ���� �� ��. \n");
//		}
		
		stack[top] = 'A';
		System.out.printf("%c �ڵ����� �ͳο� ��\n", stack[top]);
		top++;

		stack[top] = 'B';
		System.out.printf("%c �ڵ����� �ͳο� ��\n", stack[top]);
		top++;

		stack[top] = 'C';
		System.out.printf("%c �ڵ����� �ͳο� ��\n", stack[top]);
		top++;

		System.out.println();
		
//		else {
//			stack[top] = 'A';
//			System.out.printf("%c �ڵ����� �ͳο� ��. \n" , stack[top]);
//			top++;
//		}

		top--;
		System.out.printf("%c �ڵ����� �ͳ��� �������� \n", stack[top]);
		stack[top] = ' ';

		top--;
		System.out.printf("%c �ڵ����� �ͳ��� �������� \n", stack[top]);
		stack[top] = ' ';

		top--;
		System.out.printf("%c �ڵ����� �ͳ��� �������� \n", stack[top]);
		stack[top] = ' ';

	}

}
