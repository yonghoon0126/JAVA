package Ex08;

public class Ex08_11_Stack {

	public static void main(String[] args) {

		char[] stack = new char[5];
		int top = 0;

//		if(top >= 5) {
//			System.out.printf("터널이 꽉 차서 차가 못 들어감. \n");
//		}
		
		stack[top] = 'A';
		System.out.printf("%c 자동차가 터널에 들어감\n", stack[top]);
		top++;

		stack[top] = 'B';
		System.out.printf("%c 자동차가 터널에 들어감\n", stack[top]);
		top++;

		stack[top] = 'C';
		System.out.printf("%c 자동차가 터널에 들어감\n", stack[top]);
		top++;

		System.out.println();
		
//		else {
//			stack[top] = 'A';
//			System.out.printf("%c 자동차가 터널에 들어감. \n" , stack[top]);
//			top++;
//		}

		top--;
		System.out.printf("%c 자동차가 터널을 빠져나감 \n", stack[top]);
		stack[top] = ' ';

		top--;
		System.out.printf("%c 자동차가 터널을 빠져나감 \n", stack[top]);
		stack[top] = ' ';

		top--;
		System.out.printf("%c 자동차가 터널을 빠져나감 \n", stack[top]);
		stack[top] = ' ';

	}

}
