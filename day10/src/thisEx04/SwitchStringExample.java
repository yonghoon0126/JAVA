package thisEx04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Ű����� �޾Ƽ�
//���� - 700
//���� - 500
//�̿� - 300
//string - position

public class SwitchStringExample {
	public static void main(String[] args) throws IOException{

		// Scanner ���
//		Scanner sc = new Scanner(System.in);
//		String position = " ";
//		int money = 0;
//
//		while (true) {
//			System.out.println("[��å�� ������]");
//			position = sc.next();
//
//			if (position.equals("��")) {
//				System.out.println("����Ǿ����ϴ�.");
//				break;
//			}
//			switch (position) {
//
//			case "����":
//				money = 700;
//				break;
//
//			case "����":
//				money = 500;
//				break;
//
//			default:
//				money = 300;
//			}

			// BufferedReader ���
			
		
			
			
			String position = " ";
			int money = 0;

			BufferedReader br = 
					new BufferedReader(new InputStreamReader(System.in));

			while (true) {
				System.out.println("[��å�� ������]");
				position = br.readLine();
				
				if (position.equals("��")) {
					System.out.println("����Ǿ����ϴ�.");
					break;
				}
				switch (position) {

				case "����":
					money = 700;
					break;

				case "����":
					money = 500;
					break;

				default:
					money = 300;
				}

			
			System.out.println();
		}

	}

}
