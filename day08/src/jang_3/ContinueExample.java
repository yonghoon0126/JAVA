package jang_3;

public class ContinueExample { 
	public static void main(String[]args) {
		int sum = 0, sum1 = 0;
		for(int i = 1; i<= 100;i++) {
			if(i%2 == 1) {
				sum1 += i;
				continue;
		}else
				sum += i;
		}
		System.out.println("1���� 100���� ¦���� ���� "+sum);
		System.out.println("1���� 100���� Ȧ���� ���� "+sum1);
	}

}
