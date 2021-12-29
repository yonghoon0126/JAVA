package Test;

public class Test05 {

	public static void main(String[] args) {

		int a = 10 , b = -10;
		 
		
		// ~a : 11111111111111111111111111110101
		//	a : 							1010
		// ~b : 11111111111111111111111111111001
		System.out.printf("~a : %s\n",Integer.toBinaryString(~a));
		System.out.printf(" a : %s\n",Integer.toBinaryString(a));
		System.out.printf("~b : %s\n",Integer.toBinaryString(~b));
		
		System.out.printf("~a : %s\n", a);	// 10
		System.out.printf("~a : %s\n", ~a);	// -11
		
		System.out.printf("~b : %s\n", b);	// -10
		System.out.printf("~b : %s\n", ~b);	// 9
	}

}
