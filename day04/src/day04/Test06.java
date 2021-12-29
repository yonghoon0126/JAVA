package day04;

public class Test06 {

	public static void main(String[] args) {
		System.out.print("AAA");
		System.out.print("BBB");
		System.out.print("CCC\n");
		//--------> AAABBBCCC

		// 서식 출력 메소드
		System.out.printf("12345678901234567890%n");//『%n』개행
		System.out.printf("%d + %d = %d\n", 10 , 20, 30);
		//12345678901234567890
		//10 + 20 = 30

		System.out.printf("%10d\n",123);
		System.out.printf("%010d\n",123);//오른쪽을 중심으로 해서 왼쪽이 공백
		System.out.printf("%-10d\n",123);//왼쪽쪽을 중심으로 해서 오른쪽이 공백
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
		//--==>(365)      <-- -365=(365)  -기호를 ()로 대체
		//      365

		//System.out.printf("%d\n", 'A');	//-- 런타임 에러 발생 / 부호가 없어서 에러
		System.out.printf("%c\n", 'A');
		System.out.printf("%s\n", "ABCD");
		//--==>A
		//     ABCD
		
		System.out.printf("%h\n", 18);//16진수
		System.out.printf("%o\n", 24);//8로 지수승
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
