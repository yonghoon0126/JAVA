package Test;

//문제1) 1/2 + 2/3 + 3/4 +......9/10 형태로 계산하여 각각 1/2...9/10의 답
//아래처럼 출력
//1/2 = 0.5
//2/3 = 1.16.....
//.
//.
//.
//9/10 = 7.07
//연산 결과 : 7.07

public class test01 {

	public static void main(String[] args) {

		int n = 0;
		double sum = 0;

		while(n < 9) {

			sum+= (double)(n+1)/(n+2);
			System.out.println((n+1) + "/" + (n+2) +" = " + sum);

			n++;


		}		

		System.out.printf("연산 결과 : %.2f\n" , sum);
		// 출력 연산 결과 7.07
	}
}



