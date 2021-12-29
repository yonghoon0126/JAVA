package jang_2;

public class LogicalOperator {
	public static void main(String[] args) {
		System.out.println('a' > 'b');
		//System.out.println((int) a,b);

		System.out.println(3 >= 2);
		System.out.println(-1 < 0);
		System.out.println(3.45 <= 2);
		System.out.println(3 == 2);
		System.out.println(3 != 2);
		System.out.println(!(3 != 2));
		System.out.println((3 > 2) && (3 > 4)); // 왼쪽이 거짓이면 오른쪽
		System.out.println((3 > 2) || (-1 > 0)); // 왼쪽이 참이면 오른쪽
		System.out.println((3 != 2) ^ (-1 > 0));

	}

}
