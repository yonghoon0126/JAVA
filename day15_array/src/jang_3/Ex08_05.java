package jang_3;

public class Ex08_05 {

	public static void main(String[] args) {

		int[] aa = new int[100];
		int[] bb = new int[100];
		int i;
		
		for(i= 0; i < 100; i++) {
			aa[i] = i * 2;
		}
			
		for(i = 0; i < 100; i++) {
			bb[i] = aa[99-1];
		}
		
		System.out.printf("bb[0]�� %d, bb[99]�� %d �Էµ�\t", bb[0], bb[99]);
		System.out.println();
		System.out.println("bb[0]�� " + bb[0] + ", bb[99]�� " + bb[99] +"�Էµ�");
		
	}

}
