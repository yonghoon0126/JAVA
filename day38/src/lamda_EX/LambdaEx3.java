package lamda_EX;

interface MyFunction3 {
	void print();
}

public class LambdaEx3  {

	public static void main(String[] args) {

		MyFunction3 f = () -> {System.out.println("Hello");
		};

		f.print();

		f = () -> System.out.println("¾È³ç");

		f.print();
	}

}
