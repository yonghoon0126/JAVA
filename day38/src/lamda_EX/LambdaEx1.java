package lamda_EX;

interface MyFunction {
	int calc(int x, int y);
}

public class LambdaEx1 {

	public static void main(String[] args) {

		MyFunction add = (x, y) -> {
			return x + y;
		};
		MyFunction minus = (x, y) -> x - y;

		System.out.println(add.calc(1, 2));
		System.out.println(minus.calc(1, 2));

	}

}
