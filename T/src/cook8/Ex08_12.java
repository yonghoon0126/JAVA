package cook8;

public class Ex08_12 {

	public static void main(String[] args) {
		char[] stack=new char[5];
		int top=0;
		
		stack[top]='A';
		System.out.printf("%c�ڵ����� �ͳο� ��\n",stack[top]);
		top++;
		
		stack[top]='B';
		System.out.printf("%c�ڵ����� �ͳο� ��\n",stack[top]);
		top++;
		
		stack[top]='C';
		System.out.printf("%c�ڵ����� �ͳο� ��\n\n",stack[top]);
		top++;
		
		top--;
		System.out.printf("%c�ڵ����� �ͳο� ���ǳ���\n",stack[top]);
		stack[top]=' ';
		
		top--;
		System.out.printf("%c�ڵ����� �ͳο� ���ǳ���\n",stack[top]);
		stack[top]=' ';
		
		top--;
		System.out.printf("%c�ڵ����� �ͳο� ���ǳ���\n",stack[top]);
		stack[top]=' ';
		
		
		
	}

}
