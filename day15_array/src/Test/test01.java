package Test;

public class test01 {

	public static void main(String[] args) {

		int [] a = {1, 2, 3, 4};
		int sum = 0;

		for(int i = 0; i < a.length; i++) {
			System.out.printf("a[%d] = %d\n",i, a[i]);
			sum += i;
		}
		System.out.println("гу = " + sum);
		System.out.println();


		int n = 0;
		sum = 0;
		for(int i : a) {
			System.out.printf("a[%d] = %d\n",n, i);
			n++;
			sum += i;
		}
		System.out.println("гу = " + sum);
		System.out.println();

		float f[] = new float[4];
		for(int i = 0; i < f.length; i++) {
			System.out.printf("f[%d] = %f\n", i, f[i]);
			n++;
			sum += i;
		}
		System.out.println("гу = " + sum);
		System.out.println();

		String s[] = new String[4];
		for(int i = 0; i < s.length; i++) {
			System.out.printf("s[%d] = %s\n",i, s[i]);
		}
		System.out.println();

		boolean b[] = new boolean[4];
		for(int i = 0; i < b.length; i++) {
			System.out.printf("b[%d] = %b\n",i, b[i]);
		}
		System.out.println();


	}

}
