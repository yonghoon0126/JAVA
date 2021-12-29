package thisEx03;

public class CharOperationExample {
	public static void main(String[] args) {
		char c1 = 'A' + 1; // 65 + 1 = 66 B 에러가 없는 이유는 : 상수 + 상수
		char c2 = 'A';
		// char c3 = c2 + c1; // 컴파일 에러인 이유는 : 문자형변수를 연산하면 int 형으로
		char c3 = (char) (c2 + 1);
		int c3_i = c2 + 1;

		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + (int) c2);
		System.out.println("c3_i : " + (char) c3_i);

		System.out.println("----------------------------------------------");

		long x = 1000_000;
		long y = 1000_000;
		long z = x * y;

		System.out.println(z);
	}

}
