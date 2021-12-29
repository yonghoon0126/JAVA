package Test;

//문제7) 1부터 100까지의 수중에서 4의 배수만 출력하는 프로그램을 구현한다
//단 for문을 활용해야 하며 한줄에 5개씩 출력하도록한다

public class test07 {

	public static void main(String[] args) {

		for (int i = 4; i <= 100; i++) {
			if (i % 4 == 0) {
				System.out.printf("%4d", i);
			}
			if (i % 20 == 0) {
				System.out.println();
			}

		}

	}

}
