package jang_3;

public class Ex08_06_CountSize {

	public static void main(String[] args) {

		int aa[] = {10, 20, 30, 40, 50};
		int count, size;

		count = aa.length;
		size = count * Integer.BYTES;

		System.out.printf("�迭 aa[]�� ����� ������ %d �� �Դϴ�. \n", count);
		System.out.printf("�迭 bb[]�� ����� ��ü ũ���  %d ����Ʈ �Դϴ�. \n", size);
		System.out.println(Integer.SIZE);



	}

}
