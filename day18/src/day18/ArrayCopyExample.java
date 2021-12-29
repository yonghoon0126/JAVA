package day18;

public class ArrayCopyExample {

	public static void main(String[] args) {

		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];

		// 깊은복사 : 현재배열 != 다음배열 = for반복
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

		for (int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
		System.out.println();
		System.out.println(oldStrArray.hashCode());
		System.out.println(newStrArray.hashCode());

		if (oldStrArray == newStrArray)
			System.out.println("실제 주소 같음.");
		else
			System.out.println("실제 주소 다름");

		String[] o;
		o = oldStrArray; // 얇은 복사 : 현재배열 == 다음배열
		if (oldStrArray == o)
			System.out.println("실제 주소 같음.");
		else
			System.out.println("실제 주소 다름");

	}

}
