package Quiz;

/*1���� 5���� ��� (while/if/break, ������ true ��)
 * ���)
 * 1 2 3 4 5
 */

public class Quiz01 {
	public static void main(String []args) {

		int a = 1;
		/*
		while(a <= 5) {
			System.out.print(a+" ");
			a++;
		}
		System.out.print("\n"+a);
		 */
		int sum = 0;

		while(true) {
			//�� ���
			sum = sum + a;
			if(a>5)
				break;
			System.out.print(a+" ");
			a++;
		}
		//�� ���
		System.out.print( "\n" +sum);
		
	}

}
