package jang_3;

//0 1 2 3 
//4 
//5 
//6 7 8 9 

public class IrregularArray2 {

	public static void main(String[] args) {

		int a = 0;
		int n = 0;
		
		int intArray[][] = new int[4][];
		intArray[0] = new int[4];
		intArray[1] = new int[1];
		intArray[2] = new int[1];
		intArray[3] = new int[4];

		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				intArray[i][j] = n++;
			}
		}

		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				System.out.print(intArray[i][j] + " ");
			}
				System.out.println();
		}

	}
}