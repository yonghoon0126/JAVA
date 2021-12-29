package lamda_EX;

interface MyFunction2 {
	int calc(int x);
}

public class LambdaEx2 {

	public static void main(String[] args) {

		MyFunction2 square = x -> x * x;

		System.out.println(square.calc(1));

	}

}
