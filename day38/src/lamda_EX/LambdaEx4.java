package lamda_EX;

interface MyFunction4 {
	int calc(int x, int y);
}

public final class LambdaEx4  {

	public static void main(String[] args) {

		printMultiply(3, 4, (x,y)->x*y);

	}

	public static void printMultiply(int x, int y, MyFunction4 f) {

		System.out.println(f.calc(x, y));
		}

	}
