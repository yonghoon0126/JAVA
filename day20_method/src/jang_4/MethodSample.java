package jang_4;

public class MethodSample {
	
	//**************************************************************
	// 메소드 중복 Overloading : 메소드 오른쪽에 인자의 갯수, 자료타입이 모두 달라야함.
	//**************************************************************
	// 메소드의 다양성
	public int getSum(int i, int j) {
		return i + j;
	}

	public int getSum(int i, int j, int k) {
		return i + j + k;
	}

	public double getSum(double i, double j) {
		return i + j;
	}

	
	
	
	public static void main(String args[]) {
		MethodSample a = new MethodSample();

		int i = a.getSum(1, 2);
		int j = a.getSum(1, 2, 3);
		double k = a.getSum(1.1, 2.2);

		System.out.println("i = " + i);
		System.out.println("j = " + j);
		System.out.println("k = " + k);
		
	}

}
