package thisEx04;

public class SwitchExample {
	public static void main(String[]args) {
		
		int num = (int)(Math.random()*6) + 1;
		
		switch(num) {	// byte, short, char, int(o), String(o)
		
		case 1 : // boolean, long, float, double(x)
			System.out.println("1���� ���Խ��ϴ�.");
			break;
		case 2 : 
			System.out.println("2���� ���Խ��ϴ�.");
			break;
		case 3 : 
			System.out.println("3���� ���Խ��ϴ�.");
			break;
		case 4 : 
			System.out.println("4���� ���Խ��ϴ�.");
			break;
		case 5 : 
			System.out.println("5���� ���Խ��ϴ�.");
			break;
		default : 
			System.out.println("6���� ���Խ��ϴ�.");
			break;
		}
	}
}
