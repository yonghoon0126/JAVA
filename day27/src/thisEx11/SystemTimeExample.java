package thisEx11;

public class SystemTimeExample {

	public static void main(String[] args) {

		// mili 10^-3 micro 10^-6 nano 10^-9 pico 10^-12
		long time1 = System.nanoTime();
		System.out.println(time1);

		int sum = 0;
		for (int i = 1; i <= 1000000; i++) {
			sum += i;
		}

		long time2 = System.nanoTime();
		System.out.println(time2);

		System.out.println("1~1000000까지의 합 : " + sum);
		System.out.println("계산에 " + (time2 - time1) + "나노초가 소요되었습니다.");
	}

}
