package Test;

//Ãâ·Â)
//1 2 3 4 5
//2 3 4 5 6 
//3 4 5 6 7
//4 5 6 7 8 
//5 6 7 8 9

public class test02 {

	public static void main(String[] args) {

	int arr[][] = new int [5][5];
	
	int n = 1 ;
	
	for(int i = 0; i < arr.length; i++) {
		for(int j = 0; j < arr[i].length; j++) {
		arr[i][j] = n;	
		arr[i][j] = n + j;	
		System.out.printf("%3d", arr[i][j]);
		}
		n++;
		System.out.println();
		}
	}
		
}
