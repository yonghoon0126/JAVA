package Quiz;
/*1부터 100까지 2,3,4 배수의 합(while문)
 * 
 * 출력)
 * 12 24 36 48 60 72 84 96
 * 합 : 432
 */
public class Quiz03 {
	public static void main(String []args) {
		//100까지 1씩 증가, 2,3,4의 공배수의 합을 구함		
		int i = 0;	//증가변수
		int tot = 0;	//합

		while(i < 100) {
			i++;	// i=i+1;
			//and(&):~중에, ~이고, ~이면서, 모두 참이면 참)
			if((i%2==0) & (i%3==0) & (i%4==0)) {
				tot += i;
				System.out.print(i+" ");
			} //if
		} //while
		System.out.print("\n합 : "+tot);

	}

}

