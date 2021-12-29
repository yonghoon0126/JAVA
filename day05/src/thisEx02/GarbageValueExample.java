package thisEx02;

public class GarbageValueExample {	//반복문

	public static void main(String[] args) {
		byte var1 = 125;	//-128~+127
		int var2 = 125;

		//반복문 (변수타입=초기값; 종료값; 증가값)
		for (int i = 0; i < 5; i++) { //++i, i++ : i=i+1
			var1++;	//127+1 var1=var1+1
			var2++;	//127+1
			System.out.println("var1 : " + var1 + "\t" + "var2 : " + var2);
			
		}
	}
}
