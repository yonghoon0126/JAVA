package thisEx02;

public class FloatDoubleExample {
	public static void main(String[] args) {
		// 실수값 저장
		double var1 = 3.14;
		// float var2 = 3.14;
		float var3 = 3.14F;

		// 정밀도 테스트
		double var4 = 0.1234567890123456789;
		float var5 = 0.123456789013456798F;

		System.out.println("var1 : " + var1); // var1 : 3.14
		System.out.println("var3 : " + var3); // var3 : 3.14
		System.out.println("var4 : " + var4); // var4 : 0.123456789012345678
		System.out.println("var5 : " + var5); // var5 : 0.123456789

		// e사용하기
		int var6 = 3000000;
		double var7 = 3e6;
		float var8 = 3e6F;
		double var9 = 2e-3;

		System.out.println("var6 : " + var6); // var6 : 3000000
		System.out.println("var7 : " + var7); // var7 : 3000000.0
		System.out.println("var8 : " + var8); // var8 : 3000000.0
		System.out.println("var9 : " + var9); // var9 : 0.002

	}

}
