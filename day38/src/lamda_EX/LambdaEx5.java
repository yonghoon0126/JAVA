package lamda_EX;

@FunctionalInterface
interface MyFunction5<T> {
	void print(T x);
}

public class LambdaEx5 {

	public static void main(String[] args) {

		MyFunction5<String> f1 = (x) -> System.out.println(x.toString());
		f1.print("ABC");

		MyFunction5<Integer> f2 = (x) -> System.out.println(x.toString());
		f2.print(Integer.valueOf(100));

	}

}
