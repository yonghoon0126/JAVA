package Test;

//문제1) 구성요소 형이 int형인 배열(구성요소 수는 5 : new를 이용해서 본체를 생성)
//출력)
//a[0] = 0
//a[1] = 37
//a[2] = 51
//a[3] = 0
//a[4] = 74 ---> a[1] 추가해서

public class test01 {

	public static void main(String[] args) {

		int a[] = new int[5];

		a[0] = 0;
		a[1] = 37;
		a[2] = 51;
		a[3] = 0;
		a[4] = a[1] * 2;
		System.out.println("a[0] = " + a[0]);
		System.out.println("a[1] = " + a[1]);
		System.out.println("a[2] = " + a[2]);
		System.out.println("a[3] = " + a[3]);
		System.out.println("a[4] = " + a[4]);
		underline();

		for(int i = 0; i < a.length; i++) {
			System.out.printf("a[%d] = %d%n", i, a[i]);
		}
		underline();

		int n = 0;
		for(int i : a) {
			System.out.printf("a[%d] = %d%n", n++, i);
		}
		underline();

		System.out.println("배열명을 출력하면 배열의 \n시작주소가 출력됨 : " + a);
		a = null;
		System.out.println("a = null의 결과(Gabage대상이 된다. JVM이 관리함 : " + a);
		nullDisp(a);
		
	};	// main
	
	public static void underline() {
		System.out.println("..................................");

	};
	public static void nullDisp(int[] a) {
		System.out.println("a................" + a[0]);

	};
}
