package thisEx02;

public class GarbageValueExample {	//�ݺ���

	public static void main(String[] args) {
		byte var1 = 125;	//-128~+127
		int var2 = 125;

		//�ݺ��� (����Ÿ��=�ʱⰪ; ���ᰪ; ������)
		for (int i = 0; i < 5; i++) { //++i, i++ : i=i+1
			var1++;	//127+1 var1=var1+1
			var2++;	//127+1
			System.out.println("var1 : " + var1 + "\t" + "var2 : " + var2);
			
		}
	}
}
