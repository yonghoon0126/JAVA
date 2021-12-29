package Test;

public class test04_method_Array {

	// 여러값을 전달하고 받기(객체, 배열)
	// 메소드 호출 : 반환값x, 매개변수o
			
	static void arr_sum(int arr[]) {	// 배열의 시작주소 받음
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%4d", arr[i]);
		}
		System.out.println();
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
	};
	

	// 메소드 호출 : 반환값o, 매개변수o
	
	static int[] arr_sum2(int arr[]) {
		
		System.out.println();
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		return arr;
	};
	
	// 메소드 호출 : 반환값o, 매개변수o
	
	static int[] arr_sum3(int arr[]) {
		
		System.out.println();
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i * 10;
		System.out.println();
		}
		return arr;	// 값x
	}
	
	
//====================================================================
	
	// main
	public static void main(String[] args) {
		int a = 200;
		int b = 100;
		int result = 0;
		
		// 여러값을 전달하고 받기(객체, 배열)
		// 메소드 호출 : 반환값x, 매개변수o
		
		int arr[] = new int[4];
		
		arr_sum(arr);
		

		// 메소드 호출 : 반환값o, 매개변수o
		arr = arr_sum2(arr);	// 배열의 시작 주소 전달
		arr_sum(arr);
		
		// 메소드 호출 : 반환값x, 매개변수o
		arr = arr_sum3(arr);	// 10 20 30 40 저장하고 출력하기

		
		
		
		
		
		
		

	}
}
