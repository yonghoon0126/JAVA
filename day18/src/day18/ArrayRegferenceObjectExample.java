package day18;

public class ArrayRegferenceObjectExample {

	public static void main(String[] args) {

		String[] strArray = new String[3];
		
		strArray[0] = "java";
		strArray[1] = "java";
		strArray[2] = new String("java");

		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[0] == strArray[2]);	// 角力 林家
		System.out.println(strArray[0].equals(strArray[2]) );
		
		System.out.println();
		
		System.out.println(strArray[0].hashCode() );	// 稠府利 林家
		System.out.println(strArray[1].hashCode() );	// 稠府利 林家
		System.out.println(strArray[2].hashCode() );	// 稠府利 林家
		
		String[] strArray2;
	
	}
}
