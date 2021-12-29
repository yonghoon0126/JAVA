package day18;

public class ArrayCopyExample {

	public static void main(String[] args) {

		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];

		// �������� : ����迭 != �����迭 = for�ݺ�
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

		for (int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
		System.out.println();
		System.out.println(oldStrArray.hashCode());
		System.out.println(newStrArray.hashCode());

		if (oldStrArray == newStrArray)
			System.out.println("���� �ּ� ����.");
		else
			System.out.println("���� �ּ� �ٸ�");

		String[] o;
		o = oldStrArray; // ���� ���� : ����迭 == �����迭
		if (oldStrArray == o)
			System.out.println("���� �ּ� ����.");
		else
			System.out.println("���� �ּ� �ٸ�");

	}

}
