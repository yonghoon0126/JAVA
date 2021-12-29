package Test;

public class test04_star_reverse {

	public static void main(String[] args) {

		int i, j ;

			// 因拷
			for (i = 0; i <= 4; i++) {
				for (j = 0; j <= i; j++) {
					System.out.print("』");
				}
				
				// *
				for (j = 8; j >= i * 2; j--) {
					System.out.print("*");
				}
				System.out.println();
		}
	}
}

//』*********
//』』*******
//』』』*****
//』』』』***
//』』』』』*
