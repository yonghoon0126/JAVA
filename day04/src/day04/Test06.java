package day04;

public class Test06 {

	public static void main(String[] args) {
		System.out.print("AAA");
		System.out.print("BBB");
		System.out.print("CCC\n");
		//--------> AAABBBCCC

		// ���� ��� �޼ҵ�
		System.out.printf("12345678901234567890%n");//��%n������
		System.out.printf("%d + %d = %d\n", 10 , 20, 30);
		//12345678901234567890
		//10 + 20 = 30

		System.out.printf("%10d\n",123);
		System.out.printf("%010d\n",123);//�������� �߽����� �ؼ� ������ ����
		System.out.printf("%-10d\n",123);//�������� �߽����� �ؼ� �������� ����
		//-->       123
		//   0000000123
		//   123
		System.out.printf("%+d\n", 365);
		System.out.printf("+%d\n", 365);
		//--==>+365
		//     +365
		System.out.printf("%d\n", -365);
		System.out.printf("-%d\n", 365);
		//--==>-365
		//     -365
		System.out.printf("%(d\n", -365);
		System.out.printf("%(d\n", 365);
		//--==>(365)      <-- -365=(365)  -��ȣ�� ()�� ��ü
		//      365

		//System.out.printf("%d\n", 'A');	//-- ��Ÿ�� ���� �߻� / ��ȣ�� ��� ����
		System.out.printf("%c\n", 'A');
		System.out.printf("%s\n", "ABCD");
		//--==>A
		//     ABCD
		
		System.out.printf("%h\n", 18);//16����
		System.out.printf("%o\n", 24);//8�� ������
		System.out.printf("%b\n", true);
		//--==>12
		//     30
		//     true
		
		System.out.printf("%f\n", 123.23);
		System.out.printf("%.2f\n", 123.23);
		System.out.printf("%.2f\n", 123.236);
		System.out.printf("%8.2f\n", 123.236);
		System.out.printf("%1.2f\n", 123.236);
		System.out.printf("%g\n", 123.236);
		System.out.printf("%1.2g   %%\n", 123.236);
		//--==>123.230000
		//     123.23
		//     123.24
		//       123.24
		//     123.24
		//     123.236
		//     1.2e+02
	}

}
