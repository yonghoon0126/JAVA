package this04;

public class BreakOutterExample {
	public static void main(String[] args) {

		Outter: 
			for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if (lower == 'g') {	// #5�� ��
					break Outter;
				}
			}
		}	// �ȿ�
		
		System.out.println("���α׷� ���� ����");

//		System.out.println("���α׷� ���� ����");
//		break;
	
	}	// �ۿ�
}
