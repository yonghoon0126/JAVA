package arrangement;

public class Logical10peratorExample {
	public static void main(String[] args) {

		int charCode = 'A';
		//			65>=65	&			65<=90	(T = T & T)
		if ((charCode >= 65) & (charCode <= 90)) {
			System.out.println("�빮�� �̱���.");
		}
		//			65>=97	&&			65<=122 (F = F && T)// ���ʸ� false�˻�
		if ((charCode >= 97) && (charCode <= 122)) {
			System.out.println("�ҹ��� �̱���.");
		}
		// '0' ==> 48 / '9' ==> 57
		//		!(65 < 48)	 && !(65 > 57) f'==> (true) && t'==> (false) 
		if (!(charCode < 48) && !(charCode > 57)) {
			System.out.println("0-9 ���� �̱���.");
		}

//------------------------------------------------------------------------------
		
		int value = 6;

		
		if ((value % 2 == 0) | (value % 3 == 0)) {
			System.out.println("2 �Ǵ� 3�� ��� �̱���.");
		}

		if ((value % 2 == 0) || (value % 3 == 0)) {	// ���ʸ� true�˻�
			System.out.println("2 �Ǵ� 3�� ��� �̱���.");
		}
	}

}
