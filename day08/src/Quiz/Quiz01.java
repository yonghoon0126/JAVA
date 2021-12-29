package Quiz;

/*1부터 5까지 출력 (while/if/break, 조건을 true 비교)
 * 출력)
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
			//합 출력
			sum = sum + a;
			if(a>5)
				break;
			System.out.print(a+" ");
			a++;
		}
		//합 출력
		System.out.print( "\n" +sum);
		
	}

}
