package Test;

//����1) ������ ���ڰ� ����ִ� �迭�� ���� �����͵� ��
//¦���� ��Ҹ� ��� ����ϰ�,
//3�� ����� ��Ҹ� ��� ����ϴ� ���α׷��� �����Ѵ�
//�迭�� �����ϴ� ������ ���� = 4 7 9 1 3 2 5 6 8
//
//���� ��)
//�迭 ��� ��ü ���
//4 7 9 1 3 2 5 8
//¦�� ������ ���
//4 2 6 8
//3�� ��� ������ ���
//9 3 6
public class test01 {

	public static void main(String[] args) {

		int[] arr = {4, 7, 9, 1, 3, 2, 5, 6, 8 };

		System.out.println("�迭 ��� ��ü ���");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
//		==================================================================

		System.out.println("¦�� ������ ���");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) 
				System.out.print(arr[i] + " ");
			}
		System.out.println();

//		==================================================================

		System.out.println("3�� ��� ������ ���");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0) 
				System.out.print(arr[i] + " ");
			}
		System.out.println();

	}

}
