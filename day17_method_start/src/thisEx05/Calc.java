package thisEx05;

public class Calc {
	// ȫ�浿
	static int call(String a[]) { // String[] args = {"ȫ�浿"}
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			int n = Integer.parseInt(a[i]);
			sum += n;
		}
		return sum;
	}

	public static void main(String[] args) {
		int sum = 0;
		sum = call(args); // ȫ�浿

//		for(int i = 0; i < args.length; i++) {
//			int n = Integer.parseInt(args[i]);
//			
//			sum += n;
//		}
		System.out.println("sum = " + sum);
	}

}
