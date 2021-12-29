package jang6;

public class MathEx {

	public static void main(String[] args) {

		double a = 2.78987434;
		int n = 1;
		
		System.out.println(n++ + " : " + Math.abs(a));			// 2.78987434
		
		System.out.println(n++ + " : + " + Math.ceil(2.7));		// 올림	// +3.0
		System.out.println(n++ + " : - " + Math.ceil(2.7));		// 올림	// -3.0
		
		System.out.println(n++ + " : + " + Math.floor(a));		// 버림	// +2.0
		System.out.println(n++ + " : - " + Math.floor(a));		// 버림	// -2.0
		
		System.out.println(n++ + " : " + Math.sqrt(9.0));		// 제곱근	// 3.0
		System.out.println(n++ + " : " + Math.exp(1.5));		// 제곱	// 4.4816890703380645
		System.out.println(n++ + " : " + Math.rint(3.141592));	// 근접한 정수	// 3.0

		// 절대값 구하기
		System.out.println(Math.abs(a));	// 2.78987434
		System.out.println(Math.ceil(a));	// 올림	// 3.0
		System.out.println(Math.floor(a));	// 버림	// 2.0
		System.out.println(Math.sqrt(a));	// 제곱근	// 1.670291693088366
		System.out.println(Math.exp(a));	// 제곱	// 16.278974057376946
		System.out.println(Math.rint(a));	// 근접한 정수	// 3.0
		
		// [1,45] 사이의 난수 발생
		System.out.println("이번주 행운의 번호는");
		for(int i = 0; i < 5; i++) {
			System.out.print(Math.round(1 + Math.random()*44) + " ");
		}
		System.out.println("입니다.");
	}

}
