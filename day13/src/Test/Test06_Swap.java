package Test;

//����6) x, y�� ���� ���� �ٲ㼭 ����Ͻÿ�.
//(swap�غ��� : ������ �̿�, ^)
//���)
//x = 2, y = 5
//x = 5, y = 2

public class Test06_Swap {

	public static void main(String[] args) {

		int x = 2, y = 5, z = 0;

		System.out.println("x = " + x + ", " + "y = " + y);	// x = 2, y = 5

		//		z = x;
		//		x = y;
		//		y = z;

		//		System.out.println("x = " + x + ", " + "y = " + y);	// x= 5, y = 2

		System.out.println("----------------------------------------------------");

		x = x^y;	// 2		 x = 0010^0101 ==> 0111(7)
		y = x^y;	// 2		 y = 0111^0010 ==> 0010(2)
		x = x^y;	// 5		 x = 0111^0010 ==> 0101(5)
		
		System.out.println("x = " + x + ", " + "y = " + y);	// x = 5, y = 2

	}

}
