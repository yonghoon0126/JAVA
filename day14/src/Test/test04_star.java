package Test;

public class test04_star {

	public static void main(String[] args) {

		int i, j, k;

		// 因拷
		for (i = 0; i <= 4; i++) {
//			for (j = i; j <= 4; j++) {
				for (j = 4; j >= i; j--) {
				System.out.print("』");
			}
			
			// *
			for (j = 0; j <= i * 2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

//』』』』』*
//』』』』***
//』』』*****
//』』*******
//』*********
