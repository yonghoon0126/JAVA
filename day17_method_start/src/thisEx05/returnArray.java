package thisEx05;

//합계 : 16
//0
//1
//2
//3

public class returnArray {

	static int[] makeArray(int num) {
		int temp[] = new int[4];
		int sum = 0;
		for(int i = 0; i < temp.length; i++) {
			temp[i] = i;
			sum += i;
		}
		System.out.println("합계 : " + (sum + num));
		return temp;
	}

	public static void main(String[] args) {

		int intArray[];
//		intArray = new int[4];
		intArray = makeArray(10);

//		for(int i = 0; i < intArray.length; i++) {
//			intArray[i] = i;
//			System.out.println(intArray[i]);
//		}
		for(int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}

}
