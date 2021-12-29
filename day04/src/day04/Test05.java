package day04;
/*
반지름이 10인 원의 넓이: 314.1592
반지름이 10인 원의 둘레: 62.83184
반지름이 10 인 원의 넓이: 314.159200
반지름이 10 인 원의 둘레: 62.831840
 * */

public class Test05 {
	public static void main(String[] args) {
		//변수 선언 및 초기화: 반지름
		int r=10; //--정수형 변수 r에 10을 담아라
		double a,b;

		// 원의 넓이 구하기(반지름 * 반지름 * 3.141592)
		a=r*r*3.141592; 
		
		// 원의 둘레 구하기(반지름 * 2 * 3.141592)
		b=r*2*3.141592;
		
		System.out.println("반지름이 "+r+"인 원의 넓이: "+a);
		System.out.println("반지름이 "+r+"인 원의 둘레: "+b);
		//%f  : %전체자리수.소수미만자리수f
		System.out.printf("반지름이  %d 인 원의 넓이: %f \n",r,a);
		System.out.printf("반지름이  %d 인 원의 둘레: %f \n",r,b);
		System.out.printf("반지름이  %d 인 원의 둘레: %.2f \n",r,b);
	}
}
