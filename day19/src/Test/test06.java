package Test;

//x = 0, y = 5, z = 6

public class test06 {

	static void method(int x, int y, int z) {
		System.out.println("x = " + x + ", y = " + y + ", z = " + z);
	
}

	public static void main(String[] args) {

		int i = 0;
		method(i, i = 5, ++i);

	}


}