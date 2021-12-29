package arrangement;

public class Logical10peratorExample {
	public static void main(String[] args) {

		int charCode = 'A';
		//			65>=65	&			65<=90	(T = T & T)
		if ((charCode >= 65) & (charCode <= 90)) {
			System.out.println("대문자 이군요.");
		}
		//			65>=97	&&			65<=122 (F = F && T)// 왼쪽만 false검사
		if ((charCode >= 97) && (charCode <= 122)) {
			System.out.println("소문자 이군요.");
		}
		// '0' ==> 48 / '9' ==> 57
		//		!(65 < 48)	 && !(65 > 57) f'==> (true) && t'==> (false) 
		if (!(charCode < 48) && !(charCode > 57)) {
			System.out.println("0-9 숫자 이군요.");
		}

//------------------------------------------------------------------------------
		
		int value = 6;

		
		if ((value % 2 == 0) | (value % 3 == 0)) {
			System.out.println("2 또는 3의 배수 이군요.");
		}

		if ((value % 2 == 0) || (value % 3 == 0)) {	// 왼쪽만 true검사
			System.out.println("2 또는 3의 배수 이군요.");
		}
	}

}
