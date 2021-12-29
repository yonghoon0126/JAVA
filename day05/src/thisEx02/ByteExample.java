package thisEx02;

public class ByteExample {	//byte의 허용 범위

	public static void main(String[] args) {
		byte var1 = -128;	//-128~127
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		// byte var6 = 128;	//컴파일 에러
		byte var6 = (byte)128;

		System.out.println(var1);	//-128
		System.out.println(var2);	//-30
		System.out.println(var3);	//0
		System.out.println(var4);	//30
		System.out.println(var5);	//127
		System.out.println(var6);	//-128
		
		
	}
}
