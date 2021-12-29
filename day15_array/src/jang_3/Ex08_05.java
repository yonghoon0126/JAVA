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
		
		System.out.printf("bb[0]Àº %d, bb[99]´Â %d ÀÔ·ÂµÊ\t", bb[0], bb[99]);
		System.out.println();
		System.out.println("bb[0]Àº " + bb[0] + ", bb[99]´Â " + bb[99] +"ÀÔ·ÂµÊ");
		
	}

}
