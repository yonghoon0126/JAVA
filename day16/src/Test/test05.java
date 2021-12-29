package Test;

//출력)
//1 2 3
//4 5 6 
//7 8 9

//1 2 3
//4 5 6 
//7 8 9
//합 = 45

public class test05 {

	public static void main(String[] args) {

		int[][] arr = new int[3][3]; // 선언, 메모리 확보, 디폴트 초기화

		// 초기값 저장하기
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3; // ----------------------------0줄

		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6; // ----------------------------1줄

		arr[2][0] = 7;
		arr[2][1] = 8;
		arr[2][2] = 9; // ----------------------------2줄

		// 선언, 메모리 확보, 초기화

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
//==========================================================================		
		
		// 선언, 메모리 확보, 초기화

		int[][] arr2 = { 
				{ 1, 2, 3 }, 
				{ 4, 5, 6 }, 
				{ 7, 8, 9 } 
				};
		int sum = 0;
		
		for (int m[] : arr2) {
			for (int j : m) {
				System.out.printf("%2d ", j);
				sum += j;
			}
			System.out.println();
		}
		System.out.println("합 => " + sum);

	}

}
