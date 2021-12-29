package day04;

public class Test04 {

	public static void main(String[] args) {
		//변수선언 및 초기화
		int a=10;
		//int a; a=10
		
		int b=20;
		int c;
		c=a+b;
		// 출력)
		// a + b = 30
		//10 + 20= 30
		
		System.out.println("a + b ="+c);
		System.out.println(a + "+" + b + "="+c);
		System.out.printf("a + b = %d %n",c);
		System.out.printf("%d + %d = %d",a,b,c);

	}

}
