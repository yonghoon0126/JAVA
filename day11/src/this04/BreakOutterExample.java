package this04;

public class BreakOutterExample {
	public static void main(String[] args) {

		Outter: 
			for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if (lower == 'g') {	// #5로 감
					break Outter;
				}
			}
		}	// 안에
		
		System.out.println("프로그램 실행 종료");

//		System.out.println("프로그램 실행 종료");
//		break;
	
	}	// 밖에
}
